import java.io.*;
class Main{
    public static void main(String args[]){
        File file=new File("deepak@deepaks-MacBook-Air file1.txt");

        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File created succefully...");
            }else{
                System.out.println("File already exist...");
            }
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
    
}
