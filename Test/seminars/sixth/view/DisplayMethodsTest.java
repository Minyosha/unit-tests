package seminars.sixth.view;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class DisplayMethodsTest {

    @Test
    void testPrintList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        DisplayMethods.printList(list);

        String expectedOutput = "Сгенерирован список чисел: \n1, 2, 3, 4, 5\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testCompareAveragesEqual() {
        double firstAverage = 5.0;
        double secondAverage = 5.0;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        DisplayMethods.compareAverages(firstAverage, secondAverage);

        String expectedOutput = "Средние значения равны\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testCompareAveragesFirstGreater() {
        double firstAverage = 6.0;
        double secondAverage = 5.0;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        DisplayMethods.compareAverages(firstAverage, secondAverage);

        String expectedOutput = "Первый список имеет большее среднее значение\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testCompareAveragesSecondGreater() {
        double firstAverage = 5.0;
        double secondAverage = 6.0;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        DisplayMethods.compareAverages(firstAverage, secondAverage);

        String expectedOutput = "Второй список имеет большее среднее значение\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
