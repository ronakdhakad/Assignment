import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        int arm=num;
        int temp=arm;
            while(num>0){
                num=num/10;
                count++;
            }
            double sum=0;
            int rem;
            while(arm>0){
                rem=arm%10;
                sum=sum+(Math.pow(rem,count));
                arm=arm/10;
            }
        if(sum==temp){
            System.out.println(temp+" is armstrong");
        }else{
            System.out.println(temp+" is not armstromg");
        }
    }
    
}
