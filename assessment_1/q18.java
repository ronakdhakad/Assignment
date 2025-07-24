class A{
    public static void main(String args[]){
        //length and width of park
        int length = 50;
        int breadth =30;

        //perimeter of park
        int perimeter_of_park=2*(length+breadth);

        //10 rounds per day
        double distance=(double)(perimeter_of_park*10);

        //in kilometer
        double kilometer_per_day=(double)(distance/1000);

        System.out.println("ron covers : "+kilometer_per_day+"km in a day");
    }
}

