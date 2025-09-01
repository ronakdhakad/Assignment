class A{
    public static void main(String args[]){
        //cube
        int edge = 7;
        int volume_of_cube=(edge*edge*edge);

        //cuboid
        int length=7;
        int width = 4;
        int height=8;
        int volume_of_cuboid=length*width*height;
        
        //difference
        int difference=volume_of_cube-volume_of_cuboid;

        System.out.println("difference between cube and cuboid: "+difference+"cm^2");
    }
}
