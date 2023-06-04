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

            if (vector[i] > vector[i + 1]) {
                countDescending++;
            }

            if (vector[i] < vector[i + 1]) {
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

        boolean result = false;
        int countDescending = 0;
        int countAscending = 0;
        int countEqual = 0;


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


        if (vector.length - 1 == countDescending || vector.length - 1 == countAscending
                || vector.length - 1 == countEqual) {
            result = true;
        }

        return result;
    }


    //Задание: 4
    //Написать программу, которая подсчитывает количество только чётных/нечётных элементов вектора.

    public String Task04(int[] vector) {

        int countAscending = 0;
        int countDescending = 0;
        boolean result = false;

        //проверка на то является ли последовательность вектором
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


        countAscending = 0;//теперь отвечает за четные числа
        countDescending = 0; //теперь отвечает за нечетные числа


        //подсчет элементов
        if (result) {

            for (int j : vector) {
                if (j % 2 == 0) {
                    countAscending++;
                } else {
                    countDescending++;
                }
            }

        }

        if (!result) {
            return "Not correct data !!!";
        }


        return "even: " + countAscending + ", " + "odd: " + countDescending;
    }
//Задание: 5
// Необходимо написать программу, которая обрабатывает результаты экзамена.
// Для экзамена используется пятибалльная система оценивания знаний.
// Для каждой оценки программа должна вычислить процент от общего количества оценок.

    public String Task05(String marks) {


        if (marks.length() == 0){
            return "Not correct data !!!";
        }

        String[] masSym = marks.split(" ");

        int[] masNum = new int[masSym.length];

        for (int i = 0; i < masNum.length; i++) {
            masNum[i] = Integer.parseInt(masSym[i]);
            if (masNum[i] > 5 || masNum[i] < 0) {
                return "Not correct data !!!";
            }
        }



        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;


        for (int j : masNum) {
            switch (j) {
                case 0 -> count0++;
                case 1 -> count1++;
                case 2 -> count2++;
                case 3 -> count3++;
                case 4 -> count4++;
                case 5 -> count5++;
            }
        }

        return "Marks: 5 4 4 5 3 4 3 4 5 3 4 4 3 4 4 3 5 3 3 4 5 5 5 5 4 5 5 5 2 5\n" +
                "Exam Result: \n" +
                "fives - " + (count5 * 100) / masNum.length + "%" + " (" + count5 + ")\n" +
                "four - " + (count4 * 100) / masNum.length + "%" + " (" + count4 + ")\n" +
                "triplets - " + (count3 * 100) / masNum.length + "%" + " (" + count3 + ")\n" +
                "deuces - " + (count2 * 100) / masNum.length + "%" + " (" + count2 + ")\n" +
                "units - " + (count1 * 100) / masNum.length + "%" + " (" + count1 + ")\n" +
                "zeros - " + (count0 * 100) / masNum.length + "%" + " (" + count1 + ")";
    }


}
