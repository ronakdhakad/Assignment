class Main{
    public static void main(String... args){
        Thread t1 = new Thread(()->System.out.println("Run Method Excute"));
        t1.start();
    }
}