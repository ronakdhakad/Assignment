//2. Write a program to count no of words in a text file and average word size.
import java.io.*;

class Test {
    public static void main(String[] args) {
        File file = new File("deepak@deepaks-MacBook-Air Assignment% MyFolder2.txt");
        int wordCount = 0;
        int totalChars = 0;

        try (FileReader fr=new FileReader(file);
            BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" "); 
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                        totalChars += word.length();
                    }
                }
            }

            System.out.println("Total words: " + wordCount);
            if (wordCount > 0) {
                System.out.println("Average word size: " + (double) totalChars / wordCount);
            } else {
                System.out.println("No words found.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
