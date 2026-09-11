class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] used = new boolean[10];
        int count = 0;

        // Try every possible 3-digit number
        for (int i = 100; i <= 998; i += 2) {
            int num = i;

            int a = num / 100;        // Hundreds digit
            int b = (num / 10) % 10; // Tens digit
            int c = num % 10;        // Units digit

            int[] freq = new int[10];
            freq[a]++;
            freq[b]++;
            freq[c]++;

            boolean possible = true;

            // Check if required digits are available
            for (int d = 0; d <= 9; d++) {
                if (freq[d] > 0) {
                    int available = 0;

                    for (int x : digits) {
                        if (x == d) {
                            available++;
                        }
                    }

                    if (freq[d] > available) {
                        possible = false;
                        break;
                    }
                }
            }

            if (possible) {
                count++;
            }
        }

        return count;
    }
}