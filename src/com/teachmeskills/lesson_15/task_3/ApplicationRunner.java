package com.teachmeskills.lesson_15.task_3;

import com.teachmeskills.lesson_15.task_3.collectioncheck.CheckForCollection;
import com.teachmeskills.lesson_15.task_3.sumofcollection.SumOfCollection;

/**
 * Create a collection of integers.
 * Fill the collection with random numbers.
 * Let the collection size be specified from the console.
 * Provide a check for the validity of the entered collection size.
 * Calculate and display the arithmetic mean of all elements of the collection.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        CheckForCollection.SizeofCollection();

        SumOfCollection.sumOfCollection();
    }
}
