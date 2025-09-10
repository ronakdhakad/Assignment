//     1
//    212
//   32123
//  4321234
// 543212345

class Main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k!=0;k--){
                System.out.print(k);    
            }
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}