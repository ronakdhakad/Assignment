//1. Write a program to count how many times character ‘t’ occurs in a file.
import java.util.Scanner;
import java.io.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter content : ");
        String content=sc.nextLine();
        File file=new File("deepak@deepaks-MacBook-Air Assignment% MyFolder.txt");
        try(FileWriter fw=new FileWriter(file)){
            fw.write(content);
            System.out.println("Content written successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
        int count=0;
        try(FileReader fr=new FileReader(file)){
                while(true){
                    int x=fr.read();
                    if(x==-1){
                        break;
                    }
                    if(x=='t'||x=='T'){
                        count++;
                    }
                    System.out.print((char)x);
                }
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("\nCount : "+count);
    }
}