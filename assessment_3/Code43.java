import java.util.Scanner;
class Code43 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter electricity units");
        int unit=sc.nextInt();

        if(unit<=50){
            float charge=unit*0.50f;
            System.out.println(charge+" is total electricity bill under 50 unit");
        }else if(unit<=150){
            float charge=((unit-50)*0.75f)+(50*0.50f);
            System.out.println(charge+" is total electricity bill under 150 unit ");
        }else if(unit<=250){
            float charge=((unit-150)*1.20f)+(100*0.75f)+(50*0.50f);
            System.out.println(charge+" is total electricity bill under 250 unit ");
        }else{
            float charge=(((unit-250)*1.50f)+(100*1.20f)+(100*0.75f)+(50*0.50f))+(unit*(20/100f));
            System.out.println(charge+" is total electricity bill ");
        }
    }
}
