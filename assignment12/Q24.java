// 24.How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick
//  will be required for a wall 20 m long, 2 m high and 0.75 m thick?
//  If bricks sell at $900 per thousand what will it cost to build the wall?
class Main{
    public static void main(String args[]){

        //Bricks in centimeter
        float length=25;
        float breadth=10;
        float height=7.5f;

        //Wall in meters
        float length1=20;
        float breadth1=2;
        float height1=0.75f;

        //Wall incentimeter
        length1=length1*100;
        breadth1=breadth1*100;
        height1=height1*100;

        double perBricks=1000;
        double perBricksPrice=900;

        double areaOfBrick=length*breadth*height;
        double areaOfWall=length1*breadth1*height1;
        double totalBricks=areaOfWall/areaOfBrick;
        double totalCost=(totalBricks/perBricks)*perBricksPrice;

        System.out.println(totalBricks+" = Total Bricks");
        System.out.println(totalCost+" = Total Cost ");
    }
}