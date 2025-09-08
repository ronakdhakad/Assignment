// 5 5 5 5 5
//  4 4 4 4
//   3 3 3
//    2 2
//     1
class Main{
    public static void main(String args[]){
        for(int i=5;i!=0;i--){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int k=i;k!=0;k--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}