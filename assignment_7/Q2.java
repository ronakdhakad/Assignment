import java.util.Scanner;
    class Q2{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter range of array");
            int n=sc.nextInt();
            int arr[]=new int[n];

            System.out.println("Enter array elements");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            int max =arr[0];
            int min =arr[0];
            for(int i=0;i<arr.length;i++){
                    if(max<=arr[i]){
                        max=arr[i];
                    }else if(min>=arr[i]){
                        min=arr[i];
                    }   
            }
            System.out.println("Maximum element is "+max);
            System.out.println("Minimum element is "+min);
        }
    }