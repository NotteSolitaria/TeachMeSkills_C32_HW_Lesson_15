package com.teachmeskills.lesson_15.task_1.methodsfortask;

import java.util.IllegalFormatException;

public class Casting {

    public static int CastingNumbers(String entered) {

        try {
            return Integer.parseInt(entered);
        } catch (IllegalFormatException e) {
            throw new RuntimeException("Incorrect number.");
        }
    }
}
