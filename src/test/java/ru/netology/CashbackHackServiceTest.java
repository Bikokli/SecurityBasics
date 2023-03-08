package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    void calculatBonus() {
        CashbackHackService cashback = new CashbackHackService();
        int trati = 100;
        int amaunt = cashback.remain(trati);
        int expected = 900;
        int actual = amaunt;
        assertEquals(expected, actual);
    }

    @Test
    void moreThanTheAmountClaimed() {
        CashbackHackService cashback = new CashbackHackService();
        int trati = 1182;
        int amaunt = cashback.remain(trati);
        int expected = 818;
        int actual = amaunt;
        assertEquals(expected, actual);
    }

    @Test
    void negativCalculatBonus() {
        CashbackHackService cashback = new CashbackHackService();
        int trati = 1100;
        int amaunt = cashback.remain(trati);
        int expected =700;
        int actual = amaunt;
        assertNotEquals(expected, actual);
    }
}