class Main{
    public static void main(String args[]){
        int n=5; 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1||k==i||i==n){
                    System.out.print("1");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
