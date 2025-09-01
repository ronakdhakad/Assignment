class A{
    public static void main(String args[]){

        //AP series  -21,-18,-15,-12....
        int a=-21;
        int difference= -18-(-21);

        //no of series
        int n=28;

        //by using nth formula
        int n_th_term=a+(n-1)*difference;

        System.out.println("28th term of series : "+n_th_term);
    }
}

