/*13.Create class Plot with data members length and breadth. Create constructor. Create member functions
a)float calcArea()->to return area of plot
b)Plot compare(Plot p)-> which takes Object of Plot class as argument and return 0 if area of argument object is same as current object, 1 if current object area is > then argument object and -1 if area of argument object is > then current object.
*/
class Plot {
    float length;
    float breadth;

    Plot(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    float calcArea(){
        return length * breadth;
    }

    public int compare(Plot obj) {
        float currentArea = this.calcArea();
        float otherArea = obj.calcArea();

        if (currentArea == otherArea) {
            return 0;
        } else if (currentArea > otherArea) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Plot p1 = new Plot(10.5f, 20.0f);
        Plot p2 = new Plot(15.0f, 15.0f);

        System.out.println("Area of Plot 1: " + p1.calcArea());
        System.out.println("Area of Plot 2: " + p2.calcArea());

        int comparison = p1.compare(p2);
        System.out.println("Comparison result: " + comparison);
    }
}
