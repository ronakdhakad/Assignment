class Main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=6-i;k++){
                if(i==2&&(k==2||k==3)||(i==3&&k==2))
                   System.out.print("_");
                else
                    System.out.print(k);
            }
            System.out.println();
        }
    }
}