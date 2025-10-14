//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
class Main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if((k==1)||(k==i)){
                    System.out.print(1+" ");    
                }else{
                        if((i%2!=0)&&k==(i+1)/2){
                            System.out.print(k*2+" ");
                        }else{
                            System.out.print(i-1+" ");
                        }
                }
            }
            System.out.println();
        }
    }
}
 
