// 34.A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and
// its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases.
// Calculate the area of the wooded area after the addition of the walkway.
 class Main{
    public static void main(String args[]){
        float base1=128;
        float base2=92;
        float height=40;
        double areaOfTrapezoid=(((base1+base2)/2f)*height);
        float wide=4;
        double areaOfWalkway=(((base1+base2)/2f)*wide);
        double totalArea= areaOfTrapezoid+areaOfWalkway;
        
        System.out.println("Total wooded area is: "+totalArea+" m^2");
    }
 }
