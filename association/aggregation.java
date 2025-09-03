class Address{
    String city;
    String agg;
    void Address(String city,String agg){
        this.city=city;
        this.agg=agg;
    }
    String addres(){
        return city;
    }
}
class Employee{
    String name;
    Address address;
    void Employee(String name,Address address){
        this.name=name;
        this.address=address;
    }
    void displayAddress(){
        System.out.println("Employee address: "+address.addres());
    }
}
class Main{
    public static void main(String args[]){
        Address address=new Address("Indore","aggregation");
        Employee employee=new Employee("Ronak",address);
        // employee.displayName();
        employee.displayAddress();
    }
}