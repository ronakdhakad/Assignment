class Address implements Cloneable{
    // int pin;
    // String city;
    // public Address(){
    //     // this.pin=pin;
    //     // this.city=city;
    // }
    // public int setPin(){
    //     return pin;
    // }
    // public String setCity(){
    //     return city;
    // }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
class ShallowClone implements Cloneable{
    // int id;
    // String name;
    Address addr;
    // public ShallowClone(int id,String name){
    //     this.id=id;
    //     this.name=name;
    // }
    
    public void setAddr(Address addr){
        this.addr=addr;
    }
    public Address getaddr(){
        return addr;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Main{
    public static void main(String[] args) throws Exception{
        Address address =new Address();
        ShallowClone sc=new ShallowClone();
        sc.setAddr(address);

        ShallowClone sc2= (ShallowClone) sc.clone();

        
        // System.out.println(sc.getid()+" "+sc.getname());
        // System.out.println(sc2.getid()+" "+sc2.getname());
        System.out.println(sc.getaddr());
        System.out.println(sc2.getaddr());
    }
}
