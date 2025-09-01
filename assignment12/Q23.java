// 23.Find the number of cubical boxes of cubical side 3 cm which
// can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
class Main{
    public static void main(String args[]){
        int length1=3;
        int breadth1=3;
        int height1=3;

        int length=15;
        int breadth=9;
        int height=12;

        double cubeBoxes=length1*breadth1*height1;
        double volumeOfCube=length*breadth*height;

        double diff=volumeOfCube/cubeBoxes;

        System.out.println("Number of boxes is: "+diff+" boxes");


    
    }
}