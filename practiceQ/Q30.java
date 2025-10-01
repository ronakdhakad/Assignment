class Main {
        public static void main(String args[]){
            // A aa=new A();
            A.a();
        }
}
class A{
    static void a(){
        // arr [0]=1;
        // arr [1]=2;
        // arr [2]=3;
        try{
        String s= "hello";
        int arr[]=new int[3];
        System.out.println(s.charAt(5));
        System.out.println(arr[4]);
}catch(ArrayIndexOutOfBoundsException |StringIndexOutOfBoundsException e){
    System.out.println(e);
    System.out.println(e);
}finally{
    System.out.println(" Throws Exception---");
}
}
}
