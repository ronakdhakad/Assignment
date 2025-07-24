class A{
    public static void main(String args[]){
        //area of floor
        int length = 200;
        int breadth = 400;

        int area_of_floor=(length*breadth);

        //area of one tile 
        int length_tile=5;
        int width_tile=8;
        int area_of_tile=(length_tile*width_tile);

        //no of tile
        int no_of_tile=(area_of_floor/area_of_tile);

        System.out.println("total no of tiles is : "+no_of_tile);
    }
}
