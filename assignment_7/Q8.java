import java.util.Scanner;
    class Q8 {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter range of array");
            int n=sc.nextInt();
            int arr[]=new int[n];

            System.out.println("Enter array elements");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter addition");
            int s= sc.nextInt();
            int sum=0;
            boolean find=false;
            for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length;j++){
                    sum=sum+arr[j];
                    if(s==sum){
                        if(!find)
                            System.out.println(" The sum of elements from "+i+" position to "+(j)+" position is "+s+".");
                        else
                            System.out.println(" The sum of elements from "+(i+i)+" position to "+(j)+" position is "+s+".");
                        break;
                    }else if(s<sum){
                        s=sum-arr[i];
                        find= true;
                    }
                }
            }
        }
    }