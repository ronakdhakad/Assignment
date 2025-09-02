class Main{
    public static void main(String args[]){
        int k=1;
        for(int i=1;i<=6;i++){
            for(int m=0;m<1;m++){
                System.out.print(k);
                for(int j=1;j<=k;j++){     
                    System.out.print("*");
                }
                k=k+i;
            }
            System.out.println("");
        }
    }
}