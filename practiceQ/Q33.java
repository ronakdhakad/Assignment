// example showing the concept of exception handling 

class Main{
    public static void main(String args[]){
       try{
        Class.forName("Exe");
        System.out.println("class found");
       }catch(ClassNotFoundException e){
            System.out.println("Exception : "+e);
       }
    }
}