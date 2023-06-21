import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestService {

    @Test
    void averageValueNotEquals() {
        assertNotEquals(3.2, Service.averageValue(Arrays.asList(1, 2, 3, 4, 5)));
    }
    @Test
    void averageValueEquals() {
        assertTrue(3.0 == Service.averageValue(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    @DisplayName("Result getPairList not equals")
    void testGetPairList() {
        List<Pair> pairList = new ArrayList<>(Arrays.asList(
                new Pair("one", "ONE"), new Pair("two", "TWO"), new Pair("three", "THREE")));

        assertNotEquals(pairList, Service.getPairList(Arrays.asList("one", "two")));
    }
   @Test
    @DisplayName("Result getPairList is equals")
    void testGetPairListEquals() {
        List<Pair> pairList = new ArrayList<>(Arrays.asList(
                new Pair("one", "ONE"), new Pair("two", "TWO"), new Pair("three", "THREE")));

        assertTrue(pairList.equals(Service.getPairList(Arrays.asList("one", "two", "three"))));
    }

    @Test
    @DisplayName("Result filter has correct")
    void testPrintLowerCaseLengthFour() {
        List<String> stringList1 = Arrays.asList("Clock", "Banana", "Time", "date", "lamp");
        assertEquals(Arrays.asList("date", "lamp"), Service.printLowerCaseLengthFour(stringList1));
    }
    @Test
    @DisplayName("Result filter has empty")
    void testPrintLowerCaseLengthFourEmpty() {
        List<String> stringList1 = Arrays.asList("Clock", "Banana", "Time", "Date", "LAMP");
        assertTrue(List.of().equals(Service.printLowerCaseLengthFour(stringList1)));
    }
}