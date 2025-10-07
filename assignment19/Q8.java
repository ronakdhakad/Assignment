/*
8. Hospital Management System

Design a class Hospital with a non-static inner class Patient. Each patient should have a name, age, and illness. The Hospital class should:

· Admit new patients

· Discharge patients

· Display patient records

Add a static nested class HealthStats to:

· Calculate average age

· List common illnesses
 */
import java.util.*;

class Hospital {
    Patient[] patients = new Patient[10];
    int patientCount = 0;

    
    void admitPatient(String name, int age, String illness) {
        patients[patientCount] = new Patient(name, age, illness);
        patientCount++;
    }

   
    void dischargePatient(String name) {
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].name.equalsIgnoreCase(name)) {
                for (int j = i; j < patientCount - 1; j++) {
                    patients[j] = patients[j + 1];
                }
                patients[patientCount - 1] = null;
                patientCount--;
                System.out.println(name + " has been discharged.");
                return;
            }
        }
        System.out.println("Patient not found: " + name);
    }

    // Display all patients
    void displayPatients() {
        System.out.println("\nPatient Records:");
        for (int i = 0; i < patientCount; i++) {
            patients[i].display();
        }
    }

    class Patient {
        String name;
        int age;
        String illness;

        Patient(String name, int age, String illness) {
            this.name = name;
            this.age = age;
            this.illness = illness;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age + ", Illness: " + illness);
        }
    }

    // static nested class HealthStats
    static class HealthStats {
        // average age
        static double averageAge(Hospital.Patient[] patients, int count) {
            if (count == 0) return 0;
            int sum = 0;
            for (int i = 0; i < count; i++) {
                sum += patients[i].age;
            }
            return (double) sum / count;
        }

        // list common illnesses
        static void listCommonIllnesses(Hospital.Patient[] patients, int count) {
            System.out.println("\nList of Illnesses:");
            for (int i = 0; i < count; i++) {
                System.out.println(patients[i].illness);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Hospital h = new Hospital();

        // Admit patients
        h.admitPatient("John", 30, "Fever");
        h.admitPatient("Emma", 25, "Cold");
        h.admitPatient("Raj", 40, "Fever");

        h.displayPatients();

        // Discharge a patient
        h.dischargePatient("Emma");
        h.displayPatients();

        // Stats
        System.out.println("\nAverage Age: " + Hospital.HealthStats.averageAge(h.patients, h.patientCount));
        Hospital.HealthStats.listCommonIllnesses(h.patients, h.patientCount);
    }
}
