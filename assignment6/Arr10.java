import java.util.Scanner;
    class Arr10{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter range of array");
            int range=sc.nextInt();
            int arr[]=new int[range];

            for(int i=0; i<arr.length;i++){
                System.out.println("Enter an elements");
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        int swap=arr[i]+arr[j];
                        arr[i]=arr[j];
                        arr[j]=swap-arr[j];
                    }
                }
            }
            // for(int i=0;i<arr.length;i++){
            //     System.out.printf(arr[i]+" ");
            // }
            for(int i=0;i<arr.length;i++){
                int count=1;
                boolean find=false;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        find=true;
                    }else{

                    }
                }
                if(find){
                    break;
                }else if(count==0){
                    System.out.println(arr[i]+" is repeated "+count+" times");
                }else
                    System.out.println(arr[i]+" is repeated "+count+" times");
            }


        }
    }