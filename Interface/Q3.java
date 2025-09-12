interface R{
    int a=12;
    String b="mpif";
    void m();
}
class Main{
    public static void main(String...args){
    // int a=12;
    // String b="mpif";
    Main obj=new R(){
        @Override
        public void m(){
            System.out.println("A: "+a+" B: "+b );
        }
    };
    obj.m();
    }
}
