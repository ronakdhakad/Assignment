// 1
// 1 2
// 1  3
// 1   4
// 1  3
// 1 2
// 1
class Main{
    public static void main(String args[]){
        
        for(int i=1;i<=7;i++){
            
            if(i<=4){
                for(int j=1;j<=i;j++){
                    if(j==1||j==i)
                        System.out.print(j);
                    else
                        System.out.print(" ");
                }
            }else{
                for(int k=1;k<=8-i;k++){
                    if(k==1||k==8-i)
                        System.out.print(k);
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}