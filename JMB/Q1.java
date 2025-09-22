import java.util.Scanner;
import java.time.LocalDate;
class Details{
    
    // Regular Colors
    public static final String RESET = "\u001B[0m";
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
    // int age;
    Details(String n,int m,int g){
        name=n;
        mob=m;
        guest=g;
    }

    void showDetails(){
        System.out.printf(WHITE_BOLD+BLUE_BG+"%s%n","``````````````Customer Details`````````````````"+RESET);
        System.out.printf(CYAN_BG+RED_BG+"%-30s%-20s%s%n","Customer Name:",name,""+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%-20s%s%n","MOB :",mob,""+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%-20s%s%n","No. of Guest :",guest,""+RESET);
    }
}
class ForLadies{
    Scanner sc=new Scanner(System.in);
    
    // Regular Colors
    public static final String RESET = "\u001B[0m";
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

        System.out.printf(WHITE_BOLD+BLUE_BG+"%s%n","~~~~~~~~~~~~~~~~~~~~ Select Thali ~~~~~~~~~~~~~~~~~~"+RESET);
        char ch=sc.next().toLowerCase().charAt(0);
    }
}
class BreakFast{
    public static final String RESET = "\u001B[0m";
    public static final String BLACK_BG = "\u001B[40m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLUE_BG = "\u001B[44m";
    void platePrice(){

        System.out.printf(BLUE_BG+WHITE+"%20s%-20s%n","" ,"`BREAKFAST MENU`"+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","A Rs 200/-" ,"B Rs 230/-", "C Rs 250/-"+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","1 Poha" ,"1 Poha", "1 Poha"+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","1 Jalebi","1 Jalebi","1 Jalebi"+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","1 Bread Item","1 Bread Item", "1 Bread Item"+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","1 Tea or","1 Heavy Snacks","2 Heavy Snacks\n"+RESET);
        System.out.printf(BLACK_BG+WHITE+"%-15s%-15s%-10s%n","  coffee","1 Tea or coffe","1 Tea or coffee\n"+RESET);

        Scanner sc =new Scanner(System.in);
        System.out.printf(WHITE+BLUE_BG+"%s%n","~~~~~~~~~~~~~~~~~~~~ Select Breakfast ~~~~~~~~~~~~~~~~~~"+RESET);
        char ch=sc.next().toLowerCase().charAt(0);
    }
}
class Veg{
    int c1=0;
    int i=0;
    protected String veg[]=new String[25];
    
    // Regular Colors
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

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
        char ch=sc.next().toUpperCase().charAt(0);
        while(true){
            if(ch>=65&&ch<=70){
                break;
            }else{
                System.out.printf(WHITE_BOLD+BLUE_BG+"%-30s%n","* Invalide input Please enter valide data"+RESET);
                ch=sc.next().toUpperCase().charAt(0);
            }
        }
        switch(ch){
            case 'A':aShow();break;
            case 'B':bShow();break;
            case 'C':cShow();break;
            case 'D':dShow();break;
            case 'E':eShow();break;
            case 'F':fShow();break;
        }
    }
    void aShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Soup (or) Welcome Drink" ,"Roti, Naan            "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","2 Vegetable Dish","Butter Paratha        "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Dal","Pickle, Salad, Papad  "+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Rice","1 Sweet Dish                 "+RESET);

        System.out.printf(WHITE_BOLD+RED_BG+"Do you want to choose another thali... (Y or N)      "+RESET);
        char c=sc.next().toLowerCase().charAt(0);

        if(c=='y'){
            thaliPrice();
        }else{
            System.out.printf(WHITE_BOLD+RED_BG+"Choose your Thali's Items..."+RESET);
        }
        System.out.printf(WHITE_BOLD+RED_BG+"Select any one #1. shoup or #2. Welcome Drink "+RESET);
            int n1=sc.nextInt();
            
            switch(n1){
                case 1:soup();break;
                case 2:mocktail();break;
                default:{System.out.println("# Invalide Input.....");
                }
            }
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any Two Dish (1-24) " + RESET);
            vegetables();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose one more "+RESET);
            vegetables();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Dal " + RESET);
            dal();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Rice " + RESET);
            rice();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Sweet Dish  " + RESET);
            iceCream();
        
