class A{
    public static void main(String args[]){

        float radius=7.7f;
        int height=12;
        double pie=3.1416;

        //surface area of cylinder (2*pie*r*h)+(2*pie*r^2)
        double surface_area=((2*pie*radius*height)+(2*pie*radius*radius));

        System.out.println("total surface area is :"+surface_area+"cm^2");
    }
}