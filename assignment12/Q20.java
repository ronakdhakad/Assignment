//20. What is the volume of a brick of ice-cream with length 25 cm, breadth 10 cm and height 8 cm?
class Main{
    public static void main(String args[]){
        int length=25;
        int breadth=10;
        int height=8;

        double volumeOfCuboid=length*breadth*height;

        System.out.println("Volume of brick of ice-cream is: "+volumeOfCuboid+" CM^3");
        System.out.println("1 CM^3 = 1 ML and 1000 ML = 1 liter");
        double diff=volumeOfCuboid/1000f;
        System.out.println("Volume of brick of ice-cream is: "+diff+" Liter");


    
    }
}