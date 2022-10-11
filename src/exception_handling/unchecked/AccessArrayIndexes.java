package exception_handling.unchecked;

public class AccessArrayIndexes {
	public static void main(String[] args) {
		int[] numsArr = {32, 12, 45, 64, 76};
		
		try {
			for(int i = 0; i < numsArr.length; i++) {
				System.out.println(numsArr[i]);
			}
			System.out.println(numsArr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
