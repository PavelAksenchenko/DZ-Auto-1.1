package ru.netology.unit.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn150WhenAmountIs850() {
        assertEquals(150, service.remain(850));
    }

    @Test
    public void shouldReturn999WhenAmountIs2001() {
        assertEquals(999, service.remain(2001));
    }

    @Test
    public void shouldReturn0WhenAmountIs3000() {
        assertEquals(0, service.remain(3000));
    }
}