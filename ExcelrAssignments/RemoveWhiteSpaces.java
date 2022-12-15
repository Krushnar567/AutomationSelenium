package ExcelrAssignments;

public class RemoveWhiteSpaces {
	
	 public static void main(String[] args) {  
         
	        String str1="Mul ti plication";  
	          
	        str1 = str1.replaceAll("\\s+", "");  
	          
	        System.out.println("String after removing all the white spaces : " + str1);  
	    }  

}
