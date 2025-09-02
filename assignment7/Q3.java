import java.util.Scanner;
    class Q3 {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter range of array");
            int n=sc.nextInt();
            int arr[]=new int[n];

            System.out.println("Enter array elements");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("Array :-");
                for(int i=0;i<arr.length;i++){
                    System.out.print(" "+arr[i]);
                }
            System.out.println("");
            int mid;
            mid=arr.length/2;
            int j=arr.length-1;
                for(int i=0; i<(mid); i++,j--){
                    if(mid==i){
                        break;
                    }else if((mid)>i){
                        arr[i]=arr[i]+arr[j];
                        arr[j]=arr[i]-arr[j];
                        arr[i]=arr[i]-arr[j];
                    }
                }
                System.out.print("Reverce array:- ");
                for(int i=0;i<arr.length;i++){
                    System.out.print(" "+arr[i]);
                }
        }
    }