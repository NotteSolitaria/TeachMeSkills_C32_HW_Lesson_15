package com.teachmeskills.lesson_15.task_2;

import com.teachmeskills.lesson_15.task_2.figures.Circle;
import com.teachmeskills.lesson_15.task_2.figures.Figure;
import com.teachmeskills.lesson_15.task_2.figures.Rectangle;
import com.teachmeskills.lesson_15.task_2.figures.Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a collection of shapes.
 * (take the shape classes from previous homework)
 * Fill the collection with different shapes.
 * Loop through the collection and call a method to calculate and display the perimeter of each shape.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        List<Figure> listOfFigures = new ArrayList<>();

        listOfFigures.add(new Rectangle(7, 8));
        listOfFigures.add(new Triangle(7, 8, 6));
        listOfFigures.add(new Circle(7));
        listOfFigures.add(new Triangle(7, 8, 2));
        listOfFigures.add(new Triangle(7, 8, 17));
        listOfFigures.add(new Rectangle(9, 2));
        listOfFigures.add(new Rectangle(12, 85));
        listOfFigures.add(new Circle(11));

        for (Figure figure : listOfFigures) {
            System.out.println("The perimeter of " + figure.getClass().getSimpleName() + " is: " + figure.perimeterCalculation() + ".");
        }
    }
}
