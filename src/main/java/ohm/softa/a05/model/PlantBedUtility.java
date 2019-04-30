package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;

import java.util.HashMap;
import java.util.Map;

public class PlantBedUtility {
    private PlantBedUtility() {}
    
    public static <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<T> bed) {
        Map<PlantColor, SimpleList<T>> map = new HashMap<>();
        for (PlantColor plantColor : PlantColor.values()) {
            map.put(plantColor, bed.getPlantsByColor(plantColor));
        }
        return map;
    }
}
