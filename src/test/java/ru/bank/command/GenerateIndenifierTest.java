package ru.bank.command;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GenerateIndenifierTest {

    GenerateIndenifier generateIndenifier;
    String numberPhone;

    @BeforeEach
    void setUp() {
        generateIndenifier = new GenerateIndenifier();
        numberPhone = "+79001112233";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void generateIndenifier() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Новый идентификатор: " + generateIndenifier.generateIndenifier(numberPhone));
        }
    }
}