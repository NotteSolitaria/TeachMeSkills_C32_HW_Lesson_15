package com.teachmeskills.lesson_15.task_3.fillingcollection;

import com.teachmeskills.lesson_15.task_3.collectioncheck.CheckForCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FillCollection {

    private List<Integer> integerList = new ArrayList<>();

    public List<Integer> fillTheCollection() {

        Random random = new Random();

        for (int i = 0; i < CheckForCollection.getSizeOfCollection(); i++) {
            integerList.add(random.nextInt(100));
        }

        return integerList;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }
}
