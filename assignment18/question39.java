/*39. Create class OneBHK with instance variable roomArea , hallArea and price
a. Create default and parameterized constructor;
b. Method show(): to print OneBHK data member information;
*/
class OneBHK {
    int roomArea, price, hallArea;
    OneBHK() {
        roomArea = 100;
        hallArea = 200;
    }
    OneBHK(int price){
        this.price = price;
    }
    void show() {
        System.out.println("Room Area : "+roomArea);
        System.out.println("Hall Area : "+hallArea);
        System.out.println("Price     : "+price);
    }
}

class TestMain {
    public static void main(String args[]) {
        OneBHK obj = new OneBHK(15000);

        obj.show();
    }
}