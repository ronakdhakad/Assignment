//8. WAP to insert a element in array at specific position.
import java .util.Scanner;
class Arr8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of element");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        
        System.out.println("Enter the data");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter an new number");
        int num=sc.nextInt();
        System.out.println("enter the position of element");
        int pos=sc.nextInt();
        pos = pos-1;
        
        int Oldnum;
        for(int i=(pos) ; i<arr.length ; i++)
        {
            Oldnum = arr[i];
            arr[i] = num;
            num = Oldnum;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
