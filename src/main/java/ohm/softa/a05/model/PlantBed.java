package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;

public class PlantBed {
    private SimpleList<Plant> plants = new SimpleListImpl<>();
    
    public void add(Plant plant) {
        plants.add(plant);
        
    }
    
    public int size() {
        return plants.size();
    }
    
    public SimpleList<Plant> getPlantsByColor(PlantColor color) {
        return plants.filter(item -> item.getColor() == color);
    }
}
