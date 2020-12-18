class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int product = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int factor = 1;
            for (int j = i; j < nums.length; j++) {
                factor *= nums[j];
                product = Math.max(product, factor);
            }
        }

        return product;
        
    }
}