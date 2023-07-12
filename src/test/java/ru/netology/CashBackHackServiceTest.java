package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CashBackHackServiceTest {

    @Test
    public void shouldCalculateCashBackEqual1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCAshBackAbove1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1200;

        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCAshBackBelow1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);


    }


}
