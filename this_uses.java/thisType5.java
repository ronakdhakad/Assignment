class Animal{
    Animal(Animal2 a2){
        System.out.println("dog, cat ,cow, etc...");
    }
}
class Animal2{
    // Animal2(){
        // System.out.println("Animals --");
        Animal an =new Animal(this);
    // }
}
class Main{
    public static void main(String args[]){
        Animal2 h=new Animal2();
    }
}