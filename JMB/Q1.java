import java.util.Scanner;
class Details{
    String name;
    int mob;
    Details(String n,int m){
        name=n;
        mob=m;
    }
}
class breakfast{
    void platePrice(){
        System.out.printf("%20s%-20s%n","" ,"`BREAKFAST MENU`", " ");
        System.out.printf("%-15s%-15s%-10s%n","A Rs 200/-" ,"B Rs 230/-", "C Rs 250/-");
        System.out.printf("%-15s%-15s%-10s%n","1 Poha" ,"1 Poha", "1 Poha");
        System.out.printf("%-15s%-15s%-10s%n","1 Jalebi","1 Jalebi","1 Jalebi");
        System.out.printf("%-15s%-15s%-10s%n","1 Bread Item","1 Bread Item", "1 Bread Item");
        System.out.printf("%-15s%-15s%-10s%n","1 Tea or","1 Heavy Snacks","2 Heavy Snacks\n");
        System.out.printf("%-15s%-15s%-10s%n","  coffee","1 Tea or coffee","1 Tea or coffee\n");
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
        if((ch>=65)&&(ch<=70)){
            for(char c=1;c<=122;ch++){
                System.out.printf(WHITE_BOLD+BLUE_BG+"%-30s%s%n","* Invalide input Please enter valide data"+RESET);
                ch=sc.next().toLowerCase().charAt(0);
            }
        }
        // System.out.print("\n");
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

    }
    void bShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Soup (or) Welcome Drink ","Roti, Butter Naan"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Panneer Dish","Butter Paratha"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","2 Vegetable Dish","Pickle, Salad, Papad"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Dal","1 Sweet Dish"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Rice","Ice-cream"+RESET);
    }
    void cShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Soup (or) Welcome Drink ","1 Rice"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Starter ","Roti, Butter Naan"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Paneer Dish","Butter Paratha"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","2 Vegetable Dish","Pickle, Salad, Papad"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Curd Dish","1 Sweet Dish"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Dal","Ice-cream"+RESET);
    }
    void dShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Soup (or) Welcome Drink ","1 Rice"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","2 Starter ","Roti, Butter Naan"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Paneer Dish","Paratha"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","2 Vegetable Dish","Pickle, Salad, Papad"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Curd Dish","1 Sweet Dish"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Dal","Ice-cream or Coffee"+RESET);
    }
    void eShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Soup (or) Welcome Drink ","1 Curd Dish"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","2 Starter ","1 Dal"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Paneer Starter","1 Rice"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Pasta(1 Type)","Roti, Naan, Paratha"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Paneer Dish","Pickle, Salad, Papad"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","2 Vegetable Dish","1 Sweet Dish,                 Ice-cream or Coffee"+RESET);
    }
    void fShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","2 Soup ","1 Curd Dish           "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Welcome Drink","1 Dal                 "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","3 Starter ","1 Rice                "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Paneer Starter","Roti, Naan, Paratha "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Chinese Item","Pickle, Salad, Papad"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Paneer Dish","2 Sweet Dish          "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","2 Vegetable Dish","1 Ice-cream           "+RESET);
    }
}

class JMB{
    public static void main(String...args){
        Veg obj =new Veg();
        obj.thaliPrice();
        // obj.a();
        // obj.b();
        // obj.c();
        // obj.d();
        // obj.e();
        // obj.f();
        // obj.aShow();
        // obj.bShow();
        // obj.cShow();
        // obj.dShow();
        // obj.eShow();
        // obj.fShow();


    }    
}
