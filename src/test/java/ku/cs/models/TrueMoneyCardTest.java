package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrueMoneyCardTest {
    @Test
    void testGetCash() {
        TrueMoneyCard trueMoneyCard = new TrueMoneyCard("12345", 800.50);
        assertTrue(trueMoneyCard.getCash(800.50));
    }

    @Test
    void testGetInfo() {
        TrueMoneyCard trueMoneyCard = new TrueMoneyCard("12345", 800.50);
        String expected = "TrueMoneyCard serial number: 12345";
        String actual = trueMoneyCard.getInfo();

        assertEquals(expected, actual);
    }

}