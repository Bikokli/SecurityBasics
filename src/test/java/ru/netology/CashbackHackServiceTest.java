package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
            CashbackHackService cashback = new CashbackHackService();
            int trati = 1000;
            int amaunt = cashback.remain(trati);
            int expected = 1000;
            int actual = amaunt;
            assertEquals(actual, expected);
        }

    @Test
    public void testMain() {
        CashbackHackService cashback = new CashbackHackService();
        int trati = 800;
        int amaunt = cashback.remain(trati);
        int expected = 200;
        int actual = amaunt;
        assertEquals(actual, expected);
    }

    @Test
    public void trestRein() {
        CashbackHackService cashback = new CashbackHackService();
        int trati = 900;
        int amaunt = cashback.remain(trati);
        int expected = 100;
        int actual = amaunt;
        assertEquals(actual, expected);
    }

}