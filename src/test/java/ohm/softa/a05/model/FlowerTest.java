package ohm.softa.a05.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FlowerTest {
    
    private static Stream<PlantColor> eligiblePlantColors() {
        return Arrays.stream(PlantColor.values())
                     .filter(color -> color != PlantColor.GREEN);
    }
    
    @ParameterizedTest(name = "\"{0}\" colored flower")
    @DisplayName("eligible flower colors")
    @MethodSource("eligiblePlantColors")
    void getColor(PlantColor color) {
        Flower testee = new Flower(color);
        assertEquals(color, testee.getColor());
    }
    
    @Test
    @DisplayName("green flowers are discriminated against")
    void greenColorNotAllowed() {
        assertThrows(IllegalArgumentException.class,
                     () -> new Flower(PlantColor.GREEN));
    }
}