package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;

public class PlantBed<P extends Plant> {
    private SimpleList<P> plants = new SimpleListImpl<>();
    
    public void add(P plant) {
        plants.add(plant);
    }
    
    public int size() {
        return plants.size();
    }
    
    public SimpleList<P> getPlantsByColor(PlantColor color) {
        return plants.filter(item -> item.getColor() == color);
    }
}
