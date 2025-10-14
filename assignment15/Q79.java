class Test{
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                if((i==2&&j==1)||(i==3&&j==1)||(i==3&&j==2)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}