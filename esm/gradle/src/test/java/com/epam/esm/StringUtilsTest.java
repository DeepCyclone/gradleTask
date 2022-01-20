package com.epam.esm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StringUtilsTest {
    @Test
    void isPositiveInteger(){
        String number = "868697887";
        assertTrue(StringUtils.isPositiveNumber(number));
    }
}
