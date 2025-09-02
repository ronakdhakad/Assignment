class Child{
    int data(int a,int b){
        return a*b;
    }
    int data(int a,int b,int c){
        return a*b*c;
    }
    void value(double a,int b){
        System.out.println("a\t"+a+"\tb\t"+b);
    }
     void value(int a,double b){
        System.out.println("a\t"+a+"\tb\t"+b);
    }
}
class Main{
    public static void main(String args[]){
        Child obj=new Child();
        System.out.println("Two parameters ");
        System.out.println(obj.data(2,3));
        System.out.println("Three parameters");
        System.out.println(obj.data(2,3,4));

        System.out.println("With diff data types");
        obj.value(2.2,3);
        System.out.println("same no. of argument but diff. data types");
        obj.value(2,3.3);
    }
}