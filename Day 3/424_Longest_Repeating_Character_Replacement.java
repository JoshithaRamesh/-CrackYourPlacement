class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        if(n==0) return 0;
        int max_len = 1;
        int right =0;
        int left =0;
        int[] freq = new int[26];
        int maxfreq =0;

        while(right<n){
            freq[s.charAt(right) - 'A']++;
            maxfreq = Math.max(freq[s.charAt(right) - 'A'], maxfreq);
            int win_len = right - left +1;
            while(left<n && win_len - maxfreq>k){
                freq[s.charAt(left) - 'A']--;
                left++;
                win_len = right - left + 1;
            }
            max_len = Math.max(max_len,win_len);
            right++;
        }
        return max_len;
    }
}
