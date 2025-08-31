/*21. A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height.
How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres? */
class Main{
    public static void main(String args[]){

        //Bricks in centimeter
        float length=15;
        float breadth=8;
        float height=5;

        //Wall in meters
        float length1=15;
        float breadth1=10;
        float height1=8;

        //Wall incentimeter
        length1=length1*100;
        breadth1=breadth1*100;
        height1=height1*100;


        double areaOfBrick=length*breadth*height;
        double areaOfWall=length1*breadth1*height1;
        double totalBricks=areaOfWall/areaOfBrick;
        System.out.println(totalBricks+" bricks will be used to make a wall");
    }
}