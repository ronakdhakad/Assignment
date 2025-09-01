//19. A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has more volume?
class Main{
    public static void main(String args[]){

        int edgeOfCube=7;

        //size of cuboid
        int size1=7;
        int size2=4;
        int size3=8;

        double volumeOfCube=Math.pow(edgeOfCube,3);
        double volumeOfCuboid=size1*size2*size3;

        if(volumeOfCube>volumeOfCuboid){
            double diff=volumeOfCube-volumeOfCuboid;
            System.out.println("Volume of cube is more: "+diff);
        }else{
            double diff=volumeOfCuboid-volumeOfCube;
            System.out.println("Volume of cuboid is more: "+diff);
        }


    
    }
}