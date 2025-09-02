class A{
    public static void main(String args[]){

        float diameter=2.25f;
        float radius=diameter/2f;
        float height=2.25f;
        double pie=3.1416;

        //volume of cylinder (pie*r^2*h)
        double volume=((pie*radius*radius*height));

        System.out.println("volume of cylinder is :"+volume+"cm^3");
    }
}