class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        List<String> aList = new ArrayList<>();
        path(aList,root,sb);
        return aList;
    }
    public void path(List<String> aList, TreeNode root, StringBuilder sb) {
        if(root == null) {
            return;
        }
        int len = sb.length();
        sb.append(root.val);
        if(root.left == null && root.right == null) {
            aList.add(sb.toString());
        } else {
            sb.append("->");
            path(aList, root.left, sb);
            path(aList, root.right, sb);
        }
        sb.setLength(len);
    }
}