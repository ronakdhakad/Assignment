// Student Result Checker
// Create a class Student with fields: name, mathMarks, scienceMarks.
// Use setters to assign values. Add a method getAverage().
class Student{
    private String name;
    private int maths;
    private int science;
    
    public void d1(String name,int maths,int science){
        this.name=name;
        this.maths=maths;
        this.science=science;
    }
    public void d2(){
        System.out.println("Name of student "+name);
        System.out.println("Marks in maths "+maths);
        System.out.println("Marks in science "+science);
        System.out.println("Average is "+getAverage());
    }
    public float getAverage(){
        float average=((maths+science)/2f);
        return average;
    }
}
class Main {
    public static void main(String args[]){
        Student obj=new Student();
        obj.d1("Sohan",86,76);
        obj.d2();
    }
}
