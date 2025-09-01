class Main{
    public static void main(String args[]){
        for(int i=6;i!=0;i--){
            if(i%2==0){
                for(int k=1;k<=i;k++){
                    System.out.print(k);
                }
            }else{
                for(int j=i;j!=0;j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}