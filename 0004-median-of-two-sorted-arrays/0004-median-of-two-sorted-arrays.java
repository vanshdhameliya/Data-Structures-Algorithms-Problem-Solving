class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] newArray = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {

            if (nums1[i] < nums2[j]) {
                newArray[k] = nums1[i];
                i++;
            } else {
                newArray[k] = nums2[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            newArray[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n2) {
            newArray[k] = nums2[j];
            j++;
            k++;
        }

        int len = newArray.length;

        if (len % 2 == 0) {

            int middle = len / 2;

            return (newArray[middle - 1] + newArray[middle]) / 2.0;
        } else {

            return newArray[len / 2];
        }
    }
}