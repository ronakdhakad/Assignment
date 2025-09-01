class Test{
    public static void main(String args[]){
        for(char ch='A';ch<'F';ch++){
            for(int i=0;i<ch-64;i++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}