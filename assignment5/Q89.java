class Main{
    public static void main(String args[]){
        int x=0;
        for(int i=1;i<=5;i++,x=x+1){
            for(int j=1;j<=i+x;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}