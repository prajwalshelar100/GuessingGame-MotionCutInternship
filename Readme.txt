Guessing Game
This Java Application implements a simple guessing game where the computer randomly selects a number between 1 and 100, and the user has to guess the correct number. The user's guesses are taken as input through dialog boxes, and the program provides feedback on each guess until the correct number is guessed.

Application Files:
	1.bin: The program includes the bin folder which includes the necessary/required Java Runtime Environment files for the execution of this program

	2.InstallerSetup: This folder Includes an Installer Setup for GuessingGame.exe application, you can directly run the setup file named as 'GuessingGameSetup' and run the installer.

Note: After Running the Setup 'GuessingGameSetup' The files bin, SavedScript, GuessingGame.exe, GuessinGame.xml, letterg_letr_12669, GuessingGamejar files be present.

	3.SavedScript: This folder contains the script used while preparing the setup of this program.
	
	4.GuessingGame.exe: This .exe file will run the GuessingGame application to perform basic calculations.

	5.GuessingGame: This is the image used for icon of the application in .ico format.
	
	5.GuessinGame.java: This file contains the well-documented version of the code in .java format.

	6.GuessingGamejar: This is the jar file of the application program.
	
	7.letterg_letr_12669: This file contains the application icon used.

Note:To Run this Program One can Directly run the GuessingGame.exe file

Appication Program:
The program consists of a single Java class named `GuessingGame`. The main method initializes the game by generating a random number and then enters a loop where the user is prompted to enter their guesses using a graphical input dialog provided by JOptionPane. The game continues until the user correctly guesses the generated number.

Features:
Random number generation between 1 and 100
User input through JOptionPane dialogs
Feedback messages for correct and incorrect guesses
Invalid input handling
Total number of guesses displayed upon correct guess

Program Components:
Class: GuessingGame

Encapsulates the entire functionality of the guessing game.
Swing Library for GUI

Utilizes JOptionPane for creating a graphical user interface (GUI) to interact with users.
Random Number Generation

Generates a random number between 1 and 100 using Math.random().
Looping with while

Features a while loop to repeatedly prompt the user for guesses until the correct number is guessed.
User Input Handling

Captures user input through JOptionPane.showInputDialog.
Data Conversion with Integer.parseInt

Converts user input from string to integer for comparison and processing.
Message Display with JOptionPane.showMessageDialog

Displays feedback messages for users using message dialogs.
Separate Method: determineGuess

Encapsulates the logic for evaluating the correctness of the user's guess and providing appropriate feedback.
Variable Usage

Utilizes variables such as computerNumber, userAnswer, and count to manage the randomly generated number, user guesses, and the number of attempts.
Conditional Statements

Uses if-else statements within the determineGuess method to evaluate the correctness of the user's guess and provide corresponding feedback messages.
Comments for Documentation

Includes comments throughout the code at different levels (class, method, and inline) to document and explain the purpose and functionality of various code sections.


How to Play:
The user runs the program and receives a dialog box requesting a guess between 1 and 100.
The user enters a guess, and the program provides feedback on whether the guess is too high, too low, correct, or invalid.
The user continues guessing until the correct number is identified.
Upon guessing correctly, the program displays a dialog box with a congratulatory message and the total number of guesses made.