package com.mycompany.printx;

public class Main {

    static void fillX(int numX) {
        for (int i = 0; i < numX; i++) {
            System.out.print("x ");
        }
    }

    static void printLabel(String label) {
        for (int i = 0; i < label.length(); i++) {
            System.out.print(label.substring(i, i + 1) + " ");
        }
    }

    static void printTriangle(int row, int numX, String label, int labelRow) {
        if (row == 0) {
            return;
        }
        for (int i = 0; i < row; i++) {
            System.out.print(" ");
        }
        if (labelRow == row) {
            float paddingX = (((float)numX - label.length()) / 2);
            fillX((int) Math.floor(paddingX));
            printLabel(label);
            fillX((int) Math.ceil(paddingX));
        } else {
            fillX(numX);
        }
        row--;
        numX++;
        System.out.println("");
        printTriangle(row, numX, label, labelRow);
    }

    public static void main(String[] args) {
        System.out.println("Test.");
        String test = "hi";
        printTriangle(7, 1, test, 1);
        System.out.println(test.length());
    }
}
