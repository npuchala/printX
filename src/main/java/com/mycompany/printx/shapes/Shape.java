package com.mycompany.printx.shapes;

/*
 *Norbert Puchala
 */
public abstract class Shape {

    abstract public void printShape(int row, int numX, String label, int labelRow);

    //method for writing labels inside of shapes
    void printLabel(String label,int numX) {
        float paddingX = (((float) numX - label.length()) / 2);
        fillX((int) Math.floor(paddingX));
        for (int i = 0; i < label.length(); i++) {
            System.out.print(label.substring(i, i + 1) + " ");
        }
        fillX((int) Math.ceil(paddingX));
    }

    //method for adding spaces
    void emptySpace(int amountEmpty) {
        for (int i = 0; i < amountEmpty; i++) {
            System.out.print(" ");
        }
    }

    //method for correctly spacing x's in a given shape
    void fillX(int numX) {
        for (int i = 0; i < numX; i++) {
            System.out.print("x ");
        }
    }
}
