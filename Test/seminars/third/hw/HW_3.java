package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HW_3 {
    @Test
    public void isEvenOddNumber() {
        assertTrue(MainHW.evenOddNumber(2) == true);
    }

    @Test
    public void isInRange() {
        assertTrue(MainHW.numberInInterval(27) == true);
    }

}
