package pkg1;

import java.util.Scanner;

//Valid Parentheses
//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false


class Problem20 {
    public static boolean isValid(String s) {
      String a="[]";
      String b="()";
      String c="{}";
        if(s.equals(a) || s.equals(b) || s.equals(c))
        {
          //  System.out.println("same");
            return true;
        }
        else 
        {
            //System.out.println("not same");
            return false;
        }
      
        
    }
    
    public static void main(String[] args) 
	{
    	System.out.println("enter any bracket: ");
    	Scanner sc=new Scanner(System.in);
    	String s=sc.nextLine();
    	//String s="(),{},[]";
    	boolean result = isValid(s);
        System.out.println(result);
	}
	
}


