package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantBedTest {
    
    private PlantBed<Plant> testee;
    private int expectedSize;
    
    @BeforeEach
    void setUp() {
        testee = new PlantBed<>();
        testee.add(new Flower(1.2, "Lestrange", "Bellatrix", PlantColor.RED));
        expectedSize++;
        testee.add(new Shrub(1.3, "Potter", "Harry"));
        expectedSize++;
        testee.add(new Flower(1.4, "Granger", "Hermione", PlantColor.YELLOW));
        expectedSize++;
        testee.add(new Flower(1.5, "Dumbledore", "Albus", PlantColor.BLUE));
        expectedSize++;
        testee.add(new Flower(1.6, "Tonks", "Nymphadora", PlantColor.RED));
        expectedSize++;
    }
    
    @Test
    void add() {
        testee.add(new Shrub(1.8, "lalala", "lululu"));
        assertEquals(expectedSize + 1, testee.size());
    }
    
    @Test
    void size() {
        assertEquals(expectedSize, testee.size());
    }
    
    @Test
    void getPlantsByColor() {
        SimpleList<Plant> redPlants = testee.getPlantsByColor(PlantColor.RED);
        assertEquals(2, redPlants.size());
        SimpleList<Plant> greenPlants = testee.getPlantsByColor(PlantColor.GREEN);
        assertEquals(1, greenPlants.size());
    }
}