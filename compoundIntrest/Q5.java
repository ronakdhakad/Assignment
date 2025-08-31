import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String color=sc.nextLine();

        switch(color.toLowerCase()){
            case "red":System.out.println("it is a red color");break;
            case "blue":System.out.println("It is green");break;
            case "orange":System.out.println("It is orange");break;
                default:
                    System.out.println("other color");
        }
    }
    
}
