import java.util.Scanner;
import java.time.LocalDate;
class Details{
        public static final String RESET = "\u001B[0m";

    // Regular Colors
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Bold Colors
    public static final String BLACK_BOLD = "\u001B[1;30m";
    public static final String RED_BOLD = "\u001B[1;31m";
    public static final String GREEN_BOLD = "\u001B[1;32m";
    public static final String YELLOW_BOLD = "\u001B[1;33m";
    public static final String BLUE_BOLD = "\u001B[1;34m";
    public static final String PURPLE_BOLD = "\u001B[1;35m";
    public static final String CYAN_BOLD = "\u001B[1;36m";
    public static final String WHITE_BOLD = "\u001B[1;37m";

    // Background Colors
    public static final String BLACK_BG = "\u001B[40m";
    public static final String RED_BG = "\u001B[41m";
    public static final String GREEN_BG = "\u001B[42m";
    public static final String YELLOW_BG = "\u001B[43m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String PURPLE_BG = "\u001B[45m";
    public static final String CYAN_BG = "\u001B[46m";
    public static final String WHITE_BG = "\u001B[47m";

    String name;
    int mob;
    int guest;
    Details(String n,int m,int g){
        name=n;
        mob=m;
        guest=g;
    }

    void showCustomer(){
        System.out.printf(WHITE_BOLD+BLUE_BG+"%s%n","``````````````Customer Details`````````````````"+RESET);
        System.out.printf(CYAN_BG+RED_BG+"%-30s%-20s%s%n","Customer Name:",name,""+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%-20s%s%n","MOB :",mob,""+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%-20s%s%n","No. of Guest :",guest,""+RESET);
    }
}
class forLadies{
            public static final String RESET = "\u001B[0m";

    // Regular Colors
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Bold Colors
    public static final String BLACK_BOLD = "\u001B[1;30m";
    public static final String RED_BOLD = "\u001B[1;31m";
    public static final String GREEN_BOLD = "\u001B[1;32m";
    public static final String YELLOW_BOLD = "\u001B[1;33m";
    public static final String BLUE_BOLD = "\u001B[1;34m";
    public static final String PURPLE_BOLD = "\u001B[1;35m";
    public static final String CYAN_BOLD = "\u001B[1;36m";
    public static final String WHITE_BOLD = "\u001B[1;37m";

    // Background Colors
    public static final String BLACK_BG = "\u001B[40m";
    public static final String RED_BG = "\u001B[41m";
    public static final String GREEN_BG = "\u001B[42m";
    public static final String YELLOW_BG = "\u001B[43m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String PURPLE_BG = "\u001B[45m";
    public static final String CYAN_BG = "\u001B[46m";
    public static final String WHITE_BG = "\u001B[47m";
    void plate(){
        System.out.printf(WHITE_BG+RED_BOLD+"%-5s%-20s%n","","````~~~___Only For Ladies___~~~````   "+RESET);
        System.out.printf(BLUE_BOLD+YELLOW_BG+"%-25s%-15s%n","A" ,"Rs 250/-         "+RESET);
        System.out.printf(BLUE_BOLD+WHITE_BG+"%-25s%-15s%n","1 Soup or" ,"1 Starter         "+RESET);
        System.out.printf(BLUE_BOLD+WHITE_BG+"%-25s%-15s%n","  Welcome Drink","1 Sweet Dish     "+RESET);
        System.out.printf(BLUE_BOLD+WHITE_BG+"%-25s%-15s%n","1 Snacks","1 Tea or Coffee   "+RESET);

        System.out.printf(BLUE_BOLD+YELLOW_BG+"%-25s%-15s%n","B" ,"Rs 300/-         "+RESET);
        System.out.printf(BLUE_BOLD+WHITE_BG+"%-25s%-15s%n","1 Soup or" ,"1 Starter         "+RESET);
        System.out.printf(BLUE_BOLD+WHITE_BG+"%-25s%-15s%n","  Welcome Drink","1 Sweet Dish     "+RESET);
        System.out.printf(BLUE_BOLD+WHITE_BG+"%-25s%-15s%n","2 Snacks","1 Tea or Coffee   "+RESET);

        System.out.printf(BLUE_BOLD+YELLOW_BG+"%-25s%-15s%n","C" ,"Rs 350/-         "+RESET);
        System.out.printf(BLUE_BOLD+WHITE_BG+"%-25s%-15s%n","1 Soup or" ,"1 Paneer Starter"+RESET);
        System.out.printf(BLUE_BOLD+WHITE_BG+"%-25s%-15s%n","  Welcome Drink","1 Sweet Dish     "+RESET);
        System.out.printf(BLUE_BOLD+WHITE_BG+"%-25s%-15s%n","2 Snacks","1 Tea or Ice-Cream"+RESET);
    
    }
}
class BreakFast{
    public static final String RESET = "\u001B[0m";
    public static final String BLACK_BG = "\u001B[40m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLUE_BG = "\u001B[44m";
    void platePrice(){

        System.out.printf(BLUE_BG+WHITE+"%20s%-20s%n","" ,"`BREAKFAST MENU`", " "+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","A Rs 200/-" ,"B Rs 230/-", "C Rs 250/-"+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","1 Poha" ,"1 Poha", "1 Poha"+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","1 Jalebi","1 Jalebi","1 Jalebi"+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","1 Bread Item","1 Bread Item", "1 Bread Item"+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","1 Tea or","1 Heavy Snacks","2 Heavy Snacks\n"+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","  coffee","1 Tea or coffee","1 Tea or coffee\n"+RESET);

        Scanner sc =new Scanner(System.in);
        System.out.printf(WHITE+BLUE_BG+"%s%n","~~~~~~~~~~~~~~~~~~~~ Select Thali ~~~~~~~~~~~~~~~~~~"+RESET);
        char ch=sc.next().toLowerCase().charAt(0);
    }
}
class Veg{

