class This{
    
    This num(){
        return this;
    }

    This max(){
        return this;
    }

}
class Main{
    public static void main(String args[]){
        This t =new This();
        System.out.println(t.num());// this return the current class instance from the method. 
        System.out.println(t.max());
    }
}