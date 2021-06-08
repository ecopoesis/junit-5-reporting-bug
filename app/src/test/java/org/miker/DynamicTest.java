package org.miker;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTest {

    @TestFactory
    public List<DynamicNode> factory() {
        return new ArrayList<>(){{
            add(dynamicTest("topLevelTest", () -> assertTrue(true)));
            add(dynamicContainer("Inner",
                    new ArrayList<>(){{
                        add(dynamicTest("middleTest", () -> assertTrue(true)));
                        add(dynamicContainer("Deep",
                                new ArrayList<>(){{
                                    add(dynamicTest("deepTest", () -> assertTrue(true)));
                                }}
                        ));
                    }}
            ));
        }};
    }
}
