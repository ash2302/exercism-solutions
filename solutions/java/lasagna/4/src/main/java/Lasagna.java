public class Lasagna {
    private static final int MINUTES_PER_LAYER = 2;
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }
    
    public int remainingMinutesInOven(int timeInOven) {
        return expectedMinutesInOven() - timeInOven;
    }
    
    public int preparationTimeInMinutes(int layers) {
        return layers * MINUTES_PER_LAYER;
    }
    
    public int totalTimeInMinutes(int layers, int timeInOven) {
        return preparationTimeInMinutes(layers) + timeInOven;
    }
}
