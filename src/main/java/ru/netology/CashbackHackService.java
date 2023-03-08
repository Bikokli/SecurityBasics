package ru.netology;

public class CashbackHackService {
    private final int bonusdary = 1000;

    public int remain(int amount) {
        return bonusdary - amount % bonusdary;
    }
}
