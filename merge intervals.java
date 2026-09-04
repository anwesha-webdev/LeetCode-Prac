class Solution {

    public int[][] merge(int[][] intervals) {

        int n = intervals.length;

        // 1. Bubble Sort according to starting value
        for(int i = 0; i < n - 1; i++) {

            for(int j = 0; j < n - i - 1; j++) {

                if(intervals[j][0] > intervals[j + 1][0]) {

                    // Swap two intervals
                    int temp = intervals[j][0];
                    intervals[j][0] = intervals[j + 1][0];
                    intervals[j + 1][0] = temp;

                    temp = intervals[j][1];
                    intervals[j][1] = intervals[j + 1][1];
                    intervals[j + 1][1] = temp;
                }
            }
        }

        // 2. Result array
        int[][] result = new int[n][2];

        int k = 0;

        // Take first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // 3. Check remaining intervals
        for(int i = 1; i < n; i++) {

            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            // Overlapping
            if(nextStart <= end) {

                if(nextEnd > end) {
                    end = nextEnd;
                }
            }

            // Not overlapping
            else {

                result[k][0] = start;
                result[k][1] = end;
                k++;

                start = nextStart;
                end = nextEnd;
            }
        }

        // Add last interval
        result[k][0] = start;
        result[k][1] = end;
        k++;

        // Return only filled part
        int[][] answer = new int[k][2];

        for(int i = 0; i < k; i++) {
            answer[i][0] = result[i][0];
            answer[i][1] = result[i][1];
        }

        return answer;
    }
}
