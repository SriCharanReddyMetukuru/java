package com.wipro.java.usecase3;

import java.util.Scanner;

public class TicTacToe {

    // Represent the Tic-Tac-Toe board (3x3)
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X'; // 'X' starts the game

    // Method to initialize the board
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' '; // Fill all cells with a space character
            }
        }
    }

    // Method to print the game board
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Method to check if the current player has won
    public static boolean checkWin() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true; // Check row
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true; // Check column
            }
        }

        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true; // Check left-to-right diagonal
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true; // Check right-to-left diagonal
        }

        return false; // No winner
    }

    // Method to check if the board is full (tie condition)
    public static boolean checkTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // There is at least one empty spot, so no tie yet
                }
            }
        }
        return true; // No empty spots, it's a tie
    }

    // Method to make a move
    public static boolean makeMove(int row, int col) {
        // Check if the position is valid (within bounds and not already taken)
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = currentPlayer; // Place the player's mark
            return true;
        }
        return false; // Invalid move
    }

    // Method to switch the current player
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch between 'X' and 'O'
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the board
        initializeBoard();
        
        // Game loop
        while (true) {
            // Display the board
            printBoard();

            // Get user input for the current player's move
            System.out.println("Player " + currentPlayer + "'s turn.");
            System.out.print("Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = scanner.nextInt();

            // Make the move and check if it's valid
            if (makeMove(row, col)) {
                // Check if the current player has won
                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }

                // Check if the game is a tie
                if (checkTie()) {
                    printBoard();
                    System.out.println("It's a tie!");
                    break;
                }

                // Switch to the other player
                switchPlayer();
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

