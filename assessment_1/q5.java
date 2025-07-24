class A{
    public static void main(String args[]){
        int fence_cost=1600;
        int length =20;
        int rate_per_meter=25;
        int perimeter=(fence_cost/rate_per_meter);
        int breadth;
        int area_of_field;
        breadth=((perimeter/2)-length);
        area_of_field=(length*breadth);
        System.out.println("breadth of field is: "+breadth);
        System.out.println("perimeter of field is: "+perimeter);
        System.out.println("area of field is: "+area_of_field);




    }
}