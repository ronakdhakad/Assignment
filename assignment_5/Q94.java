class Main{
    public static void main(String args[]){
        int j=6;
        char ch='E';
        for(;ch>='A';ch--){
            j--;
            for(int i=j;i!=0;i--){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}