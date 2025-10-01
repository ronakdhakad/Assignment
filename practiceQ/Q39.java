import java.io.File;
class Main {
    public static void main(String[] args){
        File file=new File("Myfolder");
        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder Created");
        }else{
            System.out.println("Folder Already Exist");
        }
    }
    
}
