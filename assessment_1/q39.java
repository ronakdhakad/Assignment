class A{
    public static void main(String args[]){

        int diameter=12;
        float radius=diameter/2f;
        int height=9;
        double pie=3.1416;

        //surface area of cylinder (2*pie*r*h)+(2*pie*r^2)
        double surface_area=((2*pie*radius*height)+(2*pie*radius*radius));

        System.out.println("total surface area is :"+surface_area+"cm^2");
    }
}