package com.bl.day2.messagingpatternanalyzer;

public interface MessageFilter<T> {
	boolean filter(T message);
}
