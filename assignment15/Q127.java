//     A
//    B B
//   C  C
//  D    D
// EEEEEEEEE
class Main{
    public static void main(String args[]){
        for(char i=65;i<70;i++){
            for(int j=i;j<70;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(i-64)*2-1;k++){
                if(k==1||k==(i-64)*2-1||i==69)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}