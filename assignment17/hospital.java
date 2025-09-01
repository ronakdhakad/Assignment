import java.util.Scanner;
class Patient{
    int age;
    String disease;
    int id;
    String name;
    Patient(int id ,String name,int age,String disease){
        this.id=id;
        this.name=name;
        this.age=age;
        this.disease=disease;
        }
    void display(){
        System.out.println("----Patient details----");
        System.out.println("Patient name: "+name);
        System.out.println("Patient id: "+id);
        System.out.println("Patient age: "+age);
        System.out.println("Patient disease: "+disease);
        }
}
class Doctor{
    int did;
    String dname;
    String sp;
    Doctor(int did ,String dname,String sp){
        this.did=did;
        this.dname=dname;
        this.sp=sp;
    }
    void display(){
        System.out.println("----Doctor's details----");
        System.out.println("Name of doctor: "+dname);
        System.out.println("Doctor id: "+did);
        System.out.println("Doctor's specialization: "+sp);
    }
}
class Medicine{
    int mid;
    String mname;
    int price;
    Medicine(int mid ,String mname,int price){
        this.mid=mid;
        this.mname=mname;
        this.price=price;
    }
    void display(){
        System.out.println("----Medicine details----");
        System.out.println("Name of medicine is: "+mname);
        System.out.println("Medicine id: "+mid);
        System.out.println("Medicine price: "+price);
    }
}
class H{
        Scanner sc=new Scanner(System.in);

        Patient[] arrP= new Patient[3];
        Doctor[] arrD = new Doctor[3];
        Medicine[] arrM = new Medicine[3];

        int a=0,b=0,c=0;
        void patient(){
        System.out.println("---Patient Details---: ");
        System.out.print("Patient ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Patient name: ");
        String name=sc.nextLine();
        System.out.print("Patient age: ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter disease name: ");
        sc.nextLine();
        String disease=sc.nextLine();
        arrP[a++]=new Patient(id,name,age,disease);
        }

        void doctor(){
        System.out.println("---Doctors details---: ");
        System.out.print("Doctor's ID: ");
        int did=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter doctor's name: ");
        String dname=sc.nextLine();
        System.out.print("Doctors Specialization: ");
        String sp=sc.nextLine();
        arrD[b++]=new Doctor(did,dname,sp);
        }

        void medicine(){
        System.out.println("---Medicine details---");
        System.out.print("Enter medicine ID: ");
        int mid=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter medicine name: ");
        String mname=sc.nextLine();
        System.out.print("Enter price of medicine: ");
        int price=sc.nextInt();
        arrM[c++]=new Medicine(mid,mname,price);
        }

        void displayMedicine(){
            medicine();
        for(int i=0;i<c;i++){
            arrM[i].display();
        }
        }

        void displayDoctor(){
            doctor();
        for(int i=0;i<b;i++){
            arrD[i].display();
        }
        }

        void displayPatient(){
            patient();
        for(int i=0;i<a;i++){
            arrP[i].display();
        }
        }
        void menu(){
            while(true){
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
                case 1:patient();
                case 2:doctor();
                case 3:medicine();
                case 4:displayPatient();
                case 5:displayDoctor();
                case 6:displayMedicine();
                case 7:{
                    System.out.println("Exiting... Thank you!");
                    return;
                }
            }
        }
        } 
}
class Main{
    public static void main(String args[]){
        H Hobj=new H();
        Hobj.menu();
    }
}