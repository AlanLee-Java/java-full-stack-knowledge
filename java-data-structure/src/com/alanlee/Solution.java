package com.alanlee;

/**
 * 数据结构基础
 *
 * @author AlanLee
 * @date 2025-03-24
 */
public class Solution {

    /**
     * 把数组中的 0 移到末尾
     *
     * @param nums
     */
    public int[] moveZeroes(int[] nums) {
        int idx = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[idx++] = num;
            }
        }
        while (idx < nums.length) {
            nums[idx++] = 0;
        }
        return nums;
    }

    /**
     * 改变矩阵维度
     *
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }
        int[][] reshapedNums = new int[r][c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshapedNums[i][j] = nums[index / n][index % n];
                index++;
            }
        }
        return reshapedNums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // 把数组中的 0 移到末尾
        int[] nums = {0, 1, 0, 3, 12};
        int[] newNums = solution.moveZeroes(nums);
        for (int newNum : newNums) {
            System.out.println(newNum);
        }
    }

}