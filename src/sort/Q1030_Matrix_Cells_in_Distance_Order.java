package sort;

import java.util.*;

//We are given a matrix with rows rows and cols columns has cells with integer coordinates (r, c), where 0 <= r < rows and 0 <= c < cols.

//
//Additionally, we are given a cell in that matrix with coordinates (rCenter, cCenter).
//
//Return the coordinates of all cells in the matrix, sorted by their distance from (rCenter, cCenter) from smallest distance to largest distance.  Here, the distance between two cells (r1, c1) and (r2, c2) is the Manhattan distance, |r1 - r2| + |c1 - c2|.  (You may return the answer in any order that satisfies this condition.)
//
// 
//
//Example 1:
//
//Input: rows = 1, cols = 2, rCenter = 0, cCenter = 0
//Output: [[0,0],[0,1]]
//Explanation: The distances from (0, 0) to other cells are: [0,1]
//Example 2:
//
//Input: rows = 2, cols = 2, rCenter = 0, cCenter = 1
//Output: [[0,1],[0,0],[1,1],[1,0]]
//Explanation: The distances from (0, 1) to other cells are: [0,1,1,2]
//The answer [[0,1],[1,1],[0,0],[1,0]] would also be accepted as correct.
//Example 3:
//
//Input: rows = 2, cols = 3, rCenter = 1, cCenter = 2
//Output: [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
//Explanation: The distances from (1, 2) to other cells are: [0,1,1,2,2,3]
//There are other answers that would also be accepted as correct, such as [[1,2],[1,1],[0,2],[1,0],[0,1],[0,0]].
// 
//
//Note:
//
//1 <= rows <= 100
//1 <= cols <= 100
//0 <= rCenter < rows
//0 <= cCenter < cols

public class Q1030_Matrix_Cells_in_Distance_Order {
	public static void main(String[] args) {
		for (int[] i : allCellsDistOrder(2, 3, 1, 2)) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
		int[][] res = new int[rows * cols][];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				res[i * cols + j] = new int[] { i, j };
			}
		}

		Arrays.sort(res, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return (Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter))
						- (Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter));
			}
		});

		return res;
	}
}
