// // example showing the concept of file handling 
// import java.io.*;
// class Main{
//     public static void main(String args[]){
//         File file = new File("practiceQ");
        
//         try(FileInputStream fin = new FileInputStream(file);
//         DataInputStream din = new DataInputStream(fin);){    
//           System.out.println("Integer value : "+din.readInt());     
//           System.out.println("Boolean value : "+din.readBoolean());     
//           System.out.println("Double value : "+din.readDouble());     
//           System.out.println("String Data : "+din.readUTF());     
//         }catch(IOException e){
//             System.out.println("Exception : "+e);
//         }
//     }
// }
// example showing the concept of file handling 

import java.io.*;
class Main{
    public static void main(String args[]){
        File file = new File("Q47.java");
        try(FileOutputStream fout = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fout);){    
            dos.writeInt(10101);
            dos.writeBoolean(true);
            dos.writeDouble(456.654);
            dos.writeUTF("This is an example");
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}