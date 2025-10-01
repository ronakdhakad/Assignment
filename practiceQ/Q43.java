import java.util.Scanner;
import java.io.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data in file: ");
        String s=sc.nextLine();
        File f=new File("practiceQ");
        try{
            if(f.exists()){
                FileOutputStream fout=new FileOutputStream(f,true);
                byte b[]=s.getBytes();
                try(FileInputStream fin=new FileInputStream(f)){
                fout.write(b);
                while(true){
                    int x=fin.read();
                    if(x==-1){
                        break;
                    }
                    System.out.print((char)x);
                    x--;
                }}catch(IOException e){}
                System.out.println("Data inserted Succesfully ");
            }else{
                System.out.println("File not exists.. ");
            }
        }catch(IOException e){
            System.out.println("Exception: "+e);
        }
    }
}
