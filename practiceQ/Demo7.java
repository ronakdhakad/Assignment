import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name: ");
        String s = sc.nextLine();
        while((s.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$"))){
            System.out.println("Enter valid name");
            System.out.println("It must start with a letter (A–Z or a–z)");
            System.out.println(" Only letters, digits, and underscores (_) are allowed.");
            break;
        }
        if (s==null||s.isEmpty()) {
            System.out.println("User name is not Empty");
        }else{
            System.out.println("-Valid name-");
        }
        if (s.length()<5||s.length()>15) {
                System.out.println("User name atleast 5 char or atmost 15 char");
        }else{
            System.out.println("-Valid length-");
        }  
        sc.close();
    }
}