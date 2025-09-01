class Main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(char k=65;k<=70-i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}