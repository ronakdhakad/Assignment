class Main{
    public static void main(String args[]){
        int x=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=x;j++){
                System.out.print("*");
            }
            x+=i;
            System.out.println();
        }
    }
}