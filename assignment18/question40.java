/*40. Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
a. Create default and parameterized constructor;
b. Method show(): to print all data member information;
Write main function in another class(Say XYZ) and store three TwoBHK flat’s information and print information using show method. Also print total amount of all flats.
*/
class OneBHK {
    int roomArea,room2Area, price, hallArea;
    OneBHK() {
        roomArea = 100;
        hallArea = 200;
        room2Area = 150;
    }
    OneBHK(int price){
        this.price = price;
    }
    void show() {
        System.out.println("Room 1 Area : "+roomArea);
        System.out.println("Room 2 Area : "+room2Area);
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