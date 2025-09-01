// 32.A square garden with a side length of 150 m has a square swimming pool
// in the very centre with a side length of 25 m . Calculate the area of the garden.
class Main{
    public static void main(String args[]){
        float sideOfGarden=150;
        float sideOfPool=25;

        double areaOfGarden=sideOfGarden*sideOfGarden;
        double areaOfPool=sideOfPool*sideOfPool;

        double remainArea=areaOfGarden-areaOfPool;
        System.out.println(remainArea+" m^2 area of garden");

    }

}