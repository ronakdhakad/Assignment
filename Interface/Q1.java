interface showable{
    void display();
}
class Test implements showable{
    @Override
    public void display(){
        System.out.println("showable method called");
    }
    public static void main(String args[]){
        Test obj=new Test();
        obj.display();
    }
}