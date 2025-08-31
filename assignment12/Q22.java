//22.A pond is 50 m long, 30 m wide and 2 m deep. Find the capacity of the pond in cubic metre.
class Main{
    public static void main(String args[]){
        int length=50;
        int breadth=30;
        int height=20;

        double volumeOfCube=length*breadth*height;

        System.out.println("Capacity of the pond is: "+volumeOfCube+" M^3");
        
        //In liter
        System.out.println("1 M^3 = 1000 liter");
        double diff=volumeOfCube*1000f;
        System.out.println("Capacity of the pond is: "+diff+" Liter");


    
    }
}