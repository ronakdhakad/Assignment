class Main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(char ch=65;ch<=(i*2-1)+64;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}