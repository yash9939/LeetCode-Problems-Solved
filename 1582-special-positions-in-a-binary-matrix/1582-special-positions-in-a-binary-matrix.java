class Solution {
    public int numSpecial(int[][] mat) {
        int cnt = 0;

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    boolean hor = true, ver = true;
                    for(int k = j+1; k<mat[0].length; k++){
                        if(mat[i][k]==1){
                            hor = false;
                            break;
                        }
                    }
                    for(int k = j-1; k>=0; k--){
                        if(mat[i][k]==1){
                            hor = false;
                            break;
                        }
                    }
                    for(int k=0; k<i; k++){
                        if(mat[k][j]==1){
                            ver = false;
                            break;
                        }
                    }
                    for(int k=i+1; k<mat.length; k++){
                        if(mat[k][j]==1){
                            ver = false;
                            break;
                        }
                    }
                    if(hor && ver){
                        cnt++;
                    }
                }
                
            }
        }

        return cnt;
    }
}