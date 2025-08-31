class Main{
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                if((i==2&&j==1)||(i==3&&j==1)||(i==3&&j==2)){
                    System.out.print(" ");
                }else{
                    if(j%2==0){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }   
            }
            System.out.println("");
        }
    }
}