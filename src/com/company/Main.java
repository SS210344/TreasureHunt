package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static String[][] board = new String[10][8];

    public static void main(String[] args) {
	// write your code here
        Random randNum = new Random();
        Scanner input = new Scanner(System.in);
        //makes board
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[ ]";
            }
        }


        printBoard(board);

        // add coins to baord

        System.out.println("number of coin places:");
        int coinPlaces = input.nextInt();
        for (int i = 0; i < coinPlaces; i++) {
            placeCoin(board,5);

        }
        printBoard(board);

        // fills empty spaces

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j].equals("[ ]")){
                    board[i][j]= "[0]";
                }
            }
        }
        printBoard(board);

        // user code
        int Totalcoins = 0;
        System.out.println("x cord:");








    }
    public static void printBoard (String[][] board){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);

            }
            System.out.println("");

        }
    }
    public static void placeCoin (String[][] board,int maxCoin){
        Random randNum = new Random();
        while (true){
            int i = randNum.nextInt(9);
            int j = randNum.nextInt(7);
            if (board[i][j].equals("[ ]")) {
                String temp= Integer.toString(randNum.nextInt(maxCoin+1));
                board[i][j] = "["+temp+"]";
                break;
            }
        }
    }
}