//WAP to find an element in array.
import java.util.Scanner;
    class arr4 {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the data");
            int n =sc.nextInt();
            int arr[]={10,20,30,40,50};
            boolean find =false;

            for(int i=0;i<arr.length;i++){
                if(n==arr[i]){
                    System.out.println("number is found ");
                    find=true;
                    break;
            }}
            if(!find){
                System.out.println("Not found");
            }

        }
}