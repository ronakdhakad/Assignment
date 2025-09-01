import java .util.Scanner;
class TestMain {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter range :");
        int l=sc.nextInt();
        int i=0;
        for(char upper='A',lower='a';i<l;upper++,lower++,i++){
            if(i%2==0){
                System.out.print(upper+" ");
            }else{
                System.out.print(lower+" ");
            }
        }

    }
    
}

