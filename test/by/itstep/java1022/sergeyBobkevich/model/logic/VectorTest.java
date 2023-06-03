
package by.itstep.java1022.sergeyBobkevich.model.logic;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VectorTest {


    Tasks tasks;

    @Before
    public void before() {
        tasks = new Tasks();
    }

    @After
    public void after() {
        tasks = null;
    }


    //-------------(Тесты к первому заданию)
    @Test
    public void testTask01returnsTrueForSortedVector() {

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
        //Arrange
        int[] vector = {2, 2, 2, 2, 2, 2, 2, 2, 2};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task02(vector);

        //Assert
        assertEquals(expected, actual);

    }


//-------------(Тесты к третьему заданию)

    //Тест на правильность работы программы для вектора, содержащего все одинаковые элементы:
    @Test
    public void testTask03WithSameCorrectElem() {
        //Arrange
        int[] vector = {2, 2, 2, 2, 2, 2, 2, 2, 2};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task03(vector);

        //Assert
        assertEquals(expected, actual);

    }


    //Тест на правильность работы программы для вектора, содержащего все разные элементы:
    @Test
    public void testTask03WithDifferentCorrectElem() {
        //Arrange
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task03(vector);

        //Assert
        assertEquals(expected, actual);

    }


    //Тест на правильность работы программы для вектора, содержащего не корректные данные:
    @Test
    public void testTask03WithNotCorrectElem() {
        //Arrange
        int[] vector = {1, 2, 3, 1};
        boolean expected = false;

        //Act
        boolean actual = tasks.Task03(vector);

        //Assert
        assertEquals(expected, actual);

    }


    //Тест на правильность работы программы для вектора, содержащего не одного элемента:
    @Test
    public void testTask03WithZeroElem() {
        //Arrange
        int[] vector = {};
        boolean expected = false;

        //Act
        boolean actual = tasks.Task03(vector);

        //Assert
        assertEquals(expected, actual);

    }


    //Тест на правильность работы программы для вектора, содержащего только один элемент:
    @Test
    public void testTask03WithOneElem() {
        //Arrange
        int[] vector = {1};
        boolean expected = true;

        //Act
        boolean actual = tasks.Task03(vector);

        //Assert
        assertEquals(expected, actual);

    }


}
