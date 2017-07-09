package Java_Assignment72;
/*
 * This class will help to master the String class and Methods of String class concepts.
 * 
 * Problem Statement: WAP to sort words of given strings, then sort characters in each word
 */
import java.util.Arrays;

public class Java_Assignment7_2 
{
	public static void main(String[] args) 
	{
		String exmpl=new String("Raju is a good boy in class 8th");  //Initializing a string with multiple words
		String[] parts = exmpl.split("\\s+");  // Spliting the multi word string into a string array  
		Arrays.sort(parts); //Sorting the words with case sensitive		
		StringBuilder sb = new StringBuilder(); //StringBuilder to concantenate the strings in a single 
		StringBuilder sortChar = new StringBuilder(); //StringBuilder to concantenate the strings in a single after sorting by charater 
		for(String s:parts)
		{  
		   sb.append(s);  
		   sb.append(" ");  
		   sortChar.append(sortData(s)); // calling the function sortData to sort by character
		   sortChar.append(" ");
		}  
		
		System.out.println("The Sentence is: \n" + exmpl); // printing the Sentence

		String sorted = sb.toString().trim();  
		// printing the Sentence after sorting by word
		System.out.println("\nThe Sentence (After sorting the words with case sensitive ) is: \n" +sorted);
		
		String sortedChar = sortChar.toString().trim();  
		// printing the Sentence after sorting by each charater of the word
		System.out.println("\nThe Sentence (After sorting the words and then each character of the word with case sensitive) is: \n" +sortedChar);
		
	}
	
	
	public static String sortData(String s) //Method to search by each charater
	{
		
		String input =s;
	    char[] arr = input.toCharArray(); //Initializing the string characters in a char array
	    Arrays.sort(arr); // sorting the character array
	    String sorted1 = new String(arr);	// forming a string from the char array    
	    return sorted1; 
	}
	
	
}


