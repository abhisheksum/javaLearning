public class MaxSubarraySum {

    public static int maxSubarraySum(int number[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += number[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        System.out.println("Max Subarray Sum: " + maxSubarraySum(number));
    }
}
