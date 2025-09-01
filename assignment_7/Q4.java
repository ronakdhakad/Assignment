import java.util.Scanner;
    class Q4 {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter range of array");
            int n=sc.nextInt();
            int arr[]=new int[n];

            System.out.println("Enter array elements");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("Array elements :- ");
            for (int i=0;i<arr.length;i++){
                System.out.print(" "+arr[i]);
            }
            System.out.println("");
            for (int i = 0;i<arr.length;i++){
                for (int j = i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        arr[i]=arr[i]+arr[j];
                        arr[j]=arr[i]-arr[j];
                        arr[i]=arr[i]-arr[j];
                    }
                }
            }
            System.out.print("Sorted array :- ");
            for (int i=0;i<arr.length;i++){
                System.out.print(" "+arr[i]);
            }
        }
    }