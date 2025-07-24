class Solution {
  public int arraySum(int[] nums) {
    return Sum(nums);
  }

  public static int Sum(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    return sum;
  }
}