            // soup();
            // dal();
            // rice();
            // roti();
            // starter();
            // snacks();
            // chineseContinental();
            // vegetables();
            // mocktail();
            // paneer();
            // paneerDish();
            // curdDish();
            // iceCream();

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
        }else{
            System.out.printf(WHITE_BOLD+RED_BG+"Choose your Thali's Items..."+RESET);
        }
        System.out.printf(WHITE_BOLD+RED_BG+"Select any one #1. shoup or #2. Welcome Drink "+RESET);
            int n1=sc.nextInt();
            
            switch(n1){
                case 1:soup();break;
                case 2:mocktail();break;
                default:{System.out.println("# Invalide Input.....");
                }
            }
            System.out.printf(WHITE_BOLD+RED_BG+" Choose Any One Dish "+RESET);
            paneerDish();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any Two Dish (1-24) " + RESET);
            vegetables();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose One More Dish " + RESET);
            vegetables();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Dal " + RESET);
            dal();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Rice " + RESET);
            rice();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Sweet Dish  " + RESET);
            iceCream();
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
        }else{
            System.out.printf(WHITE_BOLD+RED_BG+"Choose your Thali's Items..."+RESET);
        }
        System.out.printf(WHITE_BOLD+RED_BG+"Select any one #1. shoup or #2. Welcome Drink "+RESET);
            int n1=sc.nextInt();
            
            switch(n1){
                case 1:soup();break;
                case 2:mocktail();break;
                default:{System.out.println("# Invalide Input.....");
                }
            }
            System.out.printf(WHITE_BOLD+RED_BG+" Choose Starter "+RESET);
            starter();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any Two Dish (1-24) " + RESET);
            vegetables();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose one more "+RESET);
            vegetables();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose Any One Dish "+RESET);
            paneerDish();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose Any one curdDish  "+RESET);
            curdDish();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Dal " + RESET);
            dal();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Rice " + RESET);
            rice();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Sweet Dish  " + RESET);
            iceCream();
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
        }else{
            System.out.printf(WHITE_BOLD+RED_BG+"Choose your Thali's Items..."+RESET);
        }
        System.out.printf(WHITE_BOLD+RED_BG+"Select any one #1. shoup or #2. Welcome Drink "+RESET);
            int n1=sc.nextInt();
            
            switch(n1){
                case 1:soup();break;
                case 2:mocktail();break;
                default:{System.out.println("# Invalide Input.....");
                }
            }
            System.out.printf(WHITE_BOLD+RED_BG+" Choose  Any Two Starter "+RESET);
            starter();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose  One More  "+RESET);
            starter();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any Two Dish (1-24) " + RESET);
            vegetables();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose one more "+RESET);
            vegetables();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose Any One Dish "+RESET);
            paneerDish();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose Any one curdDish  "+RESET);
            curdDish();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Dal " + RESET);
            dal();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Sweet Dish  " + RESET);
            iceCream();
    }
    void eShow(){
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Soup (or) Welcome Drink ","1 Curd Dish"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","2 Starter ","1 Dal"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","1 Paneer Starter","1 Rice"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Pasta(1 Type)","Roti, Naan, Paratha"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-30s%s%n","1 Paneer Dish","Pickle, Salad, Papad"+RESET);
        System.out.printf(WHITE_BOLD+RED_BG+"%-28s%-2s%n","2 Vegetable Dish","1 Sweet Dish,Ice-cream or Coffee"+RESET);

        System.out.printf(WHITE_BOLD+RED_BG+"Do you want to choose another thali... (Y or N)      "+RESET);
        char c=sc.next().toLowerCase().charAt(0);
        if(c=='y'){
            thaliPrice();
        }else{
            System.out.printf(WHITE_BOLD+RED_BG+"Choose your Thali's Items..."+RESET);
        }
        System.out.printf(WHITE_BOLD+RED_BG+"Select any one #1. shoup or #2. Welcome Drink "+RESET);
            int n1=sc.nextInt();
            
            switch(n1){
                case 1:soup();break;
                case 2:mocktail();break;
                default:{System.out.println("# Invalide Input.....");
                }
            }
            System.out.printf(WHITE_BOLD+RED_BG+" Choose  Any Two Starter "+RESET);
            starter();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose  One More  "+RESET);
            starter();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose  One More  "+RESET);
            snacks();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any Two Dish (1-24) " + RESET);
            vegetables();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose one more "+RESET);
            vegetables();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose Any One Dish "+RESET);
            paneerDish();
            System.out.printf(WHITE_BOLD+RED_BG+" Choose Any one curdDish  "+RESET);
            curdDish();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Dal " + RESET);
            dal();
            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any One Sweet Dish  " + RESET);
            iceCream();
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
        void soup(){
            System.out.printf(WHITE_BOLD+RED_BG+"%s%n","************* SOUP **************"+RESET);
            System.out.printf(WHITE_BG+BLUE_BOLD+"%s%n","#1. Tomato Soup          #2. Veg Mancho"+RESET);
            System.out.printf(WHITE_BG+BLUE_BOLD+"%s%n","#3. Hot & Sour Veg       #4. Lemon Coriander"+RESET);
            
            
            System.out.printf(WHITE_BOLD+RED_BG+" Choose Any one (1,2,3,4).....  "+RESET);
                int n2=sc.nextInt();
                switch(n2){
                    case 1:veg[i++]= "Tomato soup";break;
                    case 2:veg[i++]= "Veg Mancho";break;
                    case 3:veg[i++]= "Hot & Sour Veg";break;
                    case 4:veg[i++]= "Lemon Coriander";break;
                }

        }
        void mocktail() {
            System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "*************** MOCKTAIL **************" + RESET);
            System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Blue Lagoon           #5. Orange Pink City" + RESET);
            System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Blowgun Kesher Pista  #6. Strawberry Delight" + RESET);
            System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#3. Fresh Lime Water      #7. Jal Jeera" + RESET);
            System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#4. Butter Milk           #8. Rasna Water" + RESET);

            System.out.printf(WHITE_BOLD + RED_BG + " Choose Any one (1,2,3,.....8) " + RESET);

            int n2 = sc.nextInt();
            while(n2>8&&n2<=1){
                System.out.printf(WHITE_BOLD + RED_BG + " Enter Valide Input (1,2,3,.....8) " + RESET);
                n2 = sc.nextInt();
            }
            switch (n2) {
                case 1: veg[i++] = "Blue Lagoon"; break;
                case 2: veg[i++] = "Blowgun Kesher Pista"; break;
                case 3: veg[i++] = "Fresh Lime Water"; break;
                case 4: veg[i++] = "Butter Milk"; break;
                case 5: veg[i++] = "Orange Pink City"; break;
                case 6: veg[i++] = "Strawberry Delight"; break;
                case 7: veg[i++] = "Jal Jeera"; break;
                case 8: veg[i++] = "Rasna Water"; break;
                default: System.out.println("⚠️ Invalid choice, please try again.");
            }
}
void paneer() {
    System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "*************** PANEER STARTERS *****************" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Paneer Chilli           #5. Paneer Pudina Tikka" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Paneer Tikka            #6. Paneer Achari Tikka" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#3. Dragon Paneer" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#4. Paneer 65" + RESET);

    System.out.printf(WHITE_BOLD + RED_BG + " Choose Any one (1,2,3,.....6) " + RESET);

    int n2 = sc.nextInt();
    while (n2 > 6 || n2 < 1) {   // corrected validation
        System.out.printf(WHITE_BOLD + RED_BG + " Enter Valid Input (1,2,3,.....6) " + RESET);
        n2 = sc.nextInt();
    }

    switch (n2) {
        case 1: veg[i++] = "Paneer Chilli"; break;
        case 2: veg[i++] = "Paneer Tikka"; break;
        case 3: veg[i++] = "Dragon Paneer"; break;
        case 4: veg[i++] = "Paneer 65"; break;
        case 5: veg[i++] = "Paneer Pudina Tikka"; break;
        case 6: veg[i++] = "Paneer Achari Tikka"; break;
        default: System.out.println("⚠️ Invalid choice, please try again.");
    }
}

