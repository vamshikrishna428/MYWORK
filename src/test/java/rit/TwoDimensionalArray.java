package rit;

public class TwoDimensionalArray {
	/**
	 * Finds the maximum value in a two-dimensional array.
	 *
	 * @param numbers the two-dimensional array of integers
	 * @return the maximum value found in the array
	 * @example int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	 *          TwoDimensionalArray tda = new TwoDimensionalArray(); int maxValue =
	 *          tda.findMaxValue(array); // maxValue will be 9
	 */
	public int findMaxValue(int[][] numbers) {
		int highest = Integer.MIN_VALUE;
		for (int[] row : numbers) {
			for (int num : row) {
				if (num > highest) {
					highest = num;
				}
			}
		}
		return highest;

	}

	/**
	 * Finds the minimum value in a two-dimensional array.
	 *
	 * @param numbers the two-dimensional array of integers
	 * @return the minimum value found in the array
	 * @example int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	 *          TwoDimensionalArray tda = new TwoDimensionalArray(); int minValue =
	 *          tda.findMinValue(array); // minValue will be 1
	 */
	public int findMinValue(int[][] numbers) {

		int lowest = Integer.MAX_VALUE;
		for (int[] row : numbers) {
			for (int num : row) {
				if (num < lowest) {
					lowest = num;
				}
			}
		}
		return lowest;
	}

	/**
	 * Calculates the sum of all the elements in a two-dimensional array.
	 *
	 * @param numbers the two-dimensional array of integers
	 * @return the sum of all the elements in the array
	 * @example int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	 *          TwoDimensionalArray tda = new TwoDimensionalArray(); int sum =
	 *          tda.calcSum(array); // sum will be 45
	 */
	public int calcSum(int[][] numbers) {
		int sum = 0;
		for (int[] row : numbers) {
			for (int num : row) {
				sum += num;
			}
		}
		return sum;
	}

	/**
	 * Calculates the sum of each row in a two-dimensional array.
	 *
	 * @param numbers the two-dimensional array of integers
	 * @return an array of integers where each element is the sum of the
	 *         corresponding row in the input array
	 * @example int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	 *          TwoDimensionalArray tda = new TwoDimensionalArray(); int[] sums =
	 *          tda.calcSumForEachRow(array); // sums will be {6, 15, 24}
	 */
	public int[] calcSumForEachRow(int[][] numbers) {
		int[] rowSums = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			int sum = 0;
			for (int num : numbers[i]) {
				sum += num;
			}
			rowSums[i] = sum;
		}
		return rowSums;
	}

	/**
	 * Calculates the sum of each column in a two-dimensional array.
	 *
	 * @param numbers the two-dimensional array of integers
	 * @return an array of integers where each element is the sum of the
	 *         corresponding column in the input array
	 * @example int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	 *          TwoDimensionalArray tda = new TwoDimensionalArray(); int[] sums =
	 *          tda.calcSumForEachColumn(array); // sums will be {12, 15, 18}
	 */
	public int[] calcSumForEachColumn(int[][] numbers) {
		if (numbers.length == 0)
			return new int[0];
		int[] colSums = new int[numbers[0].length];
		for (int j = 0; j < numbers[0].length; j++) {
			int sum = 0;
			for (int[] row : numbers) {
				sum += row[j];
			}
			colSums[j] = sum;
		}
		return colSums;
	}

}
