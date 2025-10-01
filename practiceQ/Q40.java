import java.io.File;
import java.io.IOException;
class Main{
    public static void main(String args[]){
        File file = new File("PracticeQ");
        try{
            if(!file.exists()){
            file.createNewFile();
            System.out.println("file created succesfully..");
            }else{
                System.out.println("file exists..");
            }
        }catch(IOException e){
            System.out.println("Exception"+e);
        }
    }
}
