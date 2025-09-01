/*4. Find the cost of tiling a rectangular plot of land 300 m long
 and 150 m wide at the rate of $6 per hundred square m.  */
 class Main{
    public static void main(String args[]){
        int length=300;
        int width=150;
        int area=length*width;
        double rate=(area/100)*6;
        System.out.println("The cost of tiling is: "+rate+"$");
    }
 }