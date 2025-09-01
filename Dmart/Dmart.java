import java.util.Scanner;
class DMart{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Name of customer");
        String name=sc.nextLine();

        System.out.println("Gender (male=m),(female=f)");
        char gender=sc.next().charAt(0);

        System.out.println("Enter name of product 1st");
        String product1=sc.next();
        System.out.println("Quantity of product 1st ");
        int quantity1=sc.nextInt();
        System.out.println("Enter price of product 1st");
        int price1=sc.nextInt();

        System.out.println("Enter name of product 2nd");
        String product2=sc.next();
        System.out.println("Quantity of product 2nd");
        int quantity2=sc.nextInt();
        System.out.println("Enter price of product 2nd");
        int price2=sc.nextInt();

        System.out.println("Enter name of product 3rd");
        String product3=sc.next();
        System.out.println("Quantity of product 3rd");
        int quantity3=sc.nextInt();
        System.out.println("Enter price of product 3rd");
        int price3=sc.nextInt();

        System.out.println("Enter name of product 4th");
        String product4=sc.next();
        System.out.println("Quantity of product 4th");
        int quantity4=sc.nextInt();
        System.out.println("Enter price of product 4th");
        int price4=sc.nextInt();

        System.out.println("Enter name of product 5th");
        String product5=sc.next();
        System.out.println("Quantity of product 5th");
        int quantity5=sc.nextInt();
        System.out.println("Enter price of product 5th");
        int price5=sc.nextInt();

        System.out.println("Enter name of product 6th");
        String product6=sc.next();
        System.out.println("Quantity of product 6th");
        int quantity6=sc.nextInt();
        System.out.println("Enter price of product 6th");
        int price6=sc.nextInt();

        System.out.println("Enter name of product 7th");
        String product7=sc.next();
        System.out.println("Quantity of product 7th");
        int quantity7=sc.nextInt();
        System.out.println("Enter price of product 7th");
        int price7=sc.nextInt();

        System.out.println("Enter name of product 8th");
        String product8=sc.next();
        System.out.println("Quantity of product 8th");
        int quantity8=sc.nextInt();
        System.out.println("Enter price of product 8th");
        int price8=sc.nextInt();

        System.out.println("Enter name of product 9th");
        String product9=sc.next();
        System.out.println("Quantity of product 9th");
        int quantity9=sc.nextInt();
        System.out.println("Enter price of product 9th");
        int price9=sc.nextInt();

        System.out.println("Enter name of product 10th");
        String product10=sc.next();
        System.out.println("Quantity of product 10th");
        int quantity10=sc.nextInt();
        System.out.println("Enter price of product 10th");
        int price10=sc.nextInt();

        float totalProductPrice1= quantity1 * price1;
        float totalProductPrice2= quantity2 * price2 ;
        float totalProductPrice3= quantity3 * price3 ;
        float totalProductPrice4= quantity4 * price4 ;
        float totalProductPrice5= quantity5 * price5 ;
        float totalProductPrice6= quantity6 * price6 ;
        float totalProductPrice7= quantity7 * price7 ;
        float totalProductPrice8= quantity8 * price8 ;
        float totalProductPrice9= quantity9 * price9 ;
        float totalProductPrice10= quantity10 * price10 ;

        float total = totalProductPrice1+totalProductPrice2+totalProductPrice3+totalProductPrice4+totalProductPrice5+totalProductPrice6+totalProductPrice7+totalProductPrice8+totalProductPrice9+totalProductPrice10;
        float tPP1=(quantity1>4)?(totalProductPrice1-(totalProductPrice1*(5f/100))):totalProductPrice1;
        float tPP5=(totalProductPrice5-(totalProductPrice1*(10f/100)));
        float tPP10=(totalProductPrice10-(totalProductPrice1*(15f/100)));
        float totalPrice=tPP1+totalProductPrice2+totalProductPrice3+totalProductPrice4+tPP5+totalProductPrice6+totalProductPrice7+totalProductPrice8+totalProductPrice9+tPP10;

        float totalDiscountPrice;
        String gift;
        String b;
        float bP;
        float totalBillAmount;

        if(totalPrice>10000){
            totalDiscountPrice=totalPrice*(15f/100);
        }else if(totalPrice<=10000&&totalPrice>=5000){
            totalDiscountPrice=totalPrice*(10f/100);
        }else{
            totalDiscountPrice=totalPrice;
        }

        float gstAmt=(10f/100);
        float afterGstTotalAmt=(float)((totalDiscountPrice-(totalDiscountPrice*gstAmt)));
        float gst=(float)((totalDiscountPrice*gstAmt));

        System.out.println("Do you want a carry bag('y' or 'n')");
        char bag=sc.next().charAt(0);

        if(bag=='y'||bag=='Y'){
            totalBillAmount=afterGstTotalAmt+10f;
            b="Yes";
            bP=10f;
        }else if(bag=='n'||bag=='N'){
            totalBillAmount=afterGstTotalAmt;
            b="No";
            bP=0f;
        }else{
            totalBillAmount=0f;
            b="NA ";
            bP= 0f;
        }

        if(gender=='m'||gender=='M'){
            gift="Ladger Wallet";
        }else if(gender=='f'||gender=='F'){
            gift="Cadeberry";
        }else{
            gift="NA ";
        }
        
            System.out.printf("%50s%n","D-Mart");
            System.out.printf("name: %s%75s%n",name,"Date: 22/07/2025");                                                                                                                         
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.printf("%-15s%15s%30s%30s%n","Item Name","Quantity","Price","Total");
            System.out.printf("%-15s%15d%30d%30.2f%n",product1,quantity1,price1,tPP1);
            System.out.printf("%-15s%15d%30d%30.2f%n",product2,quantity2,price2,totalProductPrice2);
            System.out.printf("%-15s%15d%30d%30.2f%n",product3,quantity3,price3,totalProductPrice3);
            System.out.printf("%-15s%15d%30d%30.2f%n",product4,quantity4,price4,totalProductPrice4);
            System.out.printf("%-15s%15d%30d%30.2f%n",product5,quantity5,price5,tPP5);
            System.out.printf("%-15s%15d%30d%30.2f%n",product6,quantity6,price6,totalProductPrice6);
            System.out.printf("%-15s%15d%30d%30.2f%n",product7,quantity7,price7,totalProductPrice7);
            System.out.printf("%-15s%15d%30d%30.2f%n",product8,quantity8,price8,totalProductPrice8);
            System.out.printf("%-15s%15d%30d%30.2f%n",product9,quantity9,price9,totalProductPrice9);
            System.out.printf("%-15s%15d%30d%30.2f%n",product10,quantity10,price10,tPP10);
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.printf("%-15s%15s%30s%30s%n"," "," ","A.P","D.P");
            System.out.printf("%-15s%15s%30.2f%30.2f%n"," "," ",total,totalPrice);
            System.out.printf("%-15s%15s%30s%30s%n","Gift:-",gift,"0.00","0.00");
            System.out.printf("%-15s%15s%30.2f%30.2f%n","Carry bag",b,bP,bP);
            System.out.printf("%-15s%15s%30.2f%30.2f%n","Gst (10%)"," ",gst,gst);
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.printf("%-15s%15s%30.2f%30.2f%n"," "," ",totalDiscountPrice,totalBillAmount);
            System.out.println("  ");
            System.out.printf("%50s%n","Thank you");
            System.out.printf("%49s%n","To Visit");
            System.out.printf("%48s%n","D-Mart");
            System.out.println("-----------------------------------------------------------------------------------------------");
    }
    
}
