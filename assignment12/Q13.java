//13. The area of a right triangle is 184 cm² and one of its legs is 16 cm long. Find the length of other leg.
class Main{
    public static void main(String args[]){
        int area=184;
        int legs1=16;
        int legs2;

        legs2=(area*2)/legs1;

        System.out.println("Length of other leg is: "+legs2);
        
    }
}