void paneerDish() {
    System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "****************** PANEER DISH  *******************" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Paneer Butter Masala        #7. Paneer Kadai     " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Paneer Punjabi              #8. Methi Paneer     " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#3. Paneer Palak                #9. Corn Paneer      " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#4. Paneer Mutter               #10. Paneer Kolhapuri" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#5. Paneer Do Pyaza             #11. Paneer Chatpatta" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#6. Paneer Tikka Masala                              " + RESET);

    System.out.printf(WHITE_BOLD + RED_BG + " Choose Any one (1,2,3,.....11) " + RESET);

    int n2 = sc.nextInt();
    while (n2 > 11 || n2 < 1) { 
        System.out.printf(WHITE_BOLD + RED_BG + " Enter Valid Input (1,2,3,.....11) " + RESET);
        n2 = sc.nextInt();
    }

    switch (n2) {
        case 1: veg[i++] = "Paneer Butter Masala"; break;
        case 2: veg[i++] = "Paneer Punjabi"; break;
        case 3: veg[i++] = "Paneer Palak"; break;
        case 4: veg[i++] = "Paneer Mutter"; break;
        case 5: veg[i++] = "Paneer Do Pyaza"; break;
        case 6: veg[i++] = "Paneer Tikka Masala"; break;
        case 7: veg[i++] = "Paneer Kadai"; break;
        case 8: veg[i++] = "Methi Paneer"; break;
        case 9: veg[i++] = "Corn Paneer"; break;
        case 10: veg[i++] = "Paneer Kolhapuri"; break;
        case 11: veg[i++] = "Paneer Chatpatta"; break;
        default: System.out.println("⚠️ Invalid choice, please try again.");
    }
}

