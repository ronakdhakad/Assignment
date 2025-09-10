// 1
// 12
// 123
// 1234
// 123
// 12
// 1
class Main{
    public static void main(String args[]){
        for(int i=1;i<=7;i++){
    
            if(i<=4){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }   
            }else{
                for(int k=1;k<=8-i;k++){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}