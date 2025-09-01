class Main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(char k=65;k<=70-i;k++){
                if(i==2&&(k==66||k==67)||(i==3&&k==66))
                   System.out.print("_");
                else
                    System.out.print(k);
            }
            System.out.println();
        }
    }
}