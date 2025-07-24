class A{
    public static void main(String args[]){

        int cost_per_meter=5;
        int length=20;
        int width = 15;

        //area of brick
        int area_of_floor=length*width;

        //cost per square meter
        int cost=cost_per_meter*area_of_floor;

        System.out.println("cost of tiling dinner is : "+cost+"m^2");
    }
}


