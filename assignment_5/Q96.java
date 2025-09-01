class Main{
    public static void main(String args[]){
        for(int i=5;i!=0;i--){
            for(char ch='A';ch<i+'A';ch++){
                if((i==4&&ch=='B')||(i==4&&ch=='C')||(i==3&&ch=='B'))
                    System.out.print(" ");
                else
                    System.out.print(ch);
            }
            System.out.println("");
        }
    }
}