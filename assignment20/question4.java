/*
4. Store transaction details of a customer in a file 
   and count how many times amount is credited and debited.
*/

import java.util.Scanner;
import java.io.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        File file = new File("deepak@deepaks-MacBook-Air Assignment% MyFolder1.txt");

        try(FileWriter fw = new FileWriter(file)){

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Account Number: ");
            long accNo = sc.nextLong();
            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            fw.write("Customer Name : " + name + "\n");
            fw.write("Account Number : " + accNo + "\n");
            fw.write("Initial Balance : " + balance + "\n");
            fw.write("Transactions:\n");

            int creditCount = 0, debitCount = 0;
            String choice;

            do {
                System.out.println("\nEnter 1 for Credit and 2 for Debit : ");
                int type=sc.nextInt();
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                if (type == 1) {
                    balance += amount;
                    creditCount++;
                    fw.write("Credit: " + amount + " | Balance: " + balance + "\n");
                    System.out.println("Amount Credited Successfully!");
                } else if (type == 2) {
                    if (amount <= balance) {
                        balance -= amount;
                        debitCount++;
                        fw.write("Debit: " + amount + " | Balance: " + balance + "\n");
                        System.out.println("Amount Debited Successfully!");
                    } else {
                        System.out.println("Insufficient Balance! Transaction Failed.");
                        fw.write("Failed Debit: -" + amount + " | (Insufficient Funds)\n");
                    }
                } else {
                    System.out.println("Invalid Choice!");
                }

                System.out.print("Do you want to continue? (yes/no): ");
                choice = sc.next().toLowerCase();

            } while (choice.equals("yes"));

            fw.write("\nFinal Balance : " + balance + "\n");
            fw.write("Total Credit Transactions : " + creditCount + "\n");
            fw.write("Total Debit Transactions : " + debitCount + "\n");

            
            System.out.println("\n-------------------------------");
            System.out.println("Transaction Summary (Console)");
            System.out.println("-------------------------------");
            System.out.println("Customer Name : " + name);
            System.out.println("Account No.   : " + accNo);
            System.out.println("Final Balance : " + balance);
            System.out.println("Total Credit Transactions : " + creditCount);
            System.out.println("Total Debit Transactions  : " + debitCount);

        } catch (IOException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("\n Program executed successfully.");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        System.out.println("\n--- Transaction File Content ---");
        while ((line = br.readLine()) != null) {
        System.out.println(line);
        }
    } catch (IOException e) {
         System.out.println("Error while reading file: " + e);
        }
    }
}
