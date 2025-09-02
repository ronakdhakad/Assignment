class Main{

    void series(int m){
        int a=1;
        int b=2;
        int sum=1;
        while(m!=0){
            System.out.print(" "+sum);
            sum=a*b;
            b=a;
            a=sum;
            m--;
        }

    }

    public static void main(String arg[]){
        Main obj=new Main();
        obj.series(6);
    }
}