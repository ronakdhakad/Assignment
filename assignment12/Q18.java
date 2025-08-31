//18. Ron jogs around a rectangular park of length 50 m and breadth 30 m. If he takes 10 rounds of the park each day,
// how much distance does he cover in a day in km?
class Main {
    public static void main(String args[]){
        int length =50;
        int breadth =30;
        int rounds=10;
        int perimeter =2*(length+breadth);
        int distance=perimeter*rounds;
        double distanceInKm=(distance/1000.2f);
        System.out.println("Distance covered in a day is: "+distanceInKm+" KM");
    }
}