// example showing the concept of command line argument
class Main{
    public static void main(String...args){
       System.out.println("No. of arguments : "+args.length);     
       
       for(String element : args){
        System.out.print(element+"\n");
       } 
       
    }
}