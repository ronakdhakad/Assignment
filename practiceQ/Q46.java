class Q46{
     int i;
     void show(){
         System.out.println("show"+i);
     }
     
     void display(int x){
         System.out.println("show"+x);
     }
 }
class Main{
    public static void main(String args[]){
        
        Q46 obj =new Q46();
        obj.show();
        obj.display();
        
    }
}