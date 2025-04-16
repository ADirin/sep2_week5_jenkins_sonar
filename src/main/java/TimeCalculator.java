public class TimeCalculator {

    /**
     * Calculates time using the formula: time = distance / speed
     *
     * @param distance distance in kilometers (must be > 0)
     * @param speed speed in km/h (must be > 0)
     * @return time in hours
     * @throws IllegalArgumentException if distance or speed is <= 0
     */
    public static double calculateTime(double distance, double speed) {
        if (distance <= 0 || speed <= 0) {
            throw new IllegalArgumentException("Distance and speed must be greater than zero.");
        }
        return distance / speed;
    }
}
