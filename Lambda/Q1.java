 interface Add{
        int sum(int a,int b);
}
class Main{
    public static void main(String args[]){
        Add obj = (a , b)->(a+b);
        System.out.println("Add: "+obj.sum(12,13));
    }
}