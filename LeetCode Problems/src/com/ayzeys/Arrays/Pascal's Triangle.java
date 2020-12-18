class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pt = new ArrayList<List<Integer>>();
        if (numRows <= 0) {
            return pt;
        }
        for (int i=0; i<numRows; i++) {
            List<Integer> rows = new ArrayList<Integer>();
            for (int j=0; j < i+1; j++) {
                if (j==0 || j==i) {
                    rows.add(1);
                } else {
                    rows.add(pt.get(i-1).get(j-1) + pt.get(i-1).get(j));
                }
            }
            pt.add(rows);
        }
        return pt;
    }
}
