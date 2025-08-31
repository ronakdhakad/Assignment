import java.util.Scanner;
    class Arr9{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter size of elements");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter deleted position");
            int pos=sc.nextInt();

            for(int i=0;i<n;i++){
                System.out.println("Enter "+i+" index data");
                arr[i]=sc.nextInt();
            }
            int del=pos-1;
            for(int i= del;i<arr.length-1;i++){
                arr[del]=arr[del+1];
                del++;
            }
            arr[arr.length-1]=0;
            for(int i=0;i<n;i++){
                System.out.println("Index "+i+"  = "+arr[i]);
            }
        }
    }