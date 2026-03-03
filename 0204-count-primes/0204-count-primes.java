class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        
        boolean isPrimes[] = new boolean[n+1];
        isPrimes[n] = true;
        int m = n/2;

        for(int i=2; i<=m; i++){
            if(!isPrimes[i]){
                int j = n/i;
                for(int k=2; k<=j; k++){
                    isPrimes[i*k] = true;
                }
            }
        }

        int cnt = 0;
        for(int i=2; i<isPrimes.length; i++){
            if(!isPrimes[i]){
                cnt++;
            }
        }

        return cnt;
        
    }
}