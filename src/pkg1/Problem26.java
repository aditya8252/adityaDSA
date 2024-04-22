package pkg1;

public class Problem26 {
	
	 public static void removeDuplicatesAndPrintOriginal(int[] nums) {
	     
	        System.out.print(nums[0] + " ");

	        for(int i = 1; i < nums.length; i++) {
	            if(nums[i] != nums[i - 1]) {
	                System.out.print(nums[i] + " ");
	            }
	        }
	       
	    }

	public static void main(String[] args) 
	{
		int nums[] = {12, 12, 2, 2, 3, 4, 4, 5};
		System.out.print("Original elements: ");
  removeDuplicatesAndPrintOriginal(nums);
		
	}
}
