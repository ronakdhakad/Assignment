
// 6) WAP to check whether entered array is a palindrome or not
class Q6{
    public static void main(String[] args){
        int n = 0;
        int on = n;
        int pal = 0;
        for(int i = 0;i<args.length;i++){
            n = Integer.parseInt(args[i]);
            on = n;
            while(n>0){
                int dig = n %10;
                pal = pal*10+dig;
                n = n/10;
            }
        }
        if(on==pal){
            System.out.print("the number is palindrome");
        }
        else
        System.out.print("the number is  not palindrome");
    }
}