class A{
    public static void main(String args[]){
        //carton of size
        int length = 15;
        int breadth = 9;
        int height=12;

        //volume of cubical carton
        int volume_of_carton=(length*breadth*height);

        //volume of one cube
        int size=3;
        int volume_of_cube=(size*size*size);

        //no of cubes
        int no_of_cubes=(volume_of_carton/volume_of_cube);

        System.out.println("total no of cubes is : "+no_of_cubes);
    }
}
