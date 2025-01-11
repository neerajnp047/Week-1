import java.util.Random;

public class FootballTeamStats {

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);
        int sum = calculateSum(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        double mean = sum / (double) heights.length;

        System.out.println("Heights: ");
        for (int height : heights) System.out.print(height + " ");
        System.out.println("\nShortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }

    static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) heights[i] = rand.nextInt(101) + 150;
        return heights;
    }

    static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) sum += num;
        return sum;
    }

    static int findShortestHeight(int[] array) {
        int min = array[0];
        for (int num : array) if (num < min) min = num;
        return min;
    }

    static int findTallestHeight(int[] array) {
        int max = array[0];
        for (int num : array) if (num > max) max = num;
        return max;
    }
}
