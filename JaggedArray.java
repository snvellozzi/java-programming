
public class JaggedArray {

	public static void main(String[] args) {
		
		//declares 2-D array with 3 rows
		int myArr[][] = new int[5][];
		
		//number of columns in each row
		myArr[0] = new int[2];
		myArr[1] = new int[3];
		myArr[2] = new int[1];
		myArr[3] = new int[5];
		myArr[4] = new int[8];
		
		//initializes array
		int count = 0;
		for(int i = 0; i < myArr.length; i++)
			for(int j = 0; j < myArr[i].length; j++)
				myArr[i][j] = count++;
		
		//shows values in 2D jagged array
		for(int i = 0; i < myArr.length; i++) {
			for(int j = 0; j < myArr[i].length; j++)
				System.out.print(myArr[i][j] + " ");
			System.out.println();
		}		
	}
}
