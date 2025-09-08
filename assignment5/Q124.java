class Main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                if((k==i*2-1)||(i==5)||k==1){
                    System.out.print("*");
                }else{
                    System.out.print("_");
                }
            }
            System.out.println("");
        }
    }
}