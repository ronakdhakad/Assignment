//29.How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?
class Main{
    public static void main(String args[]){
        float side=10;
        float length=800;
        float width=900;

        float areaOfSquare =side*side;
        double area=length*width;
        double totalTiles=area/areaOfSquare;

        System.out.println("Number of tiles is: "+totalTiles);

    }
}