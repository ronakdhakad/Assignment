/*12.Create a Class Calculate with two data members(num,num1)Declare two member function.
a) create parameterized constructor which takes two integer value and	initialize members with this pointer.
b)sum() :- which displays the number using this
*/
class Calculate {
    int num;
    int num1;
    Calculate(int num, int num1) {
        this.num = num;
        this.num1 = num1;
    }
    void sum() {
        int result = this.num + this.num1;
        System.out.println("Sum of numbers: " + result);
    }
    public static void main(String[] args) {
        Calculate obj = new Calculate(10, 20);
        obj.sum();
    }
}
