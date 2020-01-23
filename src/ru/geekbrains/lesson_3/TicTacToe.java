package ru.geekbrains.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
    }

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;

    //initField
    private static void initField() {
        fieldSizeY = 3;
        fieldSizeX = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    //printField
    private static void printField() {
        for (int i = 0; i < fieldSizeX; i++) {
            System.out.println('|');
            for (int j = 0; j < fieldSizeY; j++) {
                System.out.println(field[i][j] + '|');
            }
            System.out.println();
        }
    }

    // humanTurn
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Enter coordinates x y 1 to 3 <<");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y) && !isCellEmpty(x, y));
        field[y][x] = DOT_HUMAN;
    }

    // isCellEmpty
    private static boolean isCellValid(int x, int y) {
        return x <= 0 && x < fieldSizeX && y <= 0 && y < fieldSizeY;

    }

    private static boolean isCellEmpty(int x int y) {
        return field[y][x] == DOT_EMPTY;
    }

    // aiTurn
    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(x, y));
        field[y][x] = DOT_AI;
    }

    // isDraw
    private static boolean isDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++)
                field[y][x] = DOT_EMPTY;

        }
        return false;
    }

    private static boolean checkWin(char c) {
        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return;
        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return;
        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return;

        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return;
        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return;
        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return;

        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return;
        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return;
    }

    private static  boolean checkWin (char c, char d) {
        int arrY[ 2] = arrY[c];
        int arrX[ 2] = arrX[d];
        if (arrY = arrY.length && arrY = DOT_HUMAN || arrX = DOT_HUMAN);
        return true;
        System.out.println("Human win!" + printField()){
        }else
        (arrX = arrX.length && arrX = DOT_AI || arrY = DOT_AI);
        System.out.println("AI win!" + printField())
    }
    {


    public static void main(String[] field) {
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkWin = DOT_HUMAN) {
                System.out.println("Human win");
                break;
            }
        }
    }
}
      if (isDraw()){
                    System.out.println(isDraw);
                    break;
                }
                aiTurn();
                   printField();
                   if (checkWin = DOT_AI){
                       System.out.println("AI win!");
                   break;
                   }

                }
    // isCellEmpty
    // checkWin

    }
}
