class GrandParent{
    void show(){
        System.out.println("Show Method called in grandparent");
    }
}
class Parent extends GrandParent{
    @Override
    void show(){
        System.out.println("Show Method called in parent");
    }
}
class Child extends Parent{
      @Override
        void show(){
        System.out.println("Show Method called in child");
    }
}
class Main{
    public static void main(String args[]){
        Child obj=new Child();
        obj.show();
    }
}