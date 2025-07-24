class A{
    public static void main(String args[]){
        //Dimensions of brick
        int length = 25;
        int width = 10;
        double thickness=7.5;

        //Dimensions of wall in cm
        int length_wall= 20*100;
        int width_wall = 2*100;
        double thickness_wall=0.75*100;

        //volume of brick
        double volume_of_brick=(double)(length*width*thickness);

        //volume of wall
        double volume_of_wall=(double)(length_wall*width_wall*thickness_wall);

        //bricks used in wall 
        double total_bricks=(double)(volume_of_wall/volume_of_brick);

        //cost per 1000 bricks is $900
        double cost_of_total_bricks=(double)((total_bricks*900)/1000);

        System.out.println("number of bricks : "+total_bricks);
        System.out.println("cost of total bricks is : "+cost_of_total_bricks);
    }
}
