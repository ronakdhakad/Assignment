<<<<<<< HEAD
import java.util.Scanner;
class AccountHolder{
    String name;
    String mail;
    int age;
    String pass;

    AccountHolder(String name,String mail,int age,String pass){
        this.name=name;
        this.mail=mail;
        this.age=age;
        this.pass=pass;
    }
    void accountHolderDetails(){
        System.out.println("~~~~~~~~~~~~ Account Holder Details ~~~~~~~~~~~");
        System.out.println("Name: "+name+" Email "+mail+" age "+age+" pass "+pass);
    }
}
class Joint extends AccountHolder{
    String jname;
    int jage;
    int jAmt;
    Joint(String name,String mail,int age,String pass,String jname,int jage,int jAmt){
        super(name,mail,age,pass);
        this.jname=jname;
        this.jage=jage;
        this.jAmt=jAmt;
    }
    void jointDetails(){
        System.out.println("~~~~~~~~~~~~ Account Holder Details ~~~~~~~~~~~");
        System.out.println("Name: "+name+" Email: "+mail+" Age: "+age+" Password: "+pass);
        System.out.println("~~~~~~~~~~~~ Joint Account Details ~~~~~~~~~~~");
        System.out.println("Spouse Name: "+name+" Spouse Age: "+age);
    }
}
class Saving extends AccountHolder{
    String sname;
    int sage;
    int sAmt;
    Saving(String name,String mail,int age,String pass,String jname,int jage,int sAmt){
        super(name,mail,age,pass);
        this.sname=sname;
        this.sage=sage;
        this.sAmt=sAmt;
    }
}
class Child extends AccountHolder{
    String fname;
    int fage;
    int cAmt;
    Child(String name,String mail,int age,String pass,String fname,int fage,int cAmt){
        super(name,mail,age,pass);
        this.fname=fname;
        this.fage=fage;
        this.cAmt=cAmt;
    }
}
class Display{
        Scanner sc=new Scanner (System.in);
        
        void getHolderDetails(){
        System.out.println("<<<<<<< Welcome To ApnaBank >>>>>>>");
        System.out.println("Enter Account Holder Name");
        String name= sc.nextLine();
        System.out.println("Enter mail-Id");
        String mail= sc.nextLine();
        sc.nextLine();
        System.out.println("Enter age");
        int age= sc.nextInt();
        System.out.println("Enter password");
        String pass= sc.nextLine();

        AccountHolder aobj=new AccountHolder(name,mail,age,pass);
        }
        void getSpouse(){
            System.out.println("Enter Spouse Name");
            String jname= sc.nextLine();
            sc.nextLine();
            System.out.println("Enter age of Spouse");
            int jage= sc.nextInt();
            System.out.println("Deposite Security Amount");
            int jAmt= sc.nextInt();
            if(jAmt<=5000){
                System.out.println("Minimum Security Amount for opening Accout is 5000");
                System.out.println("# Please re-deposite security Amount ");
                jAmt=sc.nextInt();
            }
            Joint jobj=new Joint(jname,jage,jAmt);
        }
        void getNominee(){
            System.out.println("Enter Nominee name");
            String sname= sc.nextLine();
            sc.nextLine();
            System.out.println("Enter Nominee age");
            int sage= sc.nextInt();
            System.out.println("Deposite Security Amount");
            int sAmt= sc.nextInt();
            if(sAmt<=2000){
                System.out.println("Minimum Security Amount for opening Accout is 2000");
                System.out.println("# Please re-deposite security Amount ");
                sAmt=sc.nextInt();
            }
            Saving sobj=new Saving(name,mail,age,pass,sname,sage,sAmt);
        }
        void getChild(){
            System.out.println("Enter father's name");
            String sname= sc.nextLine();
            sc.nextLine();
            System.out.println("Enter father's age");
            int sage= sc.nextInt();
            System.out.println("Deposite Security Amount");
            int cAmt= sc.nextInt();
            if(cAmt<=1000){
                System.out.println("Minimum Security Amount for opening Accout is 1000");
                System.out.println("# Please re-deposite security Amount ");
                cAmt=sc.nextInt();
            }
            Child cobj=new Child(name,mail,age,pass,cname,cage,cAmt);
        }
        void MenuA(){
            System.out.println("");
            System.out.println("A.Joint Account");
            System.out.println("\t1.Details of spouse");
            System.out.println("\t2.Age of spouse");
            System.out.println("\t3.Minimum amount to be deposited 5000/-");
            System.out.println();
            System.out.println("B.Saving Account");
            System.out.println("\t1.Nominee name");
            System.out.println("\t2.Nominee age");
            System.out.println("\t3.Minimum amount to be deposited 2000/-");
            System.out.println();
            System.out.println("C.Child Account");
            System.out.println("\t1.Child Name");
            System.out.println("\t2.Guardian/Father’s age");
            System.out.println("\t3.Minimum amount to be deposited 1000/-");
            System.out.println("Enter Account Type");
            char ch=sc.next().UpperCase().charAt(0);
            // System.out.println("");

            switch(ch){
                case 'A':getSpouse();break;
                case 'B':getNominee();break;
                case 'C':getNominee();break;
                default:System.out.println("Enter valid input");
            }

        }

        void MenuB(){
            System.out.println("A.Deposit");
            System.out.println("\t1.Joint Account");
            System.out.println("\t2.Saving Account");
            System.out.println("\t3.Child Account");
            System.out.println("B.Withdraw");
            System.out.println("\t1.Joint Account");
            System.out.println("\t2.Saving Account");
            System.out.println("\t3.Child Account");

            // String check= sc.nextLine();
            // if(check!='A'||check!='a'||check!='B'||check!='b'){
            //     System.out.println("Enter valid input");
            // }else if(check!='A'||check!='a'){
            //     System.out.println("Choose account to deposit the amount");
            //     int n=sc.nextInt();
            //     if(n==1){

            //     }
            //     System.out.println("Enter password");
            //     int pass=sc.nextInt();
            //     if(pass==password)
            // }

        }
}
class Main{
    public static void main(String args[]){
        Display obj=new Display();
        obj.getHolderDetails();
        obj.MenuA();
        obj.MenuB();
=======
class Joint{
    String email;
    String password;
    String name;
    int age;
    int jAmt=5000;

    void Joint(String email,String password,String name,int age){
        this.email=email;
        this.password=password;
        this.name=name;
        this.age=age;
    }
}
class Saving{
    String email;
    String password;
    String name;
    int age;
    int jAmt=2000;
    void Saving(String email,String password,String name,int age){
        this.email=email;
        this.password=password;
        this.name=name;
        this.age=age;
    }
}
class Child{
    String email;
    String password;
    String name;
    int age;
    int cAmt=1000;

    void Child(String email,String password,String name,int age){
        this.email=email;
        this.password=password;
        this.name=name;
        this.age=age;
    }
}
class Main{
    public static void main(String args[]){
        System.out.println("");
>>>>>>> 3551df3 (remote)
    }
}
