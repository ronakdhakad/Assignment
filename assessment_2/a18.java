import java.util.Scanner;
class Code18{
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        //length and width of park

        System.out.println("enter length of park ");
        int length = sc.nextInt();

        System.out.println("enter breadth of park ");
        int breadth =sc.nextInt();

        //perimeter of park
        int perimeter_of_park=2*(length+breadth);

        //10 rounds per day
        double distance=(double)(perimeter_of_park*10);

        //in kilometer
        double kilometer_per_day=(double)(distance/1000);

        System.out.println("ron covers : "+kilometer_per_day+"km in a day");
    }
}


