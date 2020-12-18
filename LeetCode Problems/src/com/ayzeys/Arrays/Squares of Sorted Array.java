class Solution {
    public int[] sortedSquares(int[] nums) {
        int a = nums.length;
        int res[] = new int[a];
        int i = 0, j = a-1;
        for (int k=a-1; k>=0; k--) {
            if(Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k] = nums[i] * nums[i];
                i++;
            } else {
                res[k] = nums[j] * nums[j];
                j--;
            }
        }     
        return res;

}
}