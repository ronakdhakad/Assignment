// A B C D E
//  A B C D
//   A B C
//    A B
//     A
class Main{
    public static void main(String args[]){
        for(int i=5;i!=0;i--){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(char k='A';k<=i+64;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}