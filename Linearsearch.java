public class Linearsearch {
    public static void main(String[] args) {
        int[] numbers = {15, 42, 8, 23, 91, 34};
        int target = 23;
        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}