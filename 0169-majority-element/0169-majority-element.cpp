class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size();
        for(int ival : nums) {
            int freq = 0;
            for (int jval : nums) {
                if (ival == jval) {
                    freq++;
                }
            }

            if (freq > n / 2) {
                return ival;
            }
        }

        return -1;
    }
};