package com.mycompany.printx;

import com.mycompany.printx.shapes.Diamond;
import com.mycompany.printx.shapes.Shape;
import com.mycompany.printx.shapes.Square;
import com.mycompany.printx.shapes.Triangle;
import java.util.Scanner;

/*
*Norbert Puchala
 */
public class Main {
  enum ShapeChoices {
        Triangle, Diamond, Square
    }
    public static void test() {
        System.out.println("Test.");
        String text = "LU";
        for(int i =0; i < 10; i++){
        for(int n =0; n < i; n++){

            int row = 1;
            int numX = 8;//numbers of x's to be printed
            int labelRow = 5;
            Shape tri = new Square();
            tri.printShape(i, numX, text, n);
            System.out.println("");
            tri = new Triangle();
            tri.printShape(i, numX, text, n);
            System.out.println("");
            tri = new Diamond();
            tri.printShape(i, numX, text, n);
            System.out.println("");
        }
        }
    }
    public static ShapeChoices chooseShape(Scanner input){
       String choice;
       boolean noChoice = true;        
       ShapeChoices choosen = null;
       while(noChoice){
       try{
           choice = input.nextLine();
           noChoice = false;
           switch(choice.toUpperCase())
           {
               case "TRIANGLE":
                   choosen = ShapeChoices.Triangle;
                   break;
               case "DIAMOND":
                   choosen = ShapeChoices.Diamond;
                   break;
               case "SQUARE":
                   choosen = ShapeChoices.Square;
                   break;
               default:
                   noChoice = true;
                   System.out.println("Please choose a valid shape.");
                   break;
           }
       }catch (Exception e) {
           input.next();
           System.out.println("I didn't understand that please try again.");
       }
    }
       return choosen;
    }
    public static int chooseHeight(Scanner input){
        int choice = -1;
        while(choice <= 0)
        {   
            try{
                choice = input.nextInt();
                if(choice <= 0)
                    System.out.println("Please enter a positive integer.");
            }catch(Exception e){
                input.next();
                System.out.println("Please enter a positive integer.");
            }
        }
        return choice;
    }
    public static int chooseLabelRow(Scanner input, int height){
        String choice ="";
        int row = 0;
        while(row <= 0)
        {   

            try{
                choice = input.nextLine();
                System.out.println(choice);
                if(choice.length() == 0)
                {
                    return 4;
                }else{
                    row = Integer.parseInt(choice);
                }
                if(row <= 0){
                    System.out.println("Please enter a positive integer.");
                }else{
                    return row;
                }
            }catch(Exception e){
                System.out.println("Please enter a positive integer.");
            }
        }
        return row;
    }
    
    public static String chooseLabel(Scanner input){
        input.nextLine();
        String choice ="";
        int row = 0;
        while(choice.length() <= 0)
        {   
            try{
                choice = input.nextLine();
                
                if(choice.length() == 0)
                {
                    return "LU";
                }else{
                    return choice;
                }
            }catch(Exception e){
                input.next();
                System.out.println("Please try typing again.");
            }
        }
        return choice;
    }   
    public static void drawShape(ShapeChoices choosenShape,int height,String label, int labelRow){
        Shape shape ;
        switch(choosenShape){
            case Triangle:
                shape = new Triangle();
                break;
            case Square:
                shape = new Square();
                break;
            case Diamond:
                shape = new Diamond();
                break;
            default:
                shape = new Triangle();
                break;
        }
        shape.printShape(height, height, label, labelRow);
    }
    
    public static void main(String[] args) {    
        
        Scanner input = new Scanner(System.in);

        //Shape shapeToDraw;
        int height;
        String label;
        int labelRow;
        ShapeChoices choosenShape;        
        ShapeChoices[] shapes = ShapeChoices.values();

        System.out.println("What shape do you want to draw?\n");
        for (ShapeChoices shape : shapes) {
            System.out.println(shape);
        }
        choosenShape = chooseShape(input);
        
        System.out.println("What height do you want the "+ choosenShape +" to be?");
        height = chooseHeight(input);
        
        System.out.println("What do you want written on the "+ choosenShape +"?");
        label = chooseLabel(input);
        
        System.out.println("On what row do you want "+ label +" to be written?");
        labelRow = chooseLabelRow(input, height);
        
        drawShape(choosenShape,height, label, labelRow);
        
    }
}
