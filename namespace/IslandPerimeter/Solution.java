package IslandPerimeter;

/**
 * Created by slipkinem on 11/1/2017.
 */

/**
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally).
 * The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
 * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100.
 * Determine the perimeter of the island.
 * [link](https://leetcode.com/problems/island-perimeter/description/)
 * 分析：
 * 思考问题的时候不妨换一个角度，从累加的方式变成减的方式。首先两个相邻的四边形重合，那么就等于减去两个边长。
 * 重合的情况分为上下重合和左右重合，先将为 1 的四边形整体周长求出，再依次减去重叠的边。
 */
public class Solution {
    public int islandPerimeter(int grid[][]) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int perimeter = 0;
        for (int i = 0, ii = grid.length; i < ii; i++) {
            for (int j = 0, jj = grid[0].length; j < jj; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    if (j + 1 < jj && grid[i][j + 1] == 1) perimeter -= 2;
                    if (i + 1 < ii && grid[i + 1][j] == 1) perimeter -= 2;
                }
            }
        }
        return perimeter;
    }

    public static void main(String[] args) {
        int island[][] = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        Solution solution = new Solution();
        System.out.println(solution.islandPerimeter(island));
    }
}
