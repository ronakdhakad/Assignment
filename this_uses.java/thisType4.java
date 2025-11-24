class Animal{

    void dog(Animal aobj){
        System.out.println("dog method called..");
    }

    void bark(){
        dog(this);
        System.out.println("dog barks..");
    }
}

class Main{
    public static void main(String args[]){
        Animal a =new Animal();
        a.bark();
    }
}