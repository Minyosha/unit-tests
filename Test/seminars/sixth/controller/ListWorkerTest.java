package seminars.sixth.controller;

import org.junit.jupiter.api.Test;

import static java.lang.Double.isNaN;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

public class ListWorkerTest {

    @Test
    public void testGenerateListWithPositiveInteger() {
        int size = 5;
        List<Integer> result = ListWorker.generateList(size);
        assertThat(result.size()).isEqualTo(5);
    }

    @Test
    public void testGenerateListWithZero() {
        int size = 0;
        List<Integer> result = ListWorker.generateList(size);
        assertThat(result.size()).isEqualTo(0);
    }


    @Test
    void testGenerateListWithNegativeInteger() {
        int size = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            ListWorker.generateList(size);
        });
    }

    @Test
    void testCalculateAverageWithEmptyList() {
        List<Integer> list = new ArrayList<>();
        double result = ListWorker.calculateAverage(list);
        assertThat(isNaN(result));
    }

}
