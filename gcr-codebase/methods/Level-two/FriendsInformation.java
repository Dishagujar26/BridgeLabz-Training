import java.util.Scanner;
// Create FriendsInformation class to find the talles and youngest friend among three friends
public class FriendsInformation{

    // Method to find the youngest friend
    public static int findYoungest(int[] age) {
        int minAge = age[0];
        int index = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                index = i;
            }
        }
        return index;
    }

    // Method to find the tallest friend
    public static int findTallest(double[] height) {
        double maxHeight = height[0];
        int index = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Array to store names
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Array to store their ages
        int[] age = new int[3];

        // Array to store their heights
        double[] height = new double[3];

        // Take input for age and height
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        // Call methods to find youngest and tallest
        int youngestIndex = findYoungest(age);
        int tallestIndex = findTallest(height);

        
        System.out.println("Youngest friend is: " + names[youngestIndex]);
        System.out.println("Tallest friend is: " + names[tallestIndex]);

        // Close Scanner object
        sc.close();
    }
}
