class A{
    public static void main(String args[]){
        //bricks for wall
        int length = 15;
        int breadth = 10;
        int height=8;


        //brick in centimeter
        int length_centimeter = length*100;
        int breadth_centimeter = breadth*100;
        int height_centimeter=height*100;

        //volume of wall
        int volume_of_wall=(length_centimeter*breadth_centimeter*height_centimeter);

        // a brick size
        int len = 15;
        int bre = 8;
        int hei=5;

        //volume of one brick 
        int volume_of_brick=(len*bre*hei);

        //bricks used in wall 
        int total_bricks=(volume_of_wall/volume_of_brick);

        System.out.println("total bricks used for wall is : "+total_bricks);
    }
}
