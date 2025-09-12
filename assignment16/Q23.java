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
        System.out.println("~~~~~~~~~~ Account Holder Details ~~~~~~~~~");
        System.out.println("Name: "+name+" Email "+mail+"\n age "+age+" pass "+pass);
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
        System.out.println("Spouse Name: "+jname+" Spouse Age: "+jage+"\n Account Balance: "+jAmt);
    }
}
class Saving extends AccountHolder{
    String sname;
    int sage;
    int sAmt;
    Saving(String name,String mail,int age,String pass,String sname,int sage,int sAmt){
        super(name,mail,age,pass);
        this.sname=sname;
        this.sage=sage;
        this.sAmt=sAmt;
    }
    void jointDetails(){
        System.out.println("Nominee Name: "+sname+" Nominee Age: "+sage+"\n Account Balance: "+sAmt);
    }
}
class Child extends AccountHolder{
    String cname;
    int cage;
    int cAmt;
    Child(String name,String mail,int age,String pass,String cname,int cage,int cAmt){
        super(name,mail,age,pass);
        this.cname=cname;
        this.cage=cage;
        this.cAmt=cAmt;
    }
    void jointDetails(){
        System.out.println("Child Name: "+cname+" Child Age: "+cage+"\n Account Balance: "+cAmt);
    }
}
class Display{
        Scanner sc=new Scanner (System.in);
        
        void getHolderDetails(){
            System.out.println("Enter Account Holder Name");
            String name= sc.nextLine();
            sc.nextLine();
            System.out.println("Enter mail-Id");
            String mail= sc.nextLine();
            sc.nextLine();
            System.out.println("Enter age");
            int age= sc.nextInt();
            System.out.println("Enter password");
            String pass= sc.nextLine();
            AccountHolder accountHolder=new AccountHolder(name,mail,age,pass);
                accountHolder.accountHolderDetails();
        }
        void getSpouse(){
            getHolderDetails();
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
            jobj.jointDetails();
        }
        void getNominee(){
            getHolderDetails();
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
            Saving sobj=new Saving(sname,sage,sAmt);
            
        }
        void getChild(){
            getHolderDetails();
            System.out.println("Enter father's name");
            String cname= sc.nextLine();
            sc.nextLine();
            System.out.println("Enter father's age");
            int cage= sc.nextInt();
            System.out.println("Deposite Security Amount");
            int cAmt= sc.nextInt();
            if(cAmt<=1000){
                System.out.println("Minimum Security Amount for opening Accout is 1000");
                System.out.println("# Please re-deposite security Amount ");
                cAmt=sc.nextInt();
            }
            Child cobj=new Child(cname,cage,cAmt);
        }
        void MenuA(){
            System.out.println("<<<<<<< Welcome To ApnaBank >>>>>>>");
            System.out.println("");
            System.out.println("A.Joint Account");
        
            System.out.println();
            System.out.println("B.Saving Account");

            System.out.println();
            System.out.println("C.Child Account");

            System.out.println("Enter Account Type");
            char ch=sc.next().toLowerCase().charAt(0);
            // System.out.println("");
            
            switch(ch){
                case 'a':getSpouse();break;
                case 'b':getNominee();break;
                case 'c':getChild();break;
                default:System.out.println("Enter valid input");
            }

        }

        // void MenuB(){
        //     System.out.println("A.Deposit");
        //     System.out.println("\t1.Joint Account");
        //     System.out.println("\t2.Saving Account");
        //     System.out.println("\t3.Child Account");
        //     System.out.println("B.Withdraw");
        //     System.out.println("\t1.Joint Account");
        //     System.out.println("\t2.Saving Account");
        //     System.out.println("\t3.Child Account");

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

        // }
}
class Main{

            //for color
            public static final String BLACK = "\u001B[90m";
            public static final String RED = "\u001B[91m";
            public static final String GREEN = "\u001B[92m";
            public static final String YELLOW = "\u001B[93m";
            public static final String BLUE = "\u001B[94m";
            public static final String PURPLE = "\u001B[95m";
            public static final String CYAN = "\u001B[96m";
            public static final String WHITE = "\u001B[97m";

            //for backgroud color
            public static final String BG_BLACK = "\u001B[40m";
            public static final String BG_RED = "\u001B[41m";
            public static final String BG_GREEN = "\u001B[42m";
            public static final String BG_YELLOW = "\u001B[43m";
            public static final String BG_BLUE = "\u001B[44m";
            public static final String BG_PURPLE = "\u001B[45m";
            public static final String BG_CYAN = "\u001B[46m";
            public static final String BG_WHITE = "\u001B[47m";


            public static void main(String args[]){
            Display obj=new Display();
            obj.MenuA();
            // obj.getHolderDetails();
            // obj.MenuB();
            }
        }
// =======
// class Joint{
//     String email;
//     String password;
//     String name;
//     int age;
//     int jAmt=5000;

//     void Joint(String email,String password,String name,int age){
//         this.email=email;
//         this.password=password;
//         this.name=name;
//         this.age=age;
//     }
// }
// class Saving{
//     String email;
//     String password;
//     String name;
//     int age;
//     int jAmt=2000;
//     void Saving(String email,String password,String name,int age){
//         this.email=email;
//         this.password=password;
//         this.name=name;
//         this.age=age;
//     }
// }
// class Child{
//     String email;
//     String password;
//     String name;
//     int age;
//     int cAmt=1000;

//     void Child(String email,String password,String name,int age){
//         this.email=email;
//         this.password=password;
//         this.name=name;
//         this.age=age;
//     }
// }
// class Main{
//     public static void main(String args[]){
//         System.out.println("");
// >>>>>>> 3551df3 (remote)
//     }
// }
