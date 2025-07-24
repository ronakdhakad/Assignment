class A{
    public static void main(String args[]){
        int len_tiles=13;
        int bre_tiles =7;
        int len_region=520;
        int bre_region=140;
        int area_tiles;
        int area_region;
        int no_of_tiles;
        area_tiles=(len_tiles*bre_tiles);
        area_region=(len_region*bre_region);
        no_of_tiles=(area_region/area_tiles);
        System.out.println("No. of tiles :"+no_of_tiles);




    }
}