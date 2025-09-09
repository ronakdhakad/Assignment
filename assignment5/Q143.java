//    *
//   *_*
//  *___*
// *_____*
//  *___*
//   *_*
//    *
class Main{
    public static void main(String args[]){
        for(int i=1;i<=7;i++){
            if(i<=4){
                for(int j=1;j<=4-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i*2-1;k++){
                    if(k==1||k==i*2-1)
                        System.out.print("*");
                    else
                        System.out.print("_");
                }
            }else{
                for(int j=1;j<=i-4;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=15-i*2;k++){
                    if(k==1||k==15-i*2)
                        System.out.print("*");
                    else
                        System.out.print("_");
                }
            }
            System.out.println();
        }  
    }
}