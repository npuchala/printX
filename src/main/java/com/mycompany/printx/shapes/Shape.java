package com.mycompany.printx.shapes;

/*
 *Norbert Puchala
 */
public abstract class Shape {

    abstract public void printShape(int row, int numX, String label, int labelRow);

    void printLabel(String label) {
        for (int i = 0; i < label.length(); i++) {
            System.out.print(label.substring(i, i + 1) + " ");
        }
    }
    
    void fillX(int numX) {
        for (int i = 0; i < numX; i++) {
            System.out.print("x ");
        }
    }
}
