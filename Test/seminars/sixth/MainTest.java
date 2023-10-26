package seminars.sixth;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalSystemOut);
    }

    @Test
    void testDisplayMenuExit() {
        String input = "0\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Main.displayMenu();

        String expectedOutput = "Меню:\n1. Сгенерировать списки, вычислить их средние значения и сравнить их\n0. Выйти\nВведите действие: " +
                "Завершение работы программы...\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void testDisplayMenuGenerateAndCompare() {
        String input = "1\n3\n2\n0\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Main.displayMenu();

        String expectedOutput = "Меню:\n1. Сгенерировать списки, вычислить их средние значения и сравнить их\n0. Выйти\nВведите действие: " +
                "Введите количество элементов первого списка:\nВведите количество элементов второго списка:\nСгенерирован список чисел: \n1, 2, 3\n" +
                "Среднее значение первого списка: 2.0\n\nСгенерирован список чисел: \n1, 2\nСреднее значение второго списка: 1.5\n\n" +
                "Первый список имеет большее среднее значение\n\nМеню:\n1. Сгенерировать списки, вычислить их средние значения и сравнить их\n" +
                "0. Выйти\nВведите действие: Завершение работы программы...\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void testDisplayMenuInvalidChoice() {
        String input = "5\n0\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Main.displayMenu();

        String expectedOutput = "Меню:\n1. Сгенерировать списки, вычислить их средние значения и сравнить их\n0. Выйти\nВведите действие: " +
                "Неверный выбор, выберите еще раз\n\nМеню:\n1. Сгенерировать списки, вычислить их средние значения и сравнить их\n0. Выйти\n" +
                "Введите действие: Завершение работы программы...\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}