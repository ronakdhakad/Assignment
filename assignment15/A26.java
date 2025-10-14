import java.util.Scanner;
class A26{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N terms");
        int n=sc.nextInt();
        int cube;
        for(int i=0;i<n;i++){
            if(i%2==0){
                cube=i*i*i;
                System.out.print(cube+" ");
            }else{
                System.out.print("");
            }
        }
    }
}


