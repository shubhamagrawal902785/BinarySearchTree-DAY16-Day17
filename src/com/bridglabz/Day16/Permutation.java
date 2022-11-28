package com.bridglabz.Day16;

public class Permutation {
	

		 
	    // Function to print all the permutations of str
	    static void printPermutn(String str, String ans)
	    {
	 
	        // If string is empty
	        if (str.length() == 0) {
	            System.out.print(ans + " ");
	            return;
	        }
	 
	        for (int i = 0; i < str.length(); i++) {
	 
	            
	            char ch = str.charAt(i);
	 
	            // Rest of the string after excluding
	            
	            String ros = str.substring(0, i) +
	                        str.substring(i + 1);
	 
	            // Recursive call
	            printPermutn(ros, ans + ch);
	        }
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        String s = "Apple";
	        printPermutn(s, "");
	    }
	}