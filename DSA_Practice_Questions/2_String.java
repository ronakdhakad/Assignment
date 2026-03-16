import java.util.Scanner;
class Strin{
    public static void Fun(){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter a string : ");
        String strin = sc.nextLine();
        String word[]=strin.split(" ");
        String smallWord=word[0];
        for(int i=0;i<word.length;i++){
            if(i==word.length-1){
                smallWord=word[i];
            }
        }
        int vo=0;
        int co=0;
        String small =smallWord.toLowerCase();
        for(int i=0;i<small.length();i++){
            char ch=small.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vo++;
            }else{
                co++;
            }
        }
        System.out.println("last word: "+smallWord);
        System.out.println("vowel: "+vo);
        System.out.println("consonent: "+co);
    }
    public static void main(String args[]){
        Fun();
    }          
}