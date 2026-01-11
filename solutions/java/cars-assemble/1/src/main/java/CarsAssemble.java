public class CarsAssemble {
    private static final int CARS_PER_HOUR = 221;
    public double productionRatePerHour(int speed) {
        if (speed <= 4) {
            return CARS_PER_HOUR * speed * 1;
        } else if (speed <= 8) {
            return CARS_PER_HOUR * speed * 0.90;
        } else if (speed == 9) {
            return CARS_PER_HOUR * speed * 0.80;
        } else {
            return CARS_PER_HOUR * speed * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}
