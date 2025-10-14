/*21.Create a class Alpha and Beta. Both classes contain one data member of type integer. Write a program to find which class data member is greater.*/

class Alpha {
    int A = 10;
}

class Beta {
    int A = 100;
}

class Test {
    public static void main(String args[]) {
        Alpha obj1 = new Alpha();
        Beta obj2 = new Beta();
        
        if(obj1.A>obj2.A)
            System.out.println("Alpha's A is Greater");
        else
            System.out.println("Beta's A is Greater");
    }
}