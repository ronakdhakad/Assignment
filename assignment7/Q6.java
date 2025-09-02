import java.util.Scanner;
    class Q6 {
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
                int repeat=-2;
                boolean find=false;
                    if(repeat==arr[i]){
                        find=true;
                    }
                int count=1;
                for (int j = i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        repeat=arr[i];
                    }
                }
                if(!find){
                    System.out.println(arr[i]+" occurs "+count+" times");
                }
            }
        }
    }