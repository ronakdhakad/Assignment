class Test{
    public static void main(String args[]){
        char ch='a';
        for(int i=0;i<5;i++){
            for(int count=0;count<=i;ch++,count++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}