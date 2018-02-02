package basic.java.leetcode._048RotateImage;

/**
 * Created by Irene on 2018-02-01.
 */

import java.util.Arrays;

/***
 * Rotate Image
 * Description
 * Rotate the image by 90 degrees (clockwise). given an n x n 2D matrix.
 * Given input matrix =
 [
 [1,2,3],
 [4,5,6],
 [7,8,9]
 ],

 rotate the input matrix in-place such that it becomes:
 [
 [7,4,1],
 [8,5,2],
 [9,6,3]
 ]
 */
public class Solution {

    public int[][] rotateClockwise(int[][] image) {
        if (image == null || image.length <= 1) return image;
        int m = image.length;
        //transpose
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }
        //inverse
        int temp;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m / 2; j++) {
                temp = image[i][j];
                image[i][j] = image[i][m - j - 1];
                image[i][m - j - 1] = temp;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] image = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res = s.rotateClockwise(image);
        System.out.println(Arrays.deepToString(res));
    }

}
