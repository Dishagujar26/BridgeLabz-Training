package com.bl.functionalinterface.markerinterface.dataserialization;
public class BackupMain {
    public static void main(String[] args) {

        UserData data = new UserData();

        if (data instanceof Backupable) {
            System.out.println("Eligible for backup");
        } else {
            System.out.println("Not eligible for backup");
        }
    }
}
