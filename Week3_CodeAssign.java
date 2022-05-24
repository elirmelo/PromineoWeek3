//Promineo Tech BackEnd Software Developer
//Week3 Code Assignment
//Name: Elir Melo
//Date: 23-May-2022

import java.util.ArrayList;
import java.util.Scanner;

public class Week3_CodeAssign {

	public static void main(String[] args) {
		
		/*1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
			b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
			c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
		
		// Define variable array
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
		//Add values to ages
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8);
		ages.add(28);
		ages.add(93);
		
		//Gets the last position of the array
		int pos = ages.size() - 1;
		
		//Calculate the last array position less first array position
		int result = ages.get(pos) - ages.get(0);
		
		//Showing the result 
		System.out.println("Last Element minus First Element result (90-3): " + result);
		
		//Adding new element to the last position
		ages.add(30);
		
		//Gets the last position of the array
		pos = ages.size() - 1;
				
		//Calculate the last array position less first array position
		result = ages.get(pos) - ages.get(0);
		
		//Showing the result 
		System.out.println("Second time Last Element minus First Element result (30-3): " + result);
		
		int sum = 0;
		
		//Calculate the age average
		for(int i=0; i <= ages.size()-1; i++) {
			sum += ages.get(i);
		}
		result = sum / ages.size();
		
		//Showing the result 
		System.out.println("Average age is: " + result);		
		
		/* 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		 */
		
		//Create the array
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int count = 0, total = 0;
		
		//Count the letter in each array position
		for (String names1 : names) {
			sum = 0;
			sum+= names1.length();
			count += sum;
		}
		
		//Calculate the average
		total = count/names.length;
		
		//Showing the result
		System.out.println("average number of letters per name: " + total);

		String concatenated = "";
		
		//Concatenating all the names and space after each name
		for (String names1 : names) {
			concatenated += names1 + " ";
		}
		
		//Showing the concatenated names with spaces
		System.out.println(concatenated);
		
		/* 5.	Create a new array of int called nameLengths. Write a loop to iterate over the 
		 * previously created names array and add the length of each name to the nameLengths array.
		 */
		
		int[] nameLengths = new int[6];
		count = 0;
		for (String names1 : names) {
			nameLengths[count] = names1.length();
			count++;
		}
		
		/* 6.	Write a loop to iterate over the nameLengths array and calculate 
		 * the sum of all the elements in the array. Print the result to the console.
		 */
		
		result = 0;
		for (int length : nameLengths) {
			result+= length;
		}
		System.out.println("Sum of all elements: " + result);
	
		/*7.	Write a method that takes a String, word, and an int, n, as arguments and returns the 
		 * word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect 
		 * the method to return “HelloHelloHello”).
		 * 
		 */
				
		System.out.println(callBack("Carl", 10));
		
		/*8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
		 * (the full name should be the first and the last name as a String separated by a space).
		 * 
		 */
		System.out.println(fullName("Elir", "Melo"));
		
		/*9.	Write a method that takes an array of int and returns true if the 
		 * sum of all the ints in the array is greater than 100.
		 */
		
		int[] vNumbers = { 10, 5 , 50, 0 , 0};
		if (sumArray(vNumbers)) {
			System.out.println("Greater than 100");
		} else {
			System.out.println("Less or equal 100");
		}
		
		/* 10.	Write a method that takes an array of double and 
		 * returns the average of all the elements in the array.
		 */
		double[] avg = {10.5, 11, 12.8, 28.32, 8};
		System.out.println("Average: " + dAverage(avg));
		
		/* 11.	Write a method that takes two arrays of double and returns true if the average of the 
		 * elements in the first array is greater than the average of the elements in the second array.
		 */
		double[] dVector1 = {15, 30, 11.5, 14};
		double[] dVector2 = {10.5, 20.8, 14.6, 8};
		if( dCompare(dVector1, dVector2)) {
			System.out.println("First greater than second");
		} else {
			System.out.println("Second greater than first");
		}
		
		/*12.	Write a method called willBuyDrink that takes a boolean isHotOutside, 
		 * and a double moneyInPocket, and returns true if it is hot outside and if 
		 * moneyInPocket is greater than 10.50.
		 */
		boolean isHotOutside = true;
		double moneyInPocket = 11;
		if (willBuyDrink(isHotOutside, moneyInPocket)) {
			System.out.println("Buy drink now!");
		} else {
			System.out.println("Dont buy drink!");
		}
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Type Number: ");
		int number = in.nextInt();
		System.out.println("Type the power: ");
		int expo = in.nextInt();
		System.out.println(number + " power " + expo + " = " + power(number, expo) );
		
	}
	
//----------------------------------------------------------------------
// --------------------------- End of Main ----------------------------
//----------------------------------------------------------------------
	
	
	
	/*7.	Write a method that takes a String, word, and an int, n, as arguments and returns the 
	 * word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect 
	 * the method to return “HelloHelloHello”).
	 * 
	 */
	static String callBack(String word, int n) {
		String concat1 = "";
		for( int i=0; i < n; i++) {
			concat1 += word;
		}
		return concat1;
	}
	
	/*8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
	 * (the full name should be the first and the last name as a String separated by a space).
	 * 
	 */
	static String fullName (String fName, String lName) {
		String name = fName + " " + lName;
		return name;
	}
	
	/*9.	Write a method that takes an array of int and returns true if the 
	 * sum of all the ints in the array is greater than 100.
	 */
	static boolean sumArray ( int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	/* 10.	Write a method that takes an array of double and 
	 * returns the average of all the elements in the array.
	 */
	static double dAverage (double[] array) {
		double sum = 0;
		for (double arr : array) {
			sum += arr;
		}
		return sum/array.length;
	}
	
	/* 11.	Write a method that takes two arrays of double and returns true if the average of the 
	 * elements in the first array is greater than the average of the elements in the second array.
	 */
	
	static boolean dCompare (double[] dArray1, double[] dArray2) {
		double sum1 = 0, sum2 = 0, avg1 = 0, avg2 = 0;
		for (double arr : dArray1) {
			sum1 += arr;
		}
		avg1 = sum1/dArray1.length;
		
		for (double arr : dArray2) {
			sum2 += arr;
		}
		avg2 = sum2/dArray2.length;
		if( avg1 > avg2) {
			return true;
		} else {
			return false;
		}
	}
	
	/*12.	Write a method called willBuyDrink that takes a boolean isHotOutside, 
	 * and a double moneyInPocket, and returns true if it is hot outside and if 
	 * moneyInPocket is greater than 10.50.
	 */
	static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.5) {
			return true;
		} else {
			return false;
		}
	}
	
	/*13.	Create a method of your own that solves a problem. In comments, 
	 * write what the method does and why you created it.
	 */
	// This method calculate a number power to another number
	static int power (int num, int exp) {
		int result = num;
		for(int i=1; i < exp; i++ ) {
			result *= num;
		}
		return result;
	}

}
