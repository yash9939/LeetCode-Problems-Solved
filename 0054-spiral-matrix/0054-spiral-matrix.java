class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int s1 = 0, s2 = 0, e1 = matrix.length-1, e2 = matrix[0].length-1;
        while(s1<=e1 && s2<=e2){
            for(int i = s2; i<=e2; i++){
                res.add(matrix[s1][i]);
            }

            for(int i=s1+1; i<=e1; i++){
                res.add(matrix[i][e2]);
            }

            if(s1<e1){
                for(int i=e2-1; i>=s2; i--){
                    res.add(matrix[e1][i]);
                }
            }

            if(s2<e2){
                for(int i=(e1-1); i>s1; i--){
                    res.add(matrix[i][s1]);
                }
            }

            s1++; s2++; e2--; e1--;
        }

        return res;
    }
}