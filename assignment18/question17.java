/*17.Create a class Box with data members (boxlabel, length , width, height) and function that calculate and return volume of that box. Now create a function comapre that take an object of Box class as parameters and show boxlabel of object who’s volume is greater?. you need to create two object of Box
class to compare.
*/
class Box {
    private String boxlabel;
    private float length;
    private float width;
    private float height;

    Box(String boxlabel, float length, float width, float height){
        this.boxlabel = boxlabel;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    float volume() {
        return length*width*height;
    }

    void compare(Box box1) {
        if(this.volume()>box1.volume())
            System.out.println("Box Lable : "+this.boxlabel);
        else
            System.out.println("Box Lable : "+box1.boxlabel);
    }

    public static void main(String args[]){
        Box box1 = new Box("BOX1",10,20,30);
        Box box2 = new Box("BOX2",11,22,33);

        box2.compare(box1);
    }

}