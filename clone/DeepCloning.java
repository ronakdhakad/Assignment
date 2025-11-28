class Address implements Cloneable{
    Address(){

    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class DeepCloning implements Cloneable {
    Address addr;
    DeepCloning(Address addr){
        this.addr=addr;
    }
    public Address getAddr(){
       return addr;
    }

    public Object clone() throws CloneNotSupportedException{
        DeepCloning dc=(DeepCloning)super.clone();
        Address add = dc.getAddr();
        Address add1 = new Address();
        dc.addr=add1;
        return dc;

    }
}
class Main{
    public static void main(String[] args) {
        Address a=new Address();
        Address a1=new Address();
        DeepCloning dc =new DeepCloning(a);
        DeepCloning dc2 =new DeepCloning(a);
        System.out.println();
        System.out.println(dc2);
    }
}
