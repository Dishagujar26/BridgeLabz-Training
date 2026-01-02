package com.bl.encapsulation.hospitalpatientmanagement;

public class HospitalSystem {

    public static void main(String[] args) {

        Patient[] patients = {
            new InPatient(101, "Ravi", 45, 5, 3000),
            new OutPatient(102, "Anita", 30, 800)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: ₹" + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) p;
                record.addRecord("Routine Checkup Done");
                record.viewRecords();
            }

            System.out.println();
        }
    }
}