    public static final String RESET = "\u001B[0m";

    // Regular Colors
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Bold Colors
    public static final String BLACK_BOLD = "\u001B[1;30m";
    public static final String RED_BOLD = "\u001B[1;31m";
    public static final String GREEN_BOLD = "\u001B[1;32m";
    public static final String YELLOW_BOLD = "\u001B[1;33m";
    public static final String BLUE_BOLD = "\u001B[1;34m";
    public static final String PURPLE_BOLD = "\u001B[1;35m";
    public static final String CYAN_BOLD = "\u001B[1;36m";
    public static final String WHITE_BOLD = "\u001B[1;37m";

    // Background Colors
    public static final String BLACK_BG = "\u001B[40m";
    public static final String RED_BG = "\u001B[41m";
    public static final String GREEN_BG = "\u001B[42m";
    public static final String YELLOW_BG = "\u001B[43m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String PURPLE_BG = "\u001B[45m";
    public static final String CYAN_BG = "\u001B[46m";
    public static final String WHITE_BG = "\u001B[47m";


    Scanner sc =new Scanner(System.in);
    void thaliPrice(){
        System.out.printf(WHITE_BOLD+BLUE_BG+"%-30s%s%n","Thali Name","Price    "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","A","Rs. 310/-"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","B","Rs. 360/-"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","C","Rs. 410/-"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","D","Rs. 470/-"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","E","Rs. 600/-"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","F","Rs. 700/-"+RESET);

        System.out.printf(WHITE_BOLD+BLUE_BG+"%s%n","~~~~~~~~~~~~~~~~~~~~ Select Thali ~~~~~~~~~~~~~~~~~~"+RESET);
        char ch=sc.next().toLowerCase().charAt(0);
        if((ch<65)&&(ch>70)){
                for(char c=1;c<=10;c++){
                System.out.printf(WHITE_BOLD+BLUE_BG+"%-30s%n","* Invalide input Please enter valide data"+RESET);
                ch=sc.next().toLowerCase().charAt(0);
            }
        }
            switch(ch){
                case 'a':aShow();break;
                case 'b':bShow();break;
                case 'c':cShow();break;
                case 'd':dShow();break;
                case 'e':eShow();break;
                case 'f':fShow();break;
            }

    }
    void aShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Soup (or) Welcome Drink" ,"Roti, Naan            "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","2 Vegetable Dish","Butter Paratha        "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Dal","Pickle, Salad, Papad  "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Rice","1 Sweet Dish            "+RESET);

        System.out.printf(WHITE_BOLD+RED_BG+"Do you want to choose another thali... (Y or N)      "+RESET);
        char c=sc.next().toLowerCase().charAt(0);
        if(c=='y'){
            thaliPrice();
        }

    }
    void bShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Soup (or) Welcome Drink ","Roti, Butter Naan"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Panneer Dish","Butter Paratha"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","2 Vegetable Dish","Pickle, Salad, Papad"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Dal","1 Sweet Dish"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Rice","Ice-cream"+RESET);

        System.out.printf(WHITE_BOLD+RED_BG+"Do you want to choose another thali... (Y or N)      "+RESET);
        char c=sc.next().toLowerCase().charAt(0);
        if(c=='y'){
            thaliPrice();
        }
    }
    void cShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Soup (or) Welcome Drink ","1 Rice"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Starter ","Roti, Butter Naan"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Paneer Dish","Butter Paratha"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","2 Vegetable Dish","Pickle, Salad, Papad"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Curd Dish","1 Sweet Dish"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Dal","Ice-cream"+RESET);

