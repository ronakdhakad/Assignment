/*8. Modify the above question to allow student to sit if he/she has medical cause.
 Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/

import java.util.Scanner;
class Code8{
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter total no. of classes");
        float held_classes=sc.nextInt();
    
        System.out.println("enter no. of attendance  ");
        float attended_classes=sc.nextInt();

        float percent_of_attendance =(float)((attended_classes/held_classes)*100f);
        
        float range=75;
        System.out.println("If you have medical cause or not type ( 'Y' or 'N' )");

        if(percent_of_attendance >=range){
            System.out.println("your attendance  is :"+percent_of_attendance +" you are allowed to sit in exam your attendance  is above 75% ");
        }else if(sc.next().charAt(0)=='y'){
            System.out.println("your have a medical cause your attendance  is :"+percent_of_attendance );
        }else{
            System.out.println("your attendance  is :"+percent_of_attendance +" you are not allowed to sit in exam your attendance  is under 75% ");
        }

    }

    
}
