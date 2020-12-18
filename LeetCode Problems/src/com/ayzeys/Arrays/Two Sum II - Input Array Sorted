class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int curSum = 0;
        while(low < high) {
            curSum = numbers[low] + numbers[high];
            if(curSum == target) {
                return new int[] {low+1, high+1};
            } else if (curSum > target) {
                high --;
            } else {
                low ++;
            }
        }
        return new int[] {0};
        // for (int i=0; i<numbers.length; i++) {
        //     for (int j=i+1; j<numbers.length;j++) {
        //         if ((target == numbers[i] + numbers[j]) && (i < j)) {
        //             return new int[] {i+1,j+1};
        //         }
        //     }
        // }
        // return new int[] {0}; 
    }
}
