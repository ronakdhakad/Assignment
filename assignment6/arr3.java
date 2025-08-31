/*WAP to program calaculate the sum of all even
element and all odd element of array*/
import java.util.Scanner;
class arr3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        //int n=;
        int arr[]=new int[sc.nextInt()];
        int sumP =0;
        int sumN =0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the data");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumP=sumP+arr[i];
            }else{
                sumN=sumN+arr[i];
            }

        }
        System.out.println("Sum of even number is "+sumP);
        System.out.println("Sum of odd number is "+sumN);
    }
    
}
