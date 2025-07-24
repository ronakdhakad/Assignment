class A{
    public static void main(String args[]){
        //area of floor
        int length = 800;
        int breadth = 900;
        int area_of_floor=(length*breadth);

        //volume of one cube
        int size=10;
        int area_of_tile=(size*size);

        //no of tile
        int no_of_tile=(area_of_floor/area_of_tile);

        System.out.println("total no of tiles is : "+no_of_tile);
    }
}
