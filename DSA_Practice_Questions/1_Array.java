import java.util.Scanner;
class Array{
     public static void Fun(){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter no. of array elemrnt:");
            int n=sc.nextInt();

            int arr[]=new int[n];
            System.out.println("Enter array elemrnts:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int maxSum=0;
            int a=0;
            int b=0;

            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int sum;
                    if(arr[i]>arr[j]){
                        sum =arr[i]-arr[j];
                    }else{
                        sum =arr[j]-arr[i];
                    }
                    if(sum %2 !=0 && sum>maxSum){
                        maxSum=sum;
                        a=arr[i];
                        b=arr[j];
                    }
                }
            }

            System.out.println("diff: "+maxSum);
            System.out.println("pairs: "+a+" "+b);

        }
    public static void main(String args[]){
       Fun();
    }
}