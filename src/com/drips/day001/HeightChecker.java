package com.drips.day001;

/**
 * @Description 1051. 高度检查器
 * @Author: lijb
 * @Date: 2019-11-19
 * @Time: 11:16
 */
public class HeightChecker {

    public static void main(String[] args) {

    }


    public int heightChecker(int[] heights) {

        int size = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > heights[i + 1]) {
                size++;
            }


        }


        return 0;

    }

}
