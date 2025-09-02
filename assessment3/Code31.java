import java.util.Scanner;
class Code31 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter Celsius for 'c' and fahrenheit for 'f'");
        char a=sc.next().toLowerCase().charAt(0);

        //System.out.println("enter Fahrenheit");
        //char f=sc.next().toLowerCase().charAt(0);

        if(a=='f'){
            System.out.println("enter celsius ");
            int celsius=sc.nextInt();
            float Fahrenheit=(float)((celsius*(9/5f)+32));
            System.out.println("Fahrenheit is: "+Fahrenheit);
        }else if(a=='c'){
            System.out.println("enter Fahrenheit");
            int Fahrenheit=sc.nextInt();
            float celsius=(float)((Fahrenheit-32)*(5/9f));
            System.out.println("celsius is: "+celsius);
        }

    }
    
}
