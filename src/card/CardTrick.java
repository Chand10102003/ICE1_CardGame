/**
 * Class Description: Brief description of what this class does.
 * Author: Original Author's Name (if you're the original author, put your name here)
 * Modifier: Chand Patel
 * Student Number: 991679382
 * Date Created: Original creation date (if known)
 * Date Modified: Date of your modifications
 */
package card; // Ensure this matches the package of your Card class


import java.util.Random;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a hand of 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            int value = random.nextInt(13) + 1; // Card values from 1 to 13
            String suit = Card.SUITS[random.nextInt(Card.SUITS.length)]; // Random suit
            magicHand[i] = new Card(value, suit);
        }

        // Add the luckyCard with hard-coded values
        Card luckyCard = new Card(7, "Diamonds");

        // Ask the user to pick a card
        System.out.println("Pick a card value (1 for Ace, 11 for Jack, 12 for Queen, 13 for King): ");
        int userValue = scanner.nextInt();
        System.out.println("Pick a suit (1 for Hearts, 2 for Diamonds, 3 for Clubs, 4 for Spades): ");
        int suitChoice = scanner.nextInt();
        String userSuit = Card.SUITS[suitChoice - 1]; // Adjust for zero-based index

        // Search for the card in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equals(userSuit)) {
                found = true;
                break;
            }
        }

        // Check if the user's card is the lucky card
        boolean isLuckyCard = (luckyCard.getValue() == userValue && luckyCard.getSuit().equals(userSuit));

        // Report whether the user's card is in the magic hand or is the lucky card
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else if (isLuckyCard) {
            System.out.println("You picked the lucky card! You win!");
        } else {
            System.out.println("Sorry, you lost. The lucky card is not in the magic hand.");
        }

        // Optionally, close the scanner
        scanner.close();
    }
}
