//    1
//   12
//  123
// 1234
//  123
//   12
//    1
class Main{
    public static void main(String args []){

        for(int i=1;i<=7;i++){

            if(i<=4){
                for(int j=1;j<=4-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print(k);
                }
            }else{
                for(int l=1;l<=i-4;l++){
                    System.out.print(" ");
                }
                for(int m=1;m<=8-i;m++){
                    System.out.print(m);
                }
            }

            System.out.println();

        }
    }
}