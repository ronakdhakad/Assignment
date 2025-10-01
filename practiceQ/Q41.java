import java.io.File;
// import java.io.IOException;
class Main {
    public static void main(String arg[]){
        File file=new File("deepak@deepaks-MacBook-Air practiceQ ");
        File frr[]=file.listFiles();
        for(File obj:frr){
            if(obj.getName().endsWith(".class")){
            System.out.println("File Name- "+obj.getName()+"file path-"+obj.getPath());
            }
            else{
                System.out.println(".class file not exists ");
            }
        }
    }
}
