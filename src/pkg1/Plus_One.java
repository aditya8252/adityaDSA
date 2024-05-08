package pkg1;

import java.util.Arrays;

public class Plus_One {


	public static int[] plusOneMethod(int[] digits) {

		int n=digits.length;

		for(int i=n-1;i>=0;i--){
			if(digits[i]<9){
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;

	}
	public static void main(String[] args) {
		
		int value[] = {1,2,6};
		int res[] = plusOneMethod(value);
		System.out.println(Arrays.toString(res));
	}
}