package com.teachmeskills.lesson_15.task_1;

import com.teachmeskills.lesson_15.task_1.methodsfortask.Adding;

import java.util.List;

/**
 * Create a collection of integers and fill it with values ​​entered from the console.
 * When filling the collection with numbers from the console, you should do type casts.
 * The code for casting a string to a number can be used as follows:
 * int i = Integer.parseInt(str);
 * or
 * int val = Integer.valueOf(str);
 * To finish entering, enter the word "exit".
 * When casting a string to a number, you should consider the possibility of exceptions.
 * Some useful examples of code for casting a string to a number can be found at
 * <a href="https://www.geeksforgeeks.org/how-to-convert-a-string-to-an-int-in-java/">...</a>
 * Display even numbers from the collection on the screen.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        Adding add = new Adding();

        add.addingToList();

        List<Integer> integerList = add.getIntegerList();

        System.out.println("Output of values: ");

        for (int forArray : integerList) {

            if (forArray % 2 == 0) {
                System.out.println(forArray);
            }
        }
    }
}
