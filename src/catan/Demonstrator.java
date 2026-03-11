package catan;

import java.util.Scanner;
/**
 * Demonstrates functionality of the Catan simulator.
 */
public class Demonstrator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose a mode");
        System.out.println("1 COMP VS COMP");
        System.out.println("2 HUMAN VS COMP");

        int move=scanner.nextInt();

        Game game = new Game(move);
        game.startGame();
    }
}
