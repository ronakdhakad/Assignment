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
        System.out.println("Name: "+name+"\t\t Email: "+mail+"\n Age: "+age+"\t\t\t Password: "+pass);
    }
}
class Joint{
    String jname;
    int jage;
    int jAmt;
    Joint(){}
    Joint(String jname,int jage,int jAmt){
        this.jname=jname;
        this.jage=jage;
        this.jAmt=jAmt;
    }
    void jointDetails(){
        System.out.println("Spouse Name: "+jname+" Spouse Age: "+jage+"\n Account Balance: "+jAmt);
    }
}
class Saving{
    String sname;
    int sage;
    int sAmt;
    Saving(String sname,int sage,int sAmt){
        this.sname=sname;
        this.sage=sage;
        this.sAmt=sAmt;
    }
    void savingDetails(){
        System.out.println("Nominee Name: "+sname+" Nominee Age: "+sage+"\n Account Balance: "+sAmt);
    }
}
class Child{
    String cname;
    int cage;
    int cAmt;
    Child(String cname,int cage,int cAmt){
        this.cname=cname;
        this.cage=cage;
        this.cAmt=cAmt;
    }
    void childDetails(){
        System.out.println("Child Name: "+cname+" Child Age: "+cage+"\n Account Balance: "+cAmt);
    }
}
class Display{
            Joint jointAcc;  
            Saving savingAcc; 
            Child childAcc; 
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
        Scanner sc=new Scanner (System.in);

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
            jointAcc=new Joint(jname,jage,jAmt);
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
            savingAcc=new Saving(sname,sage,sAmt);
        }

        void getChild(){
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
            childAcc=new Child(cname,cage,cAmt);
        }

        void MenuA(){
            System.out.println(".............Choose Account Type.............");
            System.out.println("");
            System.out.println("A.Joint Account");
        
            System.out.println();
            System.out.println("B.Saving Account");

            System.out.println();
            System.out.println("C.Child Account");
        }
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            
            System.out.println("<<<<<<< Welcome To ApnaBank >>>>>>>");
                System.out.println("Enter Account Holder Name");
                String name= sc.nextLine();
                System.out.println("Enter mail-Id");
                String mail= sc.nextLine();
                sc.nextLine();
                System.out.println("Enter age");
                int age= sc.nextInt();
                sc.nextLine();
                System.out.println("Enter password");
                String pass= sc.nextLine();
            
            AccountHolder accountHolder=new AccountHolder(name,mail,age,pass);

            Display obj=new Display();
            obj.MenuA();
            System.out.println("Enter Account Type");
            char ch=sc.next().toLowerCase().charAt(0);
            System.out.println("");
            switch(ch){
                case 'a':obj.getSpouse();break;
                case 'b':obj.getNominee();break;
                case 'c':obj.getChild();break;
                default:System.out.println("Enter valid input");
            }

            System.out.println("A.____________Deposit_______________");
            System.out.println("B.____________Withdraw______________");
    
            System.out.println("Choose account to deposit the amount");
            char check= sc.next().toLowerCase().charAt(0);
            
            int Amt=0;
            if(check=='a'){
                System.out.println("Enter Deposite amount:");
                Amt=sc.nextInt();
            }else if(check =='b'){
                System.out.println("Enter Withdraw amount:");
                Amt=sc.nextInt();
            }else{
                System.out.println("Invalid Input Please re-enter Transaction");
                char checks= sc.next().toLowerCase().charAt(0);

                if(checks=='a'){
                    System.out.println("Enter amount:");
                    Amt=sc.nextInt();
                }else if(checks =='b'){
                    System.out.println("Enter amount:");
                    Amt=sc.nextInt();
                }else{
                    System.out.println("Warning: you entered wrong input many times \n Your Don't do transactions.");
                }
            }
            accountHolder.accountHolderDetails();

            if(ch=='a'&& obj.jointAcc != null){
                obj.jointAcc.jointDetails();
            }else if(ch=='b'&& obj.savingAcc != null){
                obj.savingAcc.savingDetails();
            }else if(ch=='c'&& obj.childAcc != null){
                obj.childAcc.childDetails();
            }

            System.out.println("Transactions");
            if(ch=='a'){
                if(check=='a'){
                    obj.jointAcc.jAmt +=Amt;
                    System.out.println("+++++ After Deposite +++++\n Balance: "+obj.jointAcc.jAmt);
                }else{
                    obj.jointAcc.jAmt -=Amt;
                    System.out.println("----- After Withdraw -----\n Balanace: "+obj.jointAcc.jAmt);
                }
            }else if(ch=='b'){
                if(check=='a'){
                    obj.savingAcc.sAmt +=Amt;
                    System.out.println("+++++ After Deposite +++++\n Balance: "+obj.savingAcc.sAmt );
                }else{
                    obj.savingAcc.sAmt -=Amt;
                    System.out.println("----- After Withdraw -----\n Balanace: "+obj.savingAcc.sAmt );
                }
            }else{
                if(check=='a'){
                    obj.childAcc.cAmt +=Amt;
                    System.out.println("+++++ After Deposite +++++\n Balance: "+obj.childAcc.cAmt);
                }else{
                    obj.childAcc.cAmt-=Amt;
                    System.out.println("----- After Withdraw -----\n Balanace: "+obj.childAcc.cAmt);
                }
            }
        }
    }