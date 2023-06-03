
package by.itstep.java1022.sergeyBobkevich.model.logic;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VectorTest {

/*
    private Tasks tasks;

    @After
    public void after1(){
        tasks = new Tasks();
    }

    @Before
    public void before1(){
        tasks = null;
    }
*/

    //-------------(Тесты к первому заданию)
    @Test
    public void testTask01returnsTrueForSortedVector() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {2, 3, 40, 555, 666, 888, 999};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task01(vector);

        //Assert
        assertEquals(expected, actual);


    }

    @Test
    public void testTask01returnsTrueForSortedVectorTurnover() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {999, 888, 666, 555, 40, 3, 2};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task01(vector);

        //Assert
        assertEquals(expected, actual);

    }


    @Test
    public void testTask01ReturnTrueAllValuesSame() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task01(vector);

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testTask01CheckingNotSequence() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {1, 1, 1, 1, 0, 1, 1, 1, 1};
        boolean expected = false;

        //Act
        boolean actual = tasks.Task01(vector);

        //Assert
        assertEquals(expected, actual);

    }


    @Test
    public void testTask01checkWhenTwoElements() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {1, 2};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task01(vector);

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testTask01checkWhenOneElements() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {1};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task01(vector);

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testTask01checkWhenZeroElements() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {};
        boolean expected = false;

        //Act
        boolean actual = tasks.Task01(vector);

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testTask01checkingWorkWithNegativeElements() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {-10, -6, -1, 0, 1, 55, 89};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task01(vector);

        //Assert
        assertEquals(expected, actual);

    }

//-------------(Тесты к второму заданию)


    //Тест на правильность работы программы для вектора с четным
    // количеством элементов и корректной последовательностью:

    @Test
    public void testTask02CorrectEvenNumElem() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {1, 10, 100, 100, 10, 1};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task02(vector);

        //Assert
        assertEquals(expected, actual);

    }

    //Тест на правильность работы программы для вектора с четным количеством
    // элементов и некорректной последовательностью:
    @Test
    public void testTask02NotCorrectEvenNumElem() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {1, 10, 100, 100, 1, 1};
        boolean expected = false;

        //Act
        boolean actual = tasks.Task02(vector);

        //Assert
        assertEquals(expected, actual);

    }

    // Тест на правильность работы программы для вектора с нечетным количеством
    // элементов и корректной последовательностью:
    @Test
    public void testTask02CorrectNotEvenNumElem() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {1, 10, 100, 500, 100, 10, 1};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task02(vector);

        //Assert
        assertEquals(expected, actual);

    }


    //Тест на правильность работы программы для вектора с нечетным количеством элементов
    // и некорректной последовательностью:
    @Test
    public void testTask02NotCorrectNotEvenNumElem() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {1, 10, 100, 500};
        boolean expected = false;

        //Act
        boolean actual = tasks.Task02(vector);

        //Assert
        assertEquals(expected, actual);

    }


    //Тест на правильность работы программы для вектора, содержащего только один элемент:
    @Test
    public void testTask02WithOneElem() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {1};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task02(vector);

        //Assert
        assertEquals(expected, actual);

    }

    //Тест на правильность работы программы для вектора, не содержащего элементы:
    @Test
    public void testTask02WithZeroElem() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {};
        boolean expected = false;

        //Act
        boolean actual = tasks.Task02(vector);

        //Assert
        assertEquals(expected, actual);

    }


    //Тест на правильность работы программы для вектора, содержащего только одинаковые элементы:
    @Test
    public void testTask02WithSameElem() {
        Tasks tasks = new Tasks();
        //Arrange
        int[] vector = {2, 2, 2, 2, 2, 2, 2, 2, 2};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task02(vector);

        //Assert
        assertEquals(expected, actual);

    }


}
