package ru.bank.app.command;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeneratorIDTest {

    GeneratorID generatorID;
    String numberPhone;
    List<String> correctID;


    @BeforeEach
    void setUp() {
        generatorID = new GeneratorID();
        numberPhone = "+79001112233";
        correctID = new ArrayList<>();
        correctID.add("90011122330");
        correctID.add("90011122331");
        correctID.add("90011122332");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void generateIndenifier() {
        for (int i = 0; i < 3; i++) {
            assertEquals(correctID.get(i), generatorID.generateIndenifier(numberPhone));
        }
    }
}