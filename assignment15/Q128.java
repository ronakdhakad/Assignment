//     #
//    *#*
//   **#**
//  ***#***
// ****#****
class Main{
    public static void main(String args[]){
        int n=1;
        for(int i=1;i<=5;i++){
            for(int j=i;j<=4;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                if((n+1)/2==k)
                    System.out.print("#");
                else
                    System.out.print("*");
            }
            System.out.println();
            n+=2;
        }
    }
}