        System.out.printf(WHITE_BOLD+RED_BG+"Do you want to choose another thali... (Y or N)      "+RESET);
        char c=sc.next().toLowerCase().charAt(0);
        if(c=='y'){
            thaliPrice();
        }
    }
    void dShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Soup (or) Welcome Drink ","1 Rice"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","2 Starter ","Roti, Butter Naan"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Paneer Dish","Paratha"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","2 Vegetable Dish","Pickle, Salad, Papad"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Curd Dish","1 Sweet Dish"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Dal","Ice-cream or Coffee"+RESET);

        System.out.printf(WHITE_BOLD+RED_BG+"Do you want to choose another thali... (Y or N)      "+RESET);
        char c=sc.next().toLowerCase().charAt(0);
        if(c=='y'){
            thaliPrice();
        }
    }
    void eShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Soup (or) Welcome Drink ","1 Curd Dish"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","2 Starter ","1 Dal"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Paneer Starter","1 Rice"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Pasta(1 Type)","Roti, Naan, Paratha"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Paneer Dish","Pickle, Salad, Papad"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","2 Vegetable Dish","1 Sweet Dish,                 Ice-cream or Coffee"+RESET);

        System.out.printf(WHITE_BOLD+RED_BG+"Do you want to choose another thali... (Y or N)      "+RESET);
        char c=sc.next().toLowerCase().charAt(0);
        if(c=='y'){
            thaliPrice();
        }
    }
    void fShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","2 Soup ","1 Curd Dish           "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Welcome Drink","1 Dal                 "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","3 Starter ","1 Rice                "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Paneer Starter","Roti, Naan, Paratha "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Chinese Item","Pickle, Salad, Papad"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Paneer Dish","2 Sweet Dish          "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","2 Vegetable Dish","1 Ice-cream           "+RESET);

        System.out.printf(WHITE_BOLD+RED_BG+"Do you want to choose another thali... (Y or N)      "+RESET);
        char c=sc.next().toLowerCase().charAt(0);
        if(c=='y'){
            thaliPrice();
        }
    }
}

class JMB{
    public static final String RESET = "\u001B[0m";

    // Regular Colors
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Bold Colors
    public static final String BLACK_BOLD = "\u001B[1;30m";
    public static final String RED_BOLD = "\u001B[1;31m";
    public static final String GREEN_BOLD = "\u001B[1;32m";
    public static final String YELLOW_BOLD = "\u001B[1;33m";
    public static final String BLUE_BOLD = "\u001B[1;34m";
    public static final String PURPLE_BOLD = "\u001B[1;35m";
    public static final String CYAN_BOLD = "\u001B[1;36m";
    public static final String WHITE_BOLD = "\u001B[1;37m";

    // Background Colors
    public static final String BLACK_BG = "\u001B[40m";
    public static final String RED_BG = "\u001B[41m";
    public static final String GREEN_BG = "\u001B[42m";
    public static final String YELLOW_BG = "\u001B[43m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String PURPLE_BG = "\u001B[45m";
    public static final String CYAN_BG = "\u001B[46m";
    public static final String WHITE_BG = "\u001B[47m";
    public static void main(String...args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print(BLACK_BG+WHITE+"Enter Customer Name: "+RESET);
        String n= sc.nextLine();
        System.out.println(BLACK_BG+WHITE+"Enter mobile no."+RESET);
        int m= sc.nextInt();
        sc.nextLine();
        System.out.println(BLACK_BG+WHITE+"Enter guest Quantity"+RESET);
        int g= sc.nextInt();

        Details dobj=new Details(n,m,g);
        dobj.showCustomer();
        
        System.out.printf(WHITE_BG+BLACK+"%-10s%s%n","A" ,"+++++++++ VEGETARIAN MENU ++++++++ ", " "+RESET);
        System.out.printf(WHITE_BG+BLACK+"%-10s%s%n","B" ,"~~~~~~~~~ BREAKFAST MENU ~~~~~~~~ ", " "+RESET);
        System.out.printf(WHITE_BG+BLACK+"%-10s%s%n","C" ,"--------- ONLY FOR LADIES ------- ", " "+RESET);

        System.out.printf(BLACK_BG+WHITE+"%n>>>>>>>>>>>> SELECT MENU <<<<<<<<<<<<<"+RESET);
        char ch1= sc.next().toLowerCase().charAt(0);

        Veg obj =new Veg();
        forLadies lobj=new forLadies();
        BreakFast bobj=new BreakFast();

        switch(ch1){
            case 'a':obj.thaliPrice();break;
            case 'b':lobj.plate();break;
            case 'c':bobj.platePrice();break;
            default:
        }
        
    }    
}
