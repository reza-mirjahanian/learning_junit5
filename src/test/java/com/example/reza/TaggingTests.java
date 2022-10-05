package com.example.reza;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fast")
@Tag("model")
public class TaggingTests {
    @Test
    @Tag("taxes")
    void testingTaxCalculation() {
    }
}
