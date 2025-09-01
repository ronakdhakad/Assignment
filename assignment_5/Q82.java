class Main{
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            int count=0;   
            int j=0;    
            for(char ch='A';count<=i;ch++,j++,count++){
                if((i==2&&j==1)||(i==3&&j==1)||(i==3&&j==2))
                    System.out.print(" ");
                else
                    System.out.print(ch);
            }
            System.out.println("");
        }
    }
}