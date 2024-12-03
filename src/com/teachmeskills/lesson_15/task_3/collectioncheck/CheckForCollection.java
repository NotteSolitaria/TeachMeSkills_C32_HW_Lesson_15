package com.teachmeskills.lesson_15.task_3.collectioncheck;

import java.util.Scanner;

public class CheckForCollection {

    private static int sizeOfCollection;

    public static void SizeofCollection() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of collection: ");

        sizeOfCollection = scanner.nextInt();

        if (sizeOfCollection >= 1) {
            System.out.println("Length of collection is legit.");
        } else {
            throw new RuntimeException("Illegal length of collection.");
        }
    }

    public static int getSizeOfCollection() {
        return sizeOfCollection;
    }
}
