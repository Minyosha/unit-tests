package seminars.sixth.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ListModelTest {

    @Test
    void testListModelCreationWithPositiveSize() {
        int listSize = 5;
        ListModel listModel = new ListModel(listSize);
        assertNotNull(listModel.list);
        assertEquals(listSize, listModel.list.size());
    }

    @Test
    void testListModelCreationWithZeroSize() {
        int listSize = 0;
        ListModel listModel = new ListModel(listSize);
        assertNotNull(listModel.list);
        assertEquals(listSize, listModel.list.size());
    }

    @Test
    void testListModelCreationWithNegativeSize() {
        int listSize = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            new ListModel(listSize);
        });
    }
}
