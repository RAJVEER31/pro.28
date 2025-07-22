public class MaxFinder_Recursive {

    public static int findMaxRecursive(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        }

        int maxOfRest = findMaxRecursive(numbers, index + 1);
        return Math.max(numbers[index], maxOfRest);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};
        int max = findMaxRecursive(numbers, 0);
        System.out.println("Maximum (Recursive): " + max);
    }
}
