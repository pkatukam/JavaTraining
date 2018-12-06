public class MagicSquare {

	public static void main(String[] args) {
		/**
		 * 
		 8 58 59 5 4 62 63 1
		 * 
		 * 49 15 14 52 53 11 10 56
		 * 
		 * 41 23 22 44 45 19 18 48
		 * 
		 * 32 34 35 29 28 38 39 25
		 * 
		 * 40 26 27 37 36 30 31 33
		 * 
		 * 17 47 46 20 21 43 42 24
		 * 
		 * 9 55 54 12 13 51 50 16
		 * 
		 * 64 2 3 61 60 6 7 57
		 * 
		 * 
		 */
		int array[][] = { { 8, 58, 59, 5, 4, 62, 63, 1 },
				{ 49, 15, 14, 52, 53, 11, 10, 56 },
				{ 41, 23, 22, 44, 45, 19, 18, 48 },
				{ 32, 34, 35, 29, 28, 38, 39, 25 },
				{ 40, 26, 27, 37, 36, 30, 31, 33 },
				{ 17, 47, 46, 20, 21, 43, 42, 24 },
				{ 9, 55, 54, 12, 13, 51, 50, 16 },
				{ 64, 2, 3, 61, 60, 6, 7, 57 } };
		System.out.println("The array ");
		printArray(array);
		System.out.println("is a magic square ?");
		System.out.println(isMagicSquare(array));

	}

	private static boolean isMagicSquare(int[][] array) {
		int rowSum = 0;
		int magicSum = 0;
		int colSum = 0;
		int diagonalSum = 0;
		int diagnolRow = 0;
		int diagnolCol = array.length - 1;
		int diagnilSum1 = 0;
		for (int i = 0; i < array.length; i++) {
			rowSum = 0;
			colSum = 0;
			for (int j = 0; j < array.length; j++) {
				rowSum = rowSum + array[i][j];
				colSum = colSum + array[j][i];
				if (i == j)
					diagonalSum = diagonalSum + array[i][j];
				if (i == diagnolRow && j == diagnolCol) {
					diagnilSum1 = diagnilSum1 + array[i][j];
					diagnolRow++;
					diagnolCol--;
				}
			}
			if (i == 0)
				magicSum = rowSum;
			else if (magicSum != rowSum || magicSum != colSum)
				return false;

		}
		if (magicSum != diagonalSum && magicSum != diagnilSum1)
			return false;
		return true;
	}

	private static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
