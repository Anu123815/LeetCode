class Solution {
    public int removeDuplicates(int[] nums) {
    if (nums == null) return 0;
    int n = nums.length;
    if (n == 0) return 0;

    int slow = 0;
    for (int fast = 1; fast < n; fast++) {
        if (nums[fast] != nums[slow]) {
            slow++;
            nums[slow] = nums[fast];
        }
    }
    return slow + 1;
}

}