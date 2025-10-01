import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]){
        String s="ram";
        Scanner sc =new Scanner (System.in);
        File file = new File("practiceQ");
        try(FileOutputStream fout1=new FileOutputStream(file,true);
        FileOutputStream fout2=new FileOutputStream(file,true);
        FileInputStream fin1=new FileInputStream(file);
        FileInputStream fin2=new FileInputStream(file);
        ByteArrayOutputStream bout=new ByteArrayOutputStream()){
            if(!file.exists()){
                file.createNewFile();
            }else{
                System.out.println("Enter data...");
                s=sc.nextLine();
            }
            byte bt[]=s.getBytes();
            bout.write(bt);
            bout.write(bt);
            int x=fin1.read();
            int y=fin2.read();
                while(x!=-1){
                    System.out.print((char)x);
                    x--;  
        }
        System.out.println();
        while(y!=-1){
                    System.out.print((char)y);
                    y--;  
        }

    }catch(IOException e){
        System.out.println("Exception:"+e);
    }
}
}