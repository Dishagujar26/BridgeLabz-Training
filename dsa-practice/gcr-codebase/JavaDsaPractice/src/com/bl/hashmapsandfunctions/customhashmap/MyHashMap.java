package com.bl.hashmapsandfunctions.customhashmap;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashMap<K, V> {
	private int capacity = 16;
	private LinkedList<Node<K, V>>[] table;

	//@SuppressWarnings("unchecked") handles a compile-time warning
	@SuppressWarnings("unchecked")
	public MyHashMap() {
		//Java does NOT allow direct creation of generic arrays, so this line causes an unchecked assignment warning.
		table = new LinkedList[capacity];
		for (int i = 0; i < capacity; i++) {
			table[i] = new LinkedList<>();
		}
	}

	// Hash function
	private int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}

	// Insert or update
	public void put(K key, V value) {
		int index = hash(key);
		LinkedList<Node<K, V>> bucket = table[index];

		for (Node<K, V> node : bucket) {
			if (node.key.equals(key)) {
				node.value = value; // update
				return;
			}
		}
		bucket.add(new Node<>(key, value));
	}

	// Get value by key
	public V get(K key) {
		int index = hash(key);
		LinkedList<Node<K, V>> bucket = table[index];

		for (Node<K, V> node : bucket) {
			if (node.key.equals(key))
				return node.value;
		}
		return null;
	}

	// Remove key
	public void remove(K key) {
		int index = hash(key);
		LinkedList<Node<K, V>> bucket = table[index];
		Iterator<Node<K, V>> it = bucket.iterator();

		while (it.hasNext()) {
			Node<K, V> node = it.next();
			if (node.key.equals(key)) {
				it.remove();
				return;
			}
		}
	}

	// Display map
	public void display() {
		for (int i = 0; i < capacity; i++) {
			LinkedList<Node<K, V>> bucket = table[i];
			if (!bucket.isEmpty()) {
				System.out.print("Bucket " + i + ": ");
				for (Node<K, V> node : bucket) {
					System.out.print("[" + node.key + "=" + node.value + "] ");
				}
				System.out.println();
			}
		}
	}
}
