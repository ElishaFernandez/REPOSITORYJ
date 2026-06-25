package Algorithm;

public class divideandConquer {

    public static int findMax(int[] arr, int left, int right) {

        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;

        int leftMax = findMax(arr, left, mid);
        int rightMax = findMax(arr, mid + 1, right);

        if (leftMax > rightMax) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {5, 12, 8, 20, 3, 15};

        int max = findMax(numbers, 0, numbers.length - 1);

        System.out.println("Largest number is: " + max);
    }
}