package basic.java.leetcode._073SetMatrix0;

/**
 * Created by Irene on 2018-02-05.
 */

import java.util.Arrays;

/***
 * Set Matrix Zeroes
 * Description
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 */

public class Solution {
    public void setMatrixZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean rflag = false, cflag = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) rflag = true;
                    if (j == 0) cflag = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (cflag) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if (rflag) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    public void setMatrixZeroes1(int[][] matrix) {
        if ((matrix == null || matrix.length == 0)) return;
        int m = matrix.length, n = matrix[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] == 1 || cols[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] input = {{1, 2, 9}, {2, 1, 1}, {4, 0, 3}, {6, 7, 8}};
        //s.setMatrixZeroes(input);
        s.setMatrixZeroes1(input);
        System.out.println(Arrays.deepToString(input));
    }
}
