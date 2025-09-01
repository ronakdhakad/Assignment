/*3. How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed
to cover a rectangular regionwhose length and breadth are 520 cm and 140 cm? */ 
class Main{
    public static void main(String args[]){
        float lengthOfTiles=13;
        float breadthOfTiles=7;
        float length=520;
        float breadth=140;
        float areaOfTiles=lengthOfTiles*breadthOfTiles;
        float area=length*breadth;
        float totalTiles=area/areaOfTiles;
        System.out.println(totalTiles+" tiles are needed to cover rectangular region");
    }
}