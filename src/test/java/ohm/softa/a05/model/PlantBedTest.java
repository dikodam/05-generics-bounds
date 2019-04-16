package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantBedTest {
    
    private PlantBed testee;
    private int expectedSize;
    
    @BeforeEach
    void setUp() {
        testee = new PlantBed();
        testee.add(new Flower(PlantColor.RED));
        expectedSize++;
        testee.add(new Shrub());
        expectedSize++;
        testee.add(new Flower(PlantColor.YELLOW));
        expectedSize++;
        testee.add(new Flower(PlantColor.BLUE));
        expectedSize++;
        testee.add(new Flower(PlantColor.RED));
        expectedSize++;
    }
    
    @Test
    void add() {
        testee.add(new Shrub());
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