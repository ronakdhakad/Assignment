class Main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(char k=65;k<65+i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}