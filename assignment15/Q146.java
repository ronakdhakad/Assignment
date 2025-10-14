
// *        *
// **      **
// ***    ***
// ****  ****
// **********
class Main{
    public static void main(String args[]){
        System.out.println();
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=11-i*2;l++){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}