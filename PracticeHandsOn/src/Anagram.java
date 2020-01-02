import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "O draconian devil! Oh lame saint!";
	      String str2 = "Leonardo Da Vinci! The Mona Lisa!";

	      if (str1.length()==str2.length()) {
	    	  
	         char[] arr1 = str1.toUpperCase().toCharArray();
	         Arrays.sort(arr1);
	         
	         System.out.println(Arrays.toString(arr1));
	         
	         char[] arr2 = str2.toUpperCase().toCharArray();
	         Arrays.sort(arr2);
	         
	         System.out.println(Arrays.toString(arr2));
	         
	         System.out.println(Arrays.equals(arr1, arr2));
	         
	         if(Arrays.equals(arr1, arr2) == true) {
	        	 System.out.println("Given strings are anagrams");
	         }
	         
	         else {
	        	 
	            System.out.println("Given strings are not anagrams");
	         }

	}

}
}
