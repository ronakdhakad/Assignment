class Main{
    public static void main(String args[]){
        for(int i=5;i!=0;i--){
            for(int j=0;j<i;j++){
                if(i%2==0)
                    System.out.print("#");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}