public class SmallestElement {

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,9,3,2,6,8,5};
        System.out.println("Smallest: " + getSmallest(numbers));
    }
}
