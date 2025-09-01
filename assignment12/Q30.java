// 30. How many tiles of length 5 cm and breadth 8 cm are needed to tile
// the floor of a bed room 200 cm long and 400 cm wide?
class Main{
    public static void main(String args[]){
        float length=5;
        float breadth=8;

        float len=200;
        float wide=400;

        double areaOfTiles=length*breadth;
        double areaOfRoom=len*wide;
        double totalOfTiles=areaOfRoom/areaOfTiles;

        System.out.println(totalOfTiles+" tiles is needed to tile the floor");

    }
}