class Main{
    public static void main(String args[]){
        int x=1;
        char k=65;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=x;j++,k++){
                System.out.print(k);
            }
            x=x+2;
            System.out.println();
        }
    }
}