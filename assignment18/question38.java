/*38.Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.*/
import java.util.Scanner;
import java.lang.Math;
class Tile {
    double edge;
    public Tile(double edge) {
        this.edge = edge;
 }
}
class Floor {
    double length;
    double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public int totalTiles(Tile t) {
        double floorArea = length * width;
        double tileArea = t.edge * t.edge;
        int tilesNeeded = (int)Math.ceil(floorArea / tileArea);
        return tilesNeeded;
    }
}
class TestMain
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter floor length: ");
        double fLength = sc.nextDouble();
        System.out.print("Enter floor width: ");
        double fWidth = sc.nextDouble();

        System.out.print("Enter tile edge length: ");
        double tEdge = sc.nextDouble();

        Floor floor = new Floor(fLength, fWidth);
        Tile tile = new Tile(tEdge);

        System.out.println("Total tiles needed: " + floor.totalTiles(tile));
    }
}

