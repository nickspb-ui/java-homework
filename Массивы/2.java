import java.util.Arrays;

class utilArrayExample {
    public static void main(String[] args) {
        String[] strsForPrint = { "hello", "world", "!" };
        System.err.println(Arrays.toString(strsForPrint)); // [hello, world, !]

        int[] numsForSearch = { 2, 3, 5, 6, 7, 8, 9, 10 };
        System.err.println(Arrays.binarySearch(numsForSearch, 5)); // 2

        int[] nums1ForEquality = { 1, 2 };
        int[] nums2ForEquality = { 1, 2 };
        System.err.println(Arrays.equals(nums1ForEquality, nums2ForEquality)); // true

        int[] nums1ForComparison = { 1, 2, 4, 5 };
        int[] nums2ForComparison = { 1, 2, 3, 4, 5 };
        System.err.println(Arrays.compare(nums1ForComparison, nums2ForComparison)); // 1

        int[] numsToSort = { 1, 3, 5, 4 };
        Arrays.sort(numsToSort);
        System.err.println(Arrays.toString(numsToSort)); // [1, 3, 4, 5]
    }
}