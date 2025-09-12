interface Demo{
    int id=123;
    String name="Ronak";
    void data();
}
class Main{
    public static void main(String args[]){
        Demo obj = ()->{
                System.out.println("Data method called");
            };
            obj.data();
        
    }
    
}
