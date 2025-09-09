class Main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==1||j==5){
                    System.out.print("|");
                }else if(i==1||i==5){
                    System.out.print("_");
                }else if(i==3&&j==3){
                    System.out.print("X");
                }else if(i+j==6&&i!=3){
                    System.out.print("/");
                }else if(j==i){
                    System.out.print("\\");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}