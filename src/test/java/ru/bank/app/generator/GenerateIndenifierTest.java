package ru.bank.app.generator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateIndenifierTest {

    GenerateIndenifier generateIndenifier;
    String numberPhone;
    List<String> correctIdentifier;


    @BeforeEach
    void setUp() {
        generateIndenifier = new GenerateIndenifier();
        numberPhone = "+79001112233";
        correctIdentifier = new ArrayList<>();
        correctIdentifier.add("90011122330");
        correctIdentifier.add("90011122331");
        correctIdentifier.add("90011122332");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void generateIndenifier() {
        for (int i = 0; i < 3; i++) {
            assertEquals(correctIdentifier.get(i), generateIndenifier.generateIndenifier(numberPhone));
        }
    }
}