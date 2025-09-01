import java.util.Scanner;
class Code40 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter cost price");
        int cp=sc.nextInt();
        
        System.out.println("enter selling price");
        int sp=sc.nextInt();

        if(sp>cp){
            int profit=sp-cp;
            System.out.println(profit+" is your profit");
        }else if(cp>sp){
            int loss=cp-sp;
            System.out.println(loss+" is your loss");
        }else{
            System.out.println("no profit or not loss");
        }
    }
    
}

