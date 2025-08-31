import java.util.Scanner;
    class Q1 {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter range of array");
            int n=sc.nextInt();
            int arr[]=new int[n];

            System.out.println("Enter array elements");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            //System.out.println("Enter index of array");
            //int a= sc.nextInt();
            int peak=0;
            for(int i=1;i<arr.length-1;i++){
                if(arr[0]>arr[1]||arr[arr.length-1]>arr[arr.length-2]){
                    peak=1;
                    break;
                }else if((arr[i-1]<=arr[i])&&(arr[i]>=arr[i+1])){
                    peak=1;
                    break;
                }else{
                    peak=0;
                }
            }
            System.out.println("Output is "+peak);
        }
    }