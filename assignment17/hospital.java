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
    void patientDetails(){
        System.out.println("-------------Patient Details---------------");
        System.out.println("Id\t\tName\t\tAge\t\tDisease");
        System.out.println(id+"\t\t"+name+"\t\t"+age+"\t\t"+disease);
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
    void doctorDetails(){
        System.out.println("-------------Doctor Details---------------");
        System.out.println("Id\t\tName\t\tSpecialization");
        System.out.println(did+"\t\t"+dname+"\t\t"+sp);
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
    void medicineDetails(){
        System.out.println("-------------Medicine Details---------------");
        System.out.println("Id\t\tName\t\tPrice");
        System.out.println(mid+"\t\t"+mname+"\t\t"+price);
        }
}
class Test{
        Scanner sc=new Scanner(System.in);

        Patient arrP[]= new Patient[50];
        Doctor arrD[] = new Doctor[50];
        Medicine arrM[] = new Medicine[50];

        int a=0,b=0,c=0;

        void patient(){
    
            System.out.println("Enter Patient Details");
            System.out.print("Patient ID: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Patient name: ");
            String name=sc.nextLine();
            System.out.print("Patient age: ");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter disease name: ");
            String disease=sc.nextLine();

            arrP[a++]=new Patient(id,name,age,disease);
        }

        void doctor(){
            System.out.println("Enter Doctors details");
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
            System.out.println("Enter Medicine details");
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
        for(int i=0;i<c;i++){
            if(arrM.length==0){
                System.out.println("No medicine available");
            }else{
                arrM[i].medicineDetails();
            }
        }
        }

        void displayDoctor(){
        for(int i=0;i<b;i++){
            if(arrD.length<1){
                System.out.println("No doctor available");
            }else{
                arrD[i].doctorDetails();
            }
        }
        }

        void displayPatient(){
            for(int i=0;i<a;i++){
                if(arrP.length<1){
                System.out.println("No patients available");
            }else{
                arrP[i].patientDetails();
            }
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
            switch (choice){
                case 1:patient();break;
                case 2:doctor();break;
                case 3:medicine();break;
                case 4:displayPatient();break;
                case 5:displayDoctor();break;
                case 6:displayMedicine();break;
                case 7:{
                    System.out.println("Exiting... Thank you!");
                    return;
                }
                default:System.out.println("Invalid Input");
                break;
            }
        }
    }
}
class Main{
    public static void main(String args[]){
        Test obj=new Test();
        obj.menu();
    }
}