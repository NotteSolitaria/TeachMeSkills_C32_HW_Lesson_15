package com.teachmeskills.lesson_15.task_3.sumofcollection;

import com.teachmeskills.lesson_15.task_3.collectioncheck.CheckForCollection;
import com.teachmeskills.lesson_15.task_3.fillingcollection.FillCollection;

public class SumOfCollection {

    public static void sumOfCollection() {
        FillCollection fillCollection = new FillCollection();

        fillCollection.fillTheCollection();

        double sum = 0;

        for (int i = 0; i < CheckForCollection.getSizeOfCollection(); i++) {
            sum += fillCollection.getIntegerList().get(i);
        }

        System.out.println("Arithmetic mean:" + sum / CheckForCollection.getSizeOfCollection());
    }
}
