// x
// xx
// xxx
// xxxx
// xxx
// xx
// x
class Main{
    public static void main(String args[]){
        for(int i=1;i<=7;i++){
    
            if(i<=4){
                for(int j=1;j<=i;j++){
                    System.out.print("x");
                }   
            }else{
                for(int k=8-i;k!=0;k--){
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}