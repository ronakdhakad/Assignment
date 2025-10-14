/*11.Create a Class Number with two member function.
a)showNum() :- which displays the first number using this
b)dispNum() :- which displays the second number using this
*/
class Number{
    private int num1;
    private int num2;
    Number(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    void showNum(){
        System.out.println("showNum\nNum 1 : "+this.num1);
    }
    void dispNum(){
        System.out.println("dispNum\nNum 2 : "+this.num2);
    }
    public static void main(String args[]){
        Number obj1 = new Number(100,200);

        obj1.showNum();
        obj1.dispNum();
    }
}