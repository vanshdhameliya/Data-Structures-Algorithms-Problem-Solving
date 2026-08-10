class Solution {

    public void rotate(int[] arr, int d) {

        int n = arr.length;

        d = d % n;

        int[] temp = new int[d];

        // Store last d elements
        for (int i = n - d; i < n; i++) {
            temp[i - (n - d)] = arr[i];
        }

        // Shift remaining elements to the right
        for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
        }

        // Put temp elements at the beginning
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }
}