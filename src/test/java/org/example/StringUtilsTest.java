package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testIsPositiveNumber_PositiveInput_ReturnsTrue() {
        assertFalse(StringUtils.isPositiveNumber("0"));

        assertTrue(StringUtils.isPositiveNumber("123"));
        assertTrue(StringUtils.isPositiveNumber("0.5"));

        assertFalse(StringUtils.isPositiveNumber("-42"));
        assertFalse(StringUtils.isPositiveNumber("-0.1"));

        assertThrows(IllegalArgumentException.class, () -> StringUtils.isPositiveNumber("abc"));
        assertThrows(IllegalArgumentException.class, () -> StringUtils.isPositiveNumber("  "));
        assertThrows(IllegalArgumentException.class, () -> StringUtils.isPositiveNumber(null));
    }

}