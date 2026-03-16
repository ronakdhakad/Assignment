// class Satvik{
//     public static void main(String args[]){
//         for(int i=0;i<5;i++){
//             for(int j=0;j<5;j++){
//                 if((i==2||j==2)||(i==0&&j==0)||(i==1&&j==0)||(i==0&&j==3)||(i==0&&j==4)||(i==3&&j==4)||(i==4&&j==4)||(i==4&&j==1)||(i==4&&j==0)){
//                     System.out.print("#");
//                 }else{
//                     System.out.print(" ");
//                 }
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

class Satvik{
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if((i==0&&j==1)||(i==1&&j==1)||(i==1&&j==3)||(i==1&&j==4)||(i==3&&j==1)||(i==3&&j==0)||(i==3&&j==3)||(i==4&&j==3)){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}