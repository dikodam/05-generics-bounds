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
    
    @ParameterizedTest(name = "\"{0}\" colored flower can be constructed")
    @DisplayName("eligible flower colors")
    @MethodSource("eligiblePlantColors")
    void getColor(PlantColor color) {
        Flower testee = new Flower(color);
        assertEquals(color, testee.getColor());
    }
    
    private static Stream<PlantColor> eligiblePlantColors() {
        return Arrays.stream(PlantColor.values())
                     .filter(color -> color != PlantColor.GREEN);
    }
    
    @Test
    @DisplayName("green flowers are discriminated against")
    void greenColorNotAllowed() {
        IllegalArgumentException thrownException = assertThrows(IllegalArgumentException.class,
                                                                         () -> new Flower(PlantColor.GREEN));
        assertEquals("No green flowers allowed!",thrownException.getMessage());
    }
}