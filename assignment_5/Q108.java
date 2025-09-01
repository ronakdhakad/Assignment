class Main{
    public static void main(String args[]){
        int n=5; 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(char k=65;k<=i+64;k++){
                if(k==1+64||k==i+64||i==n){
                    System.out.print(k);
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
