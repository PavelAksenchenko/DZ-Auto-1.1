package ru.netology.unit.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn150WhenAmountIs850() {
        assertEquals(service.remain(850), 150);
    }

    @Test
    public void shouldReturn999WhenAmountIs2001() {
        assertEquals(service.remain(2001), 999);
    }

    @Test
    public void shouldReturn0WhenAmountIs3000() {
        assertEquals(service.remain(3000), 0);
    }
}