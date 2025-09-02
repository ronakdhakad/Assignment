import java.util.Scanner;
class Book{
    void display(){
        Scanner sc= new Scanner(System.in);
        System.out.println();
        String authorName=sc.nextLine();
        int year=sc.nextInt();
        int page=sc.nextInt();
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Book obj =new Book();
        obj.display();
        
    }
    
}
