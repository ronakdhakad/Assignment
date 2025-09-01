//33.A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two pathways
// that run perpendicular from its sides. One pathway has a width of 3 m and the other,
// 4 m. Calculate the total usable area of the garden.
 class Main{
    public static void main(String args[]){
        int length=30;
        int breadth=20;

        int width1=3;
        int width2=4;

        int area=length*breadth;
        int areaOfPath=(length*width1)+(breadth*width2)-(width1*width2);
        int totalGardenArea =area-areaOfPath;
        
        System.out.println("Area of Garden is: "+totalGardenArea+" m^2");
    }
 }
