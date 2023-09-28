package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinePayTest {
    @Test
    void testGetCash() {
        LinePay linePay = new LinePay("1", "x", 500);
        assertTrue(linePay.getCash(200));
    }

    @Test
    void getInfo() {
        LinePay linePay = new LinePay("1", "x", 500);

        String expected = "LinePay line id : 1";
        String actual = linePay.getInfo();

        assertEquals(expected, actual);
    }

}