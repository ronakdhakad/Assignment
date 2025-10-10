//3. Write a program to copy content of one file into another file.

import java.io.*;

class Main{
    public static void main(String[] args) {
        File sourceFile = new File("deepak@deepaks-MacBook-Air Assignment% MyFolder.txt");
        File destFile = new File("deepak@deepaks-MacBook-Air Assignment% newFolder.txt");

        try (FileReader fr=new FileReader(sourceFile);
             FileWriter fw=new FileWriter(destFile);
             BufferedReader br = new BufferedReader(fr);
             BufferedWriter bw = new BufferedWriter(fw)) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);   
                bw.newLine();      

            System.out.println("File copied successfully!");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
