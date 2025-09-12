class Demo{
    static int num=10;
    static String name="Ronak";
    void display(){
        System.out.println("Num: "+num+"\nName: "+name);
    }
}
class Main{
    public static void main(String a[]){
        Demo o=new Demo();
        o.display();
    }
}