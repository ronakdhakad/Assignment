/*
34. Create a class Person with properties (name and age) with following features.
a. Default age of person should be 18;
b. A person object can be initialized with name and age;
c. Method to display name and age of person. 
Create and use copy constructor for above problem.
*/
class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Sohan Tirole";
        this.age = 21;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class TestMain
{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.display();
        Person p2 = new Person("Sohan", 21);
        p2.display();
        Person p3 = new Person(p2);
        p3.display();
    }
}

