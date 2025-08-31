import java.util.Scanner;
class Patient{
    int age;
    String disease;
    int id;
    String name;
    void patient(int id ,String name,int age,String disease){
        this.id=id;
        this.name=name;
        this.age=age;
        this.disease=disease;
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
    void doctor(int did ,String dname,String sp){
        this.did=did;
        this.dname=dname;
        this.sp=sp;
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
    void medicine(int mid ,String mname,int price){
        this.mid=mid;
        this.mname=mname;
        this.price=price;
        System.out.println("----Medicine details----");
        System.out.println("Name of medicine is: "+mname);
        System.out.println("Medicine id: "+mid);
        System.out.println("Medicine price: "+price);
    }
}
class H{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
    
        System.out.println("---Patient Details---: ");
        System.out.print("Patient ID: ");
        int id=sc.nextInt();
        System.out.print("Patient name: ");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.print("Patient age: ");
        int age=sc.nextInt();
        System.out.print("Enter disease name: ");
        sc.nextLine();
        String disease=sc.nextLine();
        Patient pobj=new Patient();

        System.out.println("---Doctors details---: ");
        System.out.print("Doctor's ID: ");
        int did=sc.nextInt();
        System.out.print("Enter doctor's name: ");
        sc.nextLine();
        String dname=sc.nextLine();
        System.out.print("Doctors Specialization: ");
        String sp=sc.nextLine();
        sc.nextLine();
        Doctor dobj=new Doctor();

        System.out.println("---Medicine details---");
        System.out.print("Enter medicine ID: ");
        int mid=sc.nextInt();
        System.out.print("Enter medicine name: ");
        sc.nextLine();
        String mname=sc.nextLine();
        System.out.print("Enter price of medicine: ");
        int price=sc.nextInt();
        Medicine mobj=new Medicine();

        System.out.print("How many patient: ");
        int psize=sc.nextInt();
        Patient arrP[]=new Patient[psize];

        System.out.print("How many doctor: ");
        int dsize=sc.nextInt();
        Doctor arrD[]=new Doctor[dsize];

        System.out.print("Quantity of medicine: ");
        int msize=sc.nextInt();
        Medicine arrM[]=new Medicine[msize];

        // pobj.patient(id,name,age,disease);
        // dobj.doctor(did,dname,sp);
        // mobj.medicine(mid,mname,price);

        for(int i=0;i<=arrM.length;i++){
            arrM[i]=new Medicine();
            arrM[i]medicine(mid,mname,price);
        }

        // for(int i=0;i<=arrM.length;i++){
        //     arrM[i].showMethod();
        // }
    }
}