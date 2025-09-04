class Main{
    public static void main(String args[]){
        
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if((i==3&&k==2)||(i==4&&(k==2||k==3))){
                    System.out.print("__");
                }else if((i==3||i==4)&&k==1){
                    System.out.print("X_");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}