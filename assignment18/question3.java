import java.util.Scanner;
class Test
{
    int number;       
    long factorial;   

    void init()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
      
    }

        void fact() 
        {
        factorial = 1;
        for (int i = 1; i <= number; i++) 
        {
            factorial *= i;
        }
    }    
    void display() 
    {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

     
    public static void main(String[] args) 
    {
         Test obj = new  Test();
        obj.init();
        obj.fact();
        obj.display();
    }
}
