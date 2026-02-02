package com.bl.functionalinterface.markerinterface.custommarkerinterface;
public class EncryptionMain {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        if (acc instanceof Sensitive) {
            System.out.println("Encrypt this data");
        } else {
            System.out.println("No encryption needed");
        }
    }
}
