class A{
    public static void main(String args[]){
        //area of garden
        int length = 30;
        int breadth = 20;

        int area_of_garden=(length*breadth);

        //volume of one cube
        int width_path1=3;
        int length_path2=4;
        int area_of_two_path=((length*width_path1)+(breadth*length_path2));

        //overlapping area
        int over_area=(width_path1*length_path2);

        //actual path area of path
        int area_of_path=area_of_two_path-over_area;

        //used area of garden
        int used_area=area_of_garden-area_of_path;

        System.out.println("total used area of garden is : "+used_area);
    }
}
