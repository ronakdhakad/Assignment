class Q46{
     int i;
     void display(int i){
        this.i=i;
         System.out.println("display "+i);
     }
     void show(){
         System.out.println("show "+i);
     }
     
 }
class Main{
    public static void main(String args[]){
        
        Q46 obj =new Q46();
        obj.display(10);
        obj.show();
        
    }
}