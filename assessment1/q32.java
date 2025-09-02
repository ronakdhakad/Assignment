class A{
    public static void main(String args[]){

        int garden_side=150;
        int garden_area=garden_side*garden_side;

        int pool_side = 25;
        int pool_area=pool_side*pool_side;

        //area of remaining garden
        int area=garden_area-pool_area;

        System.out.println("area of remaining garden is : "+area+"m^2");
    }
}

