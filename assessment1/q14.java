class A{
    public static void main(String args[]){
        int base = 46;

        //for triangle1
        int height1 = 13;
        
        //for triangle2
        int height2 = 10;

        //area of triangle1
        double area_of_triangle1=(double)((base*height1)/2);

        //area of triangle2
        double area_of_triangle2=(double)((base*height2)/2);

        //to find area of rectangle
        double area_of_rect =(double)(area_of_triangle1+area_of_triangle2);

        System.out.println("area of rectangle is: "+area_of_rect+"m^2");
    }
}

