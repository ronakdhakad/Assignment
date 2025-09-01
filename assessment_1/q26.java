class A{
    public static void main(String args[]){
        //carton of size
        int length = 12000;
        int breadth = 240;

        //area of path
        int area_path=(length*breadth);

        //dimensions of a brick
        int length_brick =24;
        int width_brick=15;
        int area_brick=(length_brick*width_brick);

        //no of bricks
        int no_of_bricks=(area_path/area_brick);

        System.out.println("no of bricks required is : "+no_of_bricks);
    }
}
