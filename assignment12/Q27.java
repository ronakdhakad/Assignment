// 27. Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m.
class Main{
    public static void main(String args[]){
        float length=20;
        float width=15;

        float rate =5;
        double area=length*width;
        double cost=area*rate;

        System.out.println("Total cost of tiling a dining a room is: "+cost);

    }
}