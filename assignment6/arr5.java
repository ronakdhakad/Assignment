import java.util.Scanner;
class arr5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the data");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                arr[i]=0;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println("array data "+arr[i]);
        }
    }
    
}

