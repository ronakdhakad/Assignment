//    *
//   *_*
//  *_*_*
// *_*_*_*
//  *_*_*
//   *_*
//    *  
class Main{
    public static void main(String args[]){
        for(int i=1;i<=7;i++){
            if(i<=4){
                for(int a=i;a<=3;a++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i*2-1;j++){
                    if(j%2==0){
                        System.out.print("_");
                    }else{
                        System.out.print("*");
                    }
                }
            }else{
                for(int b=1;b<i-3;b++){
                    System.out.print(" ");
                }
                for(int k=1;k<=16-(i*2)-1;k++){
                    if(k%2==0){
                        System.out.print("_");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}