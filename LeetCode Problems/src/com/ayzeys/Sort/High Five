class Solution {
    private int K;
    public int[][] highFive(int[][] items) {
        this.K = 5;
        if (items == null || items.length == 0) return items;
        Arrays.sort(items, new Comparator<int[]>() {
            public int compare(int[] student1, int[] student2) {
                if (student1[0] == student2[0]) {
                    return student2[1] - student1[1];
                } else {
                    return student1[0] - student2[0];
                }
            }
        });
        List<int[]> solution = new ArrayList<>();
        int n = items.length;
        int i = 0;
        while (i < n) {
            int id = items[i][0];
            int sum = 0;
            for (int k = i; k < i + this.K; ++k)
                sum += items[k][1];
            while (i < n && items[i][0] == id)
                i++;
            solution.add(new int[] {id, sum / this.K});
        }
        int[][] solutionArray = new int[solution.size()][];
        return solution.toArray(solutionArray);
    }  
    
}