package ExcelrAssignments;

public class FirstNonRepeatingCharacter {
	
	 public static void main(String args[])
	    {
	        String inputStr ="aai";
	        boolean flag = true;

	        for(char i :inputStr.toCharArray())
	        {
	            // if current character is the last occurrence in the string
	            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i))
	            {
	                System.out.println("First non-repeating character is: "+ i);
	                
	                flag = false;
	                
	                break;
	            }
	        }

	        if(flag)
	        	
	            System.out.println("There is no non repeating character in input string");
	    }

}
