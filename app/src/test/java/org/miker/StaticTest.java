package org.miker;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StaticTest {

    @Test
    public void topLevelTest() {
        assertTrue(true);
    }

    @Nested
    class Inner {
        @Test
        public void middleTest() {
            assertTrue(true);
        }

        @Nested
        class Deep {
            @Test
            public void deepTest() {
                assertTrue(true);
            }
        }
    }
}
