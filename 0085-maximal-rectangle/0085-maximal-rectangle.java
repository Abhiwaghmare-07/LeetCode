class Solution {
    public int maximalRectangle(char[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[] height = new int[m];
        int max = 0;

        for(int i = 0; i < n; i++) {

            // Build histogram
            for(int j = 0; j < m; j++) {

                if(matrix[i][j] == '1') {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }

            // Largest rectangle in histogram
            max = Math.max(max, largestRectangle(height));
        }

        return max;
    }

    public int largestRectangle(int[] height) {

        Stack<Integer> st = new Stack<>();
        int max = 0;

        for(int i = 0; i <= height.length; i++) {

            int curr = (i == height.length) ? 0 : height[i];

            while(!st.isEmpty() && height[st.peek()] > curr) {

                int h = height[st.pop()];

                int width;

                if(st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }

                max = Math.max(max, h * width);
            }

            if(i < height.length) {
                st.push(i);
            }
        }

        return max;
    }
}