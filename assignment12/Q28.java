// 28. A carpet is 5 m long and 4 m wide. Find its price at the rate of $ 205 per square meter.
class Main{
    public static void main(String args[]){
        float length=5;
        float width=4;

        float rate =205;
        double area=length*width;
        double cost=area*rate;

        System.out.println("Price of the carpet is: "+cost);

    }
}