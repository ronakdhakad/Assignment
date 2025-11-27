import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {

        
        int arr[]=new int[]{1,4,7,7,4,1};

        int arr2[]= new int[arr.length];

        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        int n=0;
        for(int i=arr2.length-1;i>=0;i--){
            arr2[n]=arr[i];
            n++;
        }

        for(int reverse:arr2){
            System.out.print(reverse+" ");
        }
        boolean rs=false;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==arr2[i]){
                rs=true;
            }else{
                rs=false;
                break;
            }
        }

        System.out.println();

        if(rs==true){
            System.out.println("array is palindroame");
        }else{
            System.out.println("array is not a palindroame");
        }
    }
}
