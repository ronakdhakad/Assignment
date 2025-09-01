class A{
    public static void main(String args[]){

        int base1=128;
        int base2= 92;
        int height = 40;
        int width=4;

        float area_of_trapezoid=(1/2f)*((base1+base2)*height);

        int walk_area=width*height;

        float total_area=area_of_trapezoid+walk_area;

        System.out.println("wooded area of walked in trapezoid is : "+total_area+"m^2");
    }
}
