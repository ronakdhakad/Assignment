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
            for(int k=1;k<=i*2;k++){
                if(k==1){
                    System.out.print(k);
                }else{
                    System.out.print(k);
                    System.out.print();
                }
            }
        }
    }
}