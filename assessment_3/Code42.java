import java.util.Scanner;
class Code42 {
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic salary");
        int salary=sc.nextInt();
        float HRA;
        float DA;
        double gross_salary;

        if(salary<=10000){
            HRA=salary*(20/100f);
            DA=salary*(80/100f);
            gross_salary=(salary+HRA+DA);
            System.out.println(gross_salary+" is your gross salary");
        }else if(salary<=20000){
            HRA=salary*(25/100f);
            DA=salary*(90/100f);
            gross_salary=(salary+HRA+DA);
            System.out.println(gross_salary+" is your gross salary");
        }else if(salary>20000){
            HRA=salary*(30/100f);
            DA=salary*(95/100f);
            gross_salary=(salary+HRA+DA);
            System.out.println(gross_salary+" is your gross salary");
        }
    }


    
}
