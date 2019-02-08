package edu.dmacc.codedsm.lab3;
import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String questionFiction = "How many fiction books did you buy?";
        System.out.println(questionFiction);
        int fictionBooks = scanner.nextInt();

        String questionFictionCost = "\nHow much money does a fiction book cost?";
        System.out.println(questionFictionCost);
        int fictionCost = scanner.nextInt();

        String questionNonFiction = "\nHow many non-fiction books did you buy?";
        System.out.println(questionNonFiction);
        int nonFictionBooks = scanner.nextInt();

        String questionNonFictionCost = "\nHow much money does a non-fiction book cost?";
        System.out.println(questionNonFictionCost);
        int nonFictionCost = scanner.nextInt();

        String finished = "\nAre you finished shopping for books? Enter y/n:";
        System.out.println(finished);
        String finishedAnswer = scanner.next();

        int totalCost = fictionCost * fictionBooks + nonFictionCost * nonFictionBooks;

        if (finishedAnswer.equals("y")) {
            int totalBooksBought = fictionBooks + nonFictionBooks;
            System.out.println("\nYou bought " + totalBooksBought + " books, for a total cost of $" + totalCost + ".");
        } else {
            System.out.println("\n" + questionFiction);
            int newFictionTotal = scanner.nextInt();

            System.out.println(questionNonFiction);
            int newNonFictionTotal = scanner.nextInt();

            int newTotalBought = newFictionTotal + newNonFictionTotal;
            int newTotalCost = newFictionTotal * fictionCost + newNonFictionTotal * nonFictionCost;

            System.out.println("\nYou bought " + newTotalBought + " books, for a total cost of $" + newTotalCost + ".");
        }
    }
}