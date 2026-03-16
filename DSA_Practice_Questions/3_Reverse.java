class Main{
    public static void main(String args[]){
        String s = "Hello World";
        char ch[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(ch[i]);
        }
        // String newS=ch.reverse();
    }
}