void curdDish() {
    System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "*************** CURD DISH **************" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Veg Raita             #5. Boondi Raita" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Loki Raita            #6. Fruit Raita " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#3. Aloo Raita            #7. Dahi Vada   " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#4. Dahi Papdi                            " + RESET);

    System.out.printf(WHITE_BOLD + RED_BG + " Choose Any one (1,2,3,.....7) " + RESET);

    int n2 = sc.nextInt();
    while (n2 > 7 || n2 < 1) {  
        System.out.printf(WHITE_BOLD + RED_BG + " Enter Valid Input (1,2,3,.....7) " + RESET);
        n2 = sc.nextInt();
    }

    switch (n2) {
        case 1: veg[i++] = "Veg Raita"; break;
        case 2: veg[i++] = "Loki Raita"; break;
        case 3: veg[i++] = "Aloo Raita"; break;
        case 4: veg[i++] = "Dahi Papdi"; break;
        case 5: veg[i++] = "Boondi Raita"; break;
        case 6: veg[i++] = "Fruit Raita"; break;
        case 7: veg[i++] = "Dahi Vada"; break;
        default: System.out.println("⚠️ Invalid choice, please try again.");
    }
}

void iceCream() {
    System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "************** SWEETS or ICE-CREAM ************" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Gulab Jamun             #5. Aam Khanda       " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Gajar Ka Halwa          #6. Vanilla          " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#3. Moong Ka Halwa          #7. Butter Scotch    " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#4. Shree Khand             #8. Sitaphal Basundi " + RESET);

    System.out.printf(WHITE_BOLD + RED_BG + " Choose Any one (1,2,3,.....8) " + RESET);

    int n2 = sc.nextInt();
    while (n2 > 8 || n2 < 1) { 
        System.out.printf(WHITE_BOLD + RED_BG + " Enter Valid Input (1,2,3,.....8) " + RESET);
        n2 = sc.nextInt();
    }

    switch (n2) {
        case 1: veg[i++] = "Gulab Jamun"; break;
        case 2: veg[i++] = "Gajar Ka Halwa"; break;
        case 3: veg[i++] = "Moong Ka Halwa"; break;
        case 4: veg[i++] = "Shree Khand"; break;
        case 5: veg[i++] = "Aam Khanda"; break;
        case 6: veg[i++] = "Vanilla"; break;
        case 7: veg[i++] = "Butter Scotch"; break;
        case 8: veg[i++] = "Sitaphal Basundi"; break;
        default: System.out.println("⚠️ Invalid choice, please try again.");
    }
}

void vegetables() {
    System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "**************** VEGETABLES ****************" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Nav Ratan Korma          #13. Jeera Aloo         " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Lahori Aloo Mutter       #14. Dum Aloo           " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#3. Mix Veg                  #15. Gujrati Aloo       " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#4. Green Chana (Seasonal)   #16. Tinda Masala       " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#5. Corn Palak               #17. Aloo Palak         " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#6. Aloo 65                  #18. Seasonal Veg       " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#7. Aloo Mutter              #19. Bhindi Do Pyaza    " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#8. Aloo Capsicum            #20. Veg Kolhapuri      " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#9. Aloo Do Pyaza            #21. Corn Capsicum      " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#10. Aloo Gobhi              #22. Methi Mutter Malai " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#11. Gobhi Mutter            #23. Haryali Kofta      " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#12. Kadi Punjabi            #24. Chana Masala       " + RESET);


    int n2 = sc.nextInt();
    while (n2 > 24 || n2 < 1) {
        System.out.printf(WHITE_BOLD + RED_BG + " Enter Valid Input (1-24) " + RESET);
        n2 = sc.nextInt();
    }
    while(c1==n2){
        System.out.printf(WHITE_BOLD + RED_BG + " You Entered the Same Dish.. Select another one." + RESET);
        n2 = sc.nextInt();
    }
    c1=n2;
    switch (n2) {
        case 1: veg[i++] = "Nav Ratan Korma"; break;
        case 2: veg[i++] = "Lahori Aloo Mutter"; break;
        case 3: veg[i++] = "Mix Veg"; break;
        case 4: veg[i++] = "Green Chana (Seasonal)"; break;
        case 5: veg[i++] = "Corn Palak"; break;
        case 6: veg[i++] = "Aloo 65"; break;
        case 7: veg[i++] = "Aloo Mutter"; break;
        case 8: veg[i++] = "Aloo Capsicum"; break;
        case 9: veg[i++] = "Aloo Do Pyaza"; break;
        case 10: veg[i++] = "Aloo Gobhi"; break;
        case 11: veg[i++] = "Gobhi Mutter"; break;
        case 12: veg[i++] = "Kadi Punjabi"; break;
        case 13: veg[i++] = "Jeera Aloo"; break;
        case 14: veg[i++] = "Dum Aloo"; break;
        case 15: veg[i++] = "Gujrati Aloo"; break;
        case 16: veg[i++] = "Tinda Masala"; break;
        case 17: veg[i++] = "Aloo Palak"; break;
        case 18: veg[i++] = "Seasonal Veg"; break;
        case 19: veg[i++] = "Bhindi Do Pyaza"; break;
        case 20: veg[i++] = "Veg Kolhapuri"; break;
        case 21: veg[i++] = "Corn Capsicum"; break;
        case 22: veg[i++] = "Methi Mutter Malai"; break;
        case 23: veg[i++] = "Haryali Kofta"; break;
        case 24: veg[i++] = "Chana Masala"; break;
        default: System.out.println("⚠️ Invalid choice.");
    }
}
void dal() {
    System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "**************** DAL ****************" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Dal Fry             #3. Dal Makhani     " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Dal Tadka           #4. Dal Panchrangi  " + RESET);

    int n2 = sc.nextInt();
    while (n2 > 4 || n2 < 1) {
        System.out.printf(WHITE_BOLD + RED_BG + " Enter Valid Input (1-4) " + RESET);
        n2 = sc.nextInt();
    }

    switch (n2) {
        case 1: veg[i++] = "Dal Fry"; break;
        case 2: veg[i++] = "Dal Tadka"; break;
        case 3: veg[i++] = "Dal Makhani"; break;
        case 4: veg[i++] = "Dal Panchrangi"; break;
        default: System.out.println("⚠️ Invalid choice.");
    }
}
void rice() {
    System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "**************** RICE ****************" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Rice                 #4. Veg Pulao       " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Jeera Rice           #5. Veg Fried Rice  " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#3. Green Peas Pulao     #6. Veg Biryani     " + RESET);

    System.out.printf(WHITE_BOLD + RED_BG + " Choose Any one (1-6) " + RESET);

    int n2 = sc.nextInt();
    while (n2 > 6 || n2 < 1) {
        System.out.printf(WHITE_BOLD + RED_BG + " Enter Valid Input (1-6) " + RESET);
        n2 = sc.nextInt();
    }

    switch (n2) {
        case 1: veg[i++] = "Rice"; break;
        case 2: veg[i++] = "Jeera Rice"; break;
        case 3: veg[i++] = "Green Peas Pulao"; break;
        case 4: veg[i++] = "Veg Pulao"; break;
        case 5: veg[i++] = "Veg Fried Rice"; break;
        case 6: veg[i++] = "Veg Biryani"; break;
        default: System.out.println("⚠️ Invalid choice.");
    }
}
void roti() {
    System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "**************** ROTI ****************" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Roti                 #4. Naan            " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Paratha              #5. Missi Roti      " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#3. Kulcha               #6. Methi Poori     " + RESET);

    System.out.printf(WHITE_BOLD + RED_BG + " Choose Any one (1-6) " + RESET);

    int n2 = sc.nextInt();
    while (n2 > 6 || n2 < 1) {
        System.out.printf(WHITE_BOLD + RED_BG + " Enter Valid Input (1-6) " + RESET);
        n2 = sc.nextInt();
    }

    switch (n2) {
        case 1: veg[i++] = "Roti"; break;
        case 2: veg[i++] = "Paratha"; break;
        case 3: veg[i++] = "Kulcha"; break;
        case 4: veg[i++] = "Naan"; break;
        case 5: veg[i++] = "Missi Roti"; break;
        case 6: veg[i++] = "Methi Poori"; break;
        default: System.out.println("⚠️ Invalid choice.");
    }
}
void starter() {
    System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "**************** STARTER ****************" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Mix Veg Pakoda          #9. Corn Chat           " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Veg Finger              #10. Aloo Chat          " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#3. Bread Pakoda            #11. Saboo Dana Vada    " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#4. Methi Kabab             #12. Veg Manchurian Dry " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#5. Moong Pakoda            #13. Tandoori Manchurian" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#6. Dragon Aloo             #14. Chinese Corn Kebab " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#7. Saboo Dana              #15. Veg Cutlet         " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#8. Finger Chips            #16. Veg Kothey         " + RESET);

    System.out.printf(WHITE_BOLD + RED_BG + "Choose Any one (1,2,...16): " + RESET);
    int n = sc.nextInt();

    while (n < 1 || n > 16) {
        System.out.printf(WHITE_BOLD + RED_BG + "Enter Valid Input (1,2,...16): " + RESET);
        n = sc.nextInt();
    }

    switch (n) {
        case 1: veg[i++] = "Mix Veg Pakoda"; break;
        case 2: veg[i++] = "Veg Finger"; break;
        case 3: veg[i++] = "Bread Pakoda"; break;
        case 4: veg[i++] = "Methi Kabab"; break;
        case 5: veg[i++] = "Moong Pakoda"; break;
        case 6: veg[i++] = "Dragon Aloo"; break;
        case 7: veg[i++] = "Saboo Dana"; break;
        case 8: veg[i++] = "Finger Chips"; break;
        case 9: veg[i++] = "Corn Chat"; break;
        case 10: veg[i++] = "Aloo Chat"; break;
        case 11: veg[i++] = "Saboo Dana Vada"; break;
        case 12: veg[i++] = "Veg Manchurian Dry"; break;
        case 13: veg[i++] = "Tandoori Manchurian"; break;
        case 14: veg[i++] = "Chinese Corn Kebab"; break;
        case 15: veg[i++] = "Veg Cutlet"; break;
        case 16: veg[i++] = "Veg Kothey"; break;
    }


}
void snacks() {
    System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "**************** SNACKS ****************" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Idli/Vada Shambhar      #7. Noodles            " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Pav Bhaji               #8. Chhole Bhatura     " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#3. Chhola Kulcha           #9. Chhola Poori       " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#4. Methi Paratha           #10. Paratha w/ Dahi   " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#5. Stuffed Paratha         #11. Aloo Paratha      " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#6. Muli Paratha            #12. Gobhi Paratha     " + RESET);

    System.out.printf(WHITE_BOLD + RED_BG + "Choose Any one (1,2,...12): " + RESET);
    int n = sc.nextInt();

    while (n < 1 || n > 12) {
        System.out.printf(WHITE_BOLD + RED_BG + "Enter Valid Input (1,2,...12): " + RESET);
        n = sc.nextInt();
    }

    switch (n) {
        case 1: veg[i++] = "Idli/Vada Shambhar"; break;
        case 2: veg[i++] = "Pav Bhaji"; break;
        case 3: veg[i++] = "Chhola Kulcha"; break;
        case 4: veg[i++] = "Methi Paratha"; break;
        case 5: veg[i++] = "Stuffed Paratha"; break;
        case 6: veg[i++] = "Muli Paratha"; break;
        case 7: veg[i++] = "Noodles"; break;
        case 8: veg[i++] = "Chhole Bhatura"; break;
        case 9: veg[i++] = "Chhola Poori"; break;
        case 10: veg[i++] = "Paratha w/ Dahi"; break;
        case 11: veg[i++] = "Aloo Paratha"; break;
        case 12: veg[i++] = "Gobhi Paratha"; break;
    }

}
void chineseContinental() {
    System.out.printf(BLUE_BOLD + WHITE_BOLD + "%s%n", "******** CHINESE & CONTINENTAL ********" + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#1. Baked Veg               #4. Baked Palak           " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#2. Veg Manchurian          #5. Veg Singapore Noodles " + RESET);
    System.out.printf(WHITE_BG + BLUE_BOLD + "%s%n", "#3. Veg Noodles             #6. Veg Fried Rice        " + RESET);

    System.out.printf(WHITE_BOLD + RED_BG + "Choose Any one (1,2,...6): " + RESET);
    int n = sc.nextInt();

    while (n < 1 || n > 6) {
        System.out.printf(WHITE_BOLD + RED_BG + "Enter Valid Input (1,2,...6): " + RESET);
        n = sc.nextInt();
    }

    switch (n) {
        case 1: veg[i++] = "Baked Veg"; break;
        case 2: veg[i++] = "Veg Manchurian"; break;
        case 3: veg[i++] = "Veg Noodles"; break;
        case 4: veg[i++] = "Baked Palak"; break;
        case 5: veg[i++] = "Veg Singapore Noodles"; break;
        case 6: veg[i++] = "Veg Fried Rice"; break;
    }

}

}
class JMB extends Veg{ 
    // Regular Colors
    public static final String RESET = "\u001B[0m";
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

    
    void menu(){

        Scanner sc =new Scanner(System.in);
        System.out.printf(WHITE_BG+BLACK+"%-10s%s%n","A" ,"+++++++++ VEGETARIAN MENU ++++++++ ", " "+RESET);
        System.out.printf(WHITE_BG+BLACK+"%-10s%s%n","B" ,"~~~~~~~~~ BREAKFAST MENU ~~~~~~~~ ", " "+RESET);
        System.out.printf(WHITE_BG+BLACK+"%-10s%s%n","C" ,"--------- ONLY FOR LADIES ------- ", " "+RESET);
        
        System.out.printf(BLACK_BG+WHITE+"%n>>>>>>>>>>>> SELECT MENU <<<<<<<<<<<<<"+RESET);
        char ch1= sc.next().toLowerCase().charAt(0);
        
        Veg obj =new Veg();
        // ForLadies lobj=new ForLadies();
        // BreakFast bobj=new BreakFast();
        
        switch(ch1){
            case 'a':obj.thaliPrice();break;
            // case 'b':lobj.plate();break;
            // case 'c':bobj.platePrice();break;
        }
    }
}
class Main extends Veg{
    public static final String RESET = "\u001B[0m";
    public static final String BLACK_BG = "\u001B[40m";
    public static final String WHITE = "\u001B[37m";
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf(BLACK_BG+WHITE+"Enter Customer Name: "+RESET);
        String n= sc.nextLine();
        System.out.println(BLACK_BG+WHITE+"Enter mobile no."+RESET);
        int m= sc.nextInt();
        sc.nextLine();
        System.out.println(BLACK_BG+WHITE+"Enter guest Quantity"+RESET);
        int g= sc.nextInt();
        Details dobj=new Details(n,m,g);
        Main mobj =new Main();
        JMB jobj=new JMB();
        jobj.menu();
        Veg v=new Veg();
        v.thaliPrice();
            for(int j=0;j<v.veg.length;j++){
                System.out.println(v.veg[j]);
            }

        
    }
}
