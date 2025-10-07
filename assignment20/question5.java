//5. Write a program to count number of bytes in a
//  image file(jpeg/png/gif). Also find how much time it will 
// take to upload the file on server 
// if internet speed is 256 bps(bitsper second).

import java.io.File;
import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path of the image file (jpeg/png/gif): ");
        String filePath = sc.nextLine();

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        // Number of bytes in file
        long fileSizeBytes = file.length();
        System.out.println("File size: " + fileSizeBytes + " bytes");

        // Internet speed in bits per second
        double internetSpeedBps = 256;

        // Convert file size to bits (1 byte = 8 bits)
        long fileSizeBits = fileSizeBytes * 8;

        // Time = file size in bits / internet speed
        double uploadTimeSeconds = (double) fileSizeBits / internetSpeedBps;

        System.out.println("upload time at 256 bps: " + uploadTimeSeconds + " seconds");

        }
}
