public class MaxFinder_Iterative {

    public static int findMaxIterative(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};
        int max = findMaxIterative(numbers);
        System.out.println("Maximum (Iterative): " + max);
    }
}

