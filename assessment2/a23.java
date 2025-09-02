import java.util.Scanner;
class Code23{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //carton of size
        System.out.println("enter length");
        int length = sc.nextInt();

        System.out.println("enter breadth");
        int breadth = sc.nextInt();

        System.out.println("enter height");
        int height=sc.nextInt();

        //volume of cubical carton
        int volume_of_carton=(length*breadth*height);

        //volume of one cube
        System.out.println("enter size");
        int size=sc.nextInt();
        int volume_of_cube=(size*size*size);

        //no of cubes
        int no_of_cubes=(volume_of_carton/volume_of_cube);

        System.out.println("total no of cubes is : "+no_of_cubes);
    }
}
