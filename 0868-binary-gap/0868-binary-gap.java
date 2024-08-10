class Solution {
    public int binaryGap(int n) {
        if(n <= 1) return 0;
        String binary = Integer.toBinaryString(n);
        int ans = 0;
        int dist = 0;
        int i = 0;
        
        while(i < binary.length()){
            if(binary.charAt(i) == '1'){
                ans = Math.max(ans, dist);
                dist = 1;
            }else{
                dist++;
            }
            i++;
        }
        return ans;
    }
}