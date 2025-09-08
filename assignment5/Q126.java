//     1
//    1*1
//   1***1
//  1*****1
// 11111111
class Main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                if(k==1||k==i*2-1||i==5)
                    System.out.print("1");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}