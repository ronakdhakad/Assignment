class A{
    public static void main(String args[]){

        int volume=1287;

        double radius=10;
        double height;
        double pie=3.1416;
        height=(double)(volume/(pie*radius*radius));

        //surface area of cylinder (2*pie*r*h)+(2*pie*r^2)
        double surface_area=((2*pie*radius*height)+(2*pie*radius*radius));

        System.out.println("total surface area is :"+surface_area+"cm^2");
    }
}