package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class CashbackHackServiceTest {
    @Test
    public void remain() {
        CashbackHackService cashback = new CashbackHackService();
        int trati = 1000;
        int amaunt = cashback.remain(trati);
        int expected = 1000;
        int actual = amaunt;
        assertEquals(actual, expected);
    }

    @Test
    public void main() {
        CashbackHackService cashback = new CashbackHackService();
        int trati = 100;
        int amaunt = cashback.remain(trati);
        int expected = 900;
        int actual = amaunt;
        assertEquals(actual, expected);
    }

    @Test
    public void rein() {
        CashbackHackService cashback = new CashbackHackService();
        int trati = 700;
        int amaunt = cashback.remain(trati);
        int expected = 300;
        int actual = amaunt;
        assertEquals(actual, expected);
    }
}
