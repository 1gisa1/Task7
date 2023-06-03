package by.itstep.java1022.sergeyBobkevich.model.logic;
//Необходимо разработать программу, которая проверяет, что все
// элементы вектора находятся в упорядоченном виде, т.е. отсортированы по возрастанию или убыванию.

import java.util.Arrays;
import java.util.Collections;

public class Tasks {

    public boolean Task01(int[] vector) {
//Задание 1:
//Необходимо разработать программу, которая проверяет, что все
// элементы вектора находятся в упорядоченном виде, т.е. отсортированы по возрастанию или убыванию.

        int countAscending = 0;
        int countDescending = 0;
        boolean result = false;

        for (int i = 0; i < vector.length - 1; i++) {

            if (vector[i] >= vector[i + 1]) {
                countDescending++;
            }

            if (vector[i] <= vector[i + 1]) {
                countAscending++;
            }
        }


        if (vector.length - 1 == countDescending || vector.length - 1 == countAscending) {
            result = true;
        }

        return result;

    }


    //Задание 2:
    //Необходимо разработать программу, которая проверяет, что все элементы вектора расположены
    // в зеркальном виде относительно его середины.

    public boolean Task02(int[] vector) {

        int countIdenticalElem = 0;
        boolean result = false;

        if (vector.length == 0) {
            return false;
        }

        for (int i = 0; i < vector.length / 2; i++) {
            if (vector[i] == vector[vector.length - 1 - i]) {
                countIdenticalElem++;
            }
        }

        if (countIdenticalElem == vector.length / 2) {
            result = true;
        }

        return result;
    }

    //Задание 3:
    //Необходимо разработать программу, которая проверяет, что все элементы вектора различны/одинаковы.
    public boolean Task03(int[] vector) {

        Tasks tasks = new Tasks();
        boolean result = tasks.Task01(vector);

        int countDescending = 0;
        int countAscending = 0;
        int countEqual = 0;

        if (result) {

            for (int i = 0; i < vector.length - 1; i++) {

                if (vector[i] > vector[i + 1]) {
                    countDescending++;
                } else if (vector[i] < vector[i + 1]) {
                    countAscending++;
                } else if (vector[i] != vector[i + 1]) {
                    if (vector[i] == vector[i + 1]) {
                        countEqual++;
                    }
                } else {
                    countEqual++;
                }

            }

        }

        if (vector.length - 1 == countDescending || vector.length - 1 == countAscending || vector.length - 1 == countEqual) {
            result = true;
        }

        return result;
    }

    public static int Task4(int[] vector) {
        return 0;
    }


}
