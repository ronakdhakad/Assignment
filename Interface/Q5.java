interface L{
    void exp();
}
class Main{
    public static void main(String args[]){
        L o=()->{
            System.out.println(" lambda Expression");
        };
        o.exp();
    }
}