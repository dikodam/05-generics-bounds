package ohm.softa.a05.model;

public class Flower extends Plant {
    
    private PlantColor color;
    
    public Flower(PlantColor color) {
        if (color == PlantColor.GREEN) {
            throw new IllegalArgumentException("No green flowers allowed!");
        }
        this.color = color;
    }
    
    @Override
    public PlantColor getColor() {
        return color;
    }
}
