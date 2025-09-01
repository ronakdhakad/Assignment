class A{
    public static void main(String args[]){

        //AP series  -21,-18,-15,-12....
        int a=-21;
        int difference= -18-(-21);

        //no of series
        int n=28;

        //by using Sn_th formula
        float sum_of_n_number=(float)((n/2f)*(2*a+(n-1)*difference));

        System.out.println("sum of 28th term : "+sum_of_n_number);
    }
}

