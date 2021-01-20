class Solution {
    int ans;
    public int rangeSumBST(TreeNode root, int L, int R) {
        ans = 0;
        dfs(root, L, R);
        return ans;
    }
    
    public void dfs(TreeNode root, int L, int R) {
        if(root!= null) {
            if (L<= root.val && root.val <= R) {
                ans += root.val;
            }
            if (L < root.val) {
                dfs(root.left, L, R);
            }
            if (R > root.val) {
                dfs(root.right, L, R);
            }
        }
    }
}
