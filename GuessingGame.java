package guessinggame;
/**
 * GuessingGame Program
 * 
 * This Java program implements a simple guessing game where the user has to guess
 * a randomly generated number between 1 and 100. The program provides feedback
 * based on the user's guesses, and it uses JOptionPane for user interaction.
 * 
 * Author: [Your Name]
 * Date: [Current Date]
 */

import javax.swing.*;

public class GuessingGame {

    /**
     * The main method of the GuessingGame program.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int computerNumber = (int) (Math.random() * 100 + 1);
        
        // Initialize user's guess and guess count
        int userAnswer = 0;
        int count = 1;

        // Loop until the user guesses the correct number
        while (userAnswer != computerNumber) {
            // Prompt the user to enter a guess using JOptionPane
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            
            // Convert the user's response to an integer
            userAnswer = Integer.parseInt(response);

            // Display the result of the user's guess using JOptionPane
            JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, computerNumber, count));
            
            // Increment the guess count
            count++;
        }  
    }

    /**
     * Determines the result of the user's guess.
     * 
     * @param userAnswer    The user's guess.
     * @param computerNumber The randomly generated number.
     * @param count          The current guess count.
     * @return A string indicating the result of the guess.
     */
    public static String determineGuess(int userAnswer, int computerNumber, int count) {
        if (userAnswer <= 0 || userAnswer > 100) {
            return "Your guess is invalid";
        } else if (userAnswer == computerNumber) {
            return "Correct!\nTotal Guesses: " + count;
        } else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        } else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        } else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
