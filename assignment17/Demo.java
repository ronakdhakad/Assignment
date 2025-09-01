import java.util.Scanner;

// ================= Patient Class =================
class Patient {
    int id;
    String name;
    int age;
    String disease;

    void setData(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    void display() {
        System.out.println("Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease);
    }
}

// ================= Doctor Class =================
class Doctor {
    int id;
    String name;
    String specialization;

    void setData(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Doctor ID: " + id + ", Name: " + name + ", Specialization: " + specialization);
    }
}

// ================= Medicine Class =================
class Medicine {
    int id;
    String name;
    double price;

    void setData(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Medicine ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}

// ================= Hospital Management Class =================
class H {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Arrays to hold objects
    Patient[] patients = new Patient[100];
    Doctor[] doctors = new Doctor[100];
    Medicine[] medicines = new Medicine[100];

    int patientCount = 0, doctorCount = 0, medicineCount = 0;

    // ------------ Add New Entries ------------
    void addPatient() {
        Patient p = new Patient();
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        p.setData(id, name, age, disease);
        patients[patientCount++] = p;
        System.out.println("Patient added successfully!");
    }

    void addDoctor() {
        Doctor d = new Doctor();
        System.out.print("Enter Doctor ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();

        d.setData(id, name, specialization);
        doctors[doctorCount++] = d;
        System.out.println("Doctor added successfully!");
    }

    void addMedicine() {
        Medicine m = new Medicine();
        System.out.print("Enter Medicine ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        m.setData(id, name, price);
        medicines[medicineCount++] = m;
        System.out.println("Medicine added successfully!");
    }

    // ------------ Display Entries ------------
    void displayPatients() {
        System.out.println("\n--- List of Patients ---");
        for (int i = 0; i < patientCount; i++) {
            patients[i].display();
        }
    }

    void displayDoctors() {
        System.out.println("\n--- List of Doctors ---");
        for (int i = 0; i < doctorCount; i++) {
            doctors[i].display();
        }
    }

    void displayMedicines() {
        System.out.println("\n--- List of Medicines ---");
        for (int i = 0; i < medicineCount; i++) {
            medicines[i].display();
        }
    }

    // ------------ Main Menu ------------
    void menu() {
        while (true) {
            System.out.println("\n==== Hospital Management System ====");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Medicine");
            System.out.println("4. Display Patients");
            System.out.println("5. Display Doctors");
            System.out.println("6. Display Medicines");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addPatient();
                case 2 -> addDoctor();
                case 3 -> addMedicine();
                case 4 -> displayPatients();
                case 5 -> displayDoctors();
                case 6 -> displayMedicines();
                case 7 -> {
                    System.out.println("Exiting... Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
    hm.menu();

    // ------------ Main Method ------------
    }
}
