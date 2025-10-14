// 123456789
//  1+++++7
//   1+++5
//    1+3
//     1
class Main{
    public static void main(String args[]){
        for(int i=5;i!=0;i--){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                if(i==5||k==1||k==i*2-1)
                    System.out.print(k);
                else
                    System.out.print("+");
            }
            System.out.println();
        }
    }
}