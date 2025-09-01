class A{
    public static void main(String args[]){
        int area =320;
        double base_ratio=8;
        double height_ratio=5;
        double area_ratio=((base_ratio*height_ratio)/2);

        double sqrt_area_ratio=(area/area_ratio);
        double sqrt=Math.sqrt(sqrt_area_ratio);

        double base= sqrt*base_ratio;
        double height=sqrt*height_ratio;
        System.out.println(base);
        System.out.println(height);




    }
}