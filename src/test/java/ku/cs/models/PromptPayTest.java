package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PromptPayTest {
    @Test
    void testGetCash() {
        BankAccount bankAccount = new BankAccount("123", "x", 600.50);
        PromptPay promptPay = new PromptPay("0999999999", bankAccount);
        assertTrue(promptPay.getCash(200));
    }

    @Test
    void getInfo() {
        BankAccount bankAccount = new BankAccount("123", "x", 600.50);
        PromptPay promptPay = new PromptPay("0999999999", bankAccount);

        String expected = "PromptPay phone number : 0999999999";
        String actual = promptPay.getInfo();

        assertEquals(expected, actual);
    }
}