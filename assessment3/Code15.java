/* 15. Write a java program to accept the cost price of a bike
    and display the road tax to be paid according to the 
    following criteria.
    Cost Price(In Rs)		Tax
     > 100000			 15%
     >50000 and <=100000	 10%
     <=50000			 5% */
import java.util.Scanner;
class Code15{
    public static void main(String arg []){
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the cost price of bike");
        int cost=sc.nextInt();
        float tax1;

        if(cost>100000){
            tax1=(float)(cost*(15/100f));
            System.out.println("your tax is 15% :"+tax1);
        }else if(cost>50000&&cost<=100000){
            float tax2=(float)(cost*(10/100f));
            System.out.println("your tax is 10%:"+tax2);
        }else if(cost<=50000){
            float tax3=(float)(cost*(5/100f));
            System.out.println("your tax is 5% :"+tax3);
        }


    }
    
}
