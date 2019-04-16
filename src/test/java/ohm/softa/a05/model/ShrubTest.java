package ohm.softa.a05.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShrubTest {
    
    private Shrub testee;
    
    @BeforeEach
    void setUp() {
        testee = new Shrub();
    }
    
    @Test
    void getColor() {
        assertEquals(PlantColor.GREEN, testee.getColor());
    }
}