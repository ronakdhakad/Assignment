
// 32) 9	99	999	9999 99999 …….
class Q32{
    public static void main(String[] rg){
        int n = 5;
        int digit = 9;
        System.out.print(digit + "  ");
        for(int i = 1;i<=n;i++){
            digit = (digit*10)+9;
            System.out.print( digit + "  ");
        }
    }
}