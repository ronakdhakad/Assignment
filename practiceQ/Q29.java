class Ex{
    int s;
    int r;
    Ex(int s,int r){
        this.s=s;
        this.r=r;
        // System.out.println("Throws exception: ");
    }
    void exc(){
    try{
       int sum=s/r;
    System.out.println("Throws exception:-- "+sum);
    }catch(Exception e){
        System.out.println("");
    System.out.println("Throws exception: "+e);
    }finally{
        // System.out.println("Throws exception: ");
    }
}
}
class Main{
    public static void main(String args[]){
        int s=12;
        int r=0;
        Ex ex=new Ex(s,r);
        ex.exc();
    }
}