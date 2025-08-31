// 26. How many bricks will be required to lay a path 120 m long and 2.4 m breadth
// if a brick is 24 cm long and 15 cm wide?
class Main{
    public static void main(String args[]){
        float length=120;
        float breadth=2.4f;

        float lengthOfBrick=24/100f;
        float widthOfBrick=15/100f;

        double areaOfPath=length*breadth;
        double areaOfBrick=lengthOfBrick*widthOfBrick;

        double totalBricks=areaOfPath/areaOfBrick;
        System.out.println(totalBricks+" bricks required to lay a path");

    }

}