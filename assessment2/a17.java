import java.util.Scanner;
class Coder17{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
    
        //length and width of display board
        System.out.println("enter length of ribbon :");
        int length = sc.nextInt();

        System.out.println("enter width of ribbon :");
        int width = sc.nextInt();

        //perimeter of display board
        int perimeter_of_boarder=2*(length+width);

        System.out.println("perimeter of ribbon is: "+perimeter_of_boarder+"m");
    }
}
