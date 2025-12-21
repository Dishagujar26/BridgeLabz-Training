
// Create a RandomNumber class to generates five 4 digit random values and then finds their average value, and their minimum and maximum value
public class RandomNumber {

    // Method to generate a single four digit random number
    public static int get4DigitRandomNumber() {
        return (int) (Math.random() * 9000) + 1000;
    }

    // Method to generate array of numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = get4DigitRandomNumber();
        }
        return numbers;
    }

    // Method to find average, min and max value
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        // Declare array of random numbers
        int[] numbers = generate4DigitRandomArray(5);

        double[] result = findAverageMinMax(numbers);

        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
