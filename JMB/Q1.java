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
        System.out.printf("%20s%-20s%n","" ,"`BREAKFAST MENU`", " ")
        System.out.printf("%-15s%-15s%-10s%n","A Rs 200/-" ,"B Rs 230/-", "C Rs 250/-");
        System.out.printf("%-15s%-15s%-10s%n","1 Poha" ,"1 Poha", "1 Poha");
        System.out.printf("%-15s%-15s%-10s%n","1 Jalebi","1 Jalebi","1 Jalebi");
        System.out.printf("%-15s%-15s%-10s%n","1 Bread Item","1 Bread Item", "1 Bread Item");
        System.out.printf("%-15s%-15s%-10s%n","1 Tea or","1 Heavy Snacks","2 Heavy Snacks\n");
        System.out.printf("%-15s%-15s%-10s%n","  coffee","1 Tea or coffee","1 Tea or coffee\n");
    }
}
class Veg{
    void thaliPrice(){
        System.out.print("A\t\t\t\t\t\t Rs. 310/-\n");
        System.out.print("B\t\t\t\t\t\t Rs. 360/-\n");
        System.out.print("C\t\t\t\t\t\t Rs. 410/-\n");
        System.out.print("D\t\t\t\t\t\t Rs. 470/-\n");
        System.out.print("E\t\t\t\t\t\t Rs. 600/-\n");
        System.out.print("F\t\t\t\t\t\t Rs. 700/-\n");

        System.out.print("~~~~~~~~~~~~~~~~~~~ Select Thali ~~~~~~~~~~~~~~~~~~~\n");
        System.out.print("\n");
        char ch=sc.next().toLowerCase().charAt(0);
        if((ch>=65)&&(ch<=70)){
            for(char c=1;c<=122;ch++){
                System.out.print("* Invalide input Please enter valide data\n");
                char ch=sc.next().toLowerCase().charAt(0);
            }
        }
        switch(ch){
            case 'a':aShow();break;
            case 'a':aShow();break;
            case 'a':aShow();break;
            case 'a':aShow();break;
            case 'a':aShow();break;
            case 'a':aShow();break;
         
        }

    }
    void aShow(){
        System.out.printf("%-40s%s%n","1 Soup (or) Welcome Drink" ,"Roti, Naan");
        System.out.printf("%-40s%s%n","2 Vegetable Dish","Butter Paratha");
        System.out.printf("%-40s%s%n","1 Dal","Pickle, Salad, Papad");
        System.out.printf("%-38s%-2s%n","1 Rice","1 Sweet Dish\n");
    }
    void bShow(){
        System.out.printf("%-40s%s%n","1 Soup (or) Welcome Drink ","Roti, Butter Naan");
        System.out.printf("%-40s%s%n","1 Panneer Dish","Butter Paratha");
        System.out.printf("%-40s%s%n","2 Vegetable Dish","Pickle, Salad, Papad");
        System.out.printf("%-38s%-2s%n","1 Dal","1 Sweet Dish");
        System.out.printf("%-40s%s%n","1 Rice","Ice-cream\n");
    }
    void cShow(){
        System.out.printf("%-38s%-2s%n","1 Soup (or) Welcome Drink ","1 Rice");
        System.out.printf("%-40s%s%n","1 Starter ","Roti, Butter Naan");
        System.out.printf("%-40s%s%n","1 Paneer Dish","Butter Paratha");
        System.out.printf("%-40s%s%n","2 Vegetable Dish","Pickle, Salad, Papad");
        System.out.printf("%-38s%-2s%n","1 Curd Dish","1 Sweet Dish");
        System.out.printf("%-40s%s%n","1 Dal","Ice-cream\n");
    }
    void dShow(){
        System.out.printf("%-38s%-2s%n","1 Soup (or) Welcome Drink ","1 Rice");
        System.out.printf("%-40s%s%n","2 Starter ","Roti, Butter Naan");
        System.out.printf("%-40s%s%n","1 Paneer Dish","Paratha");
        System.out.printf("%-40s%s%n","2 Vegetable Dish","Pickle, Salad, Papad");
        System.out.printf("%-38s%-2s%n","1 Curd Dish","1 Sweet Dish");
        System.out.printf("%-40s%s%n","1 Dal","Ice-cream or Coffee\n");
    }
    void eShow(){
        System.out.printf("%-38s%-2s%n","1 Soup (or) Welcome Drink ","1 Curd Dish");
        System.out.printf("%-38s%-2s%n","2 Starter ","1 Dal");
        System.out.printf("%-38s%-2s%n","1 Paneer Starter","1 Rice");
        System.out.printf("%-40s%s%n","1 Pasta(1 Type)","Roti, Naan, Paratha");
        System.out.printf("%-40s%s%n","1 Paneer Dish","Pickle, Salad, Papad");
        System.out.printf("%-38s%-2s%n","2 Vegetable Dish","1 Sweet Dish,\n\t\t\t\t\tIce-cream or Coffee\n");
    }
    void fShow(){
        System.out.printf("%-38s%-2s%n","2 Soup ","1 Curd Dish");
        System.out.printf("%-38s%-2s%n","1 Welcome Drink","1 Dal");
        System.out.printf("%-38s%-2s%n","3 Starter ","1 Rice");
        System.out.printf("%-40s%s%n","1 Paneer Starter","Roti, Naan, Paratha");
        System.out.printf("%-40s%s%n","1 Chinese Item","Pickle, Salad, Papad");
        System.out.printf("%-38s%-2s%n","1 Paneer Dish","2 Sweet Dish");
        System.out.printf("%-38s%-2s%n","2 Vegetable Dish","1 Ice-cream\n");
    }
}

class JMB{
    public static void main(String...args){
        Veg obj =new Veg();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
        obj.e();
        obj.f();
        obj.aShow();
        obj.bShow();
        obj.cShow();
        obj.dShow();
        obj.eShow();
        obj.fShow();


    }    
}
