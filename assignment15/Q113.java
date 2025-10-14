class Main{
    public static void main(String args[]){
        for(int i=5;i!=0;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(i==4&&(k==2||k==3)||(i==3&&k==2))
                   System.out.print("_");
                else
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}