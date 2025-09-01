class Main{
    public static void main(String args[]){
        for(int i=5;i!=0;i--){
            for(int j=0;j<i;j++){
                if((i==4&&j==1)||(i==4&&j==2)||(i==3&&j==1))
                    System.out.print(" ");
                else
                    System.out.print(i);
            }
            System.out.println("");
        }
    }
}   