class A{
    public static void main(String args[]){

        int Hypotenuse=13;
        int base=12;
        double length;

        //using Pythagoras theorem
        length = Math.sqrt((Hypotenuse*Hypotenuse)-(base*base));

        //area of triangle
        double area_of_triangle=(double)((base*length)/2);

        System.out.println("length of triangle is :"+length+"cm");
        System.out.println("area of triangle is :"+area_of_triangle+"cm^2");

    }
}