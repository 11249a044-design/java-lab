public class FinalVariableDemo {

    private static final int MAX_SPEED = 120;

    public static void calculateSpeed(final int acceleration) {
        int currentSpeed = acceleration * 2;
        System.out.println("Current Calculated Speed: " + currentSpeed + " km/h");
        System.out.println("Maximum Speed Limit: " + MAX_SPEED + " km/h");
    }

    public static void main(String[] args) {
        calculateSpeed(40);
    }
}