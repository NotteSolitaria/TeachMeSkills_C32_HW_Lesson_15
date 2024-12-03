package com.teachmeskills.lesson_15.task_1.methodsfortask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adding {

    private final List<Integer> integerList = new ArrayList<>();

    public void addingToList() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values, to finish enter \"exit\"");

        while (true) {
            String inputValues = scanner.nextLine();

            if (inputValues.equals("exit")) {
                break;
            }

            try {
                int numberForList = Casting.CastingNumbers(inputValues);
                integerList.add(numberForList);
            } catch (Exception e) {
                throw new RuntimeException("Invalid number.");
            }
        }
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }
}
