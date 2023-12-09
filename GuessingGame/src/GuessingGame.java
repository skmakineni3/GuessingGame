import java.util.Scanner;

public class GuessingGame {
	
	public GuessingGame() {
		boolean stillPlaying = true;
		
		while (stillPlaying == true) {
		
			int RandomNum = (int) (Math.random() * 101);
			System.out.println("Your Random Number is generated. Guess to play ");  
			Scanner scanner = new Scanner(System.in);
			int guess = -1;
			int count = 0;
			while (guess != RandomNum) {
				count = count + 1;
				String input = scanner.nextLine();
				guess = Integer.parseInt(input);
				if (guess < RandomNum) {
					System.out.println("Guess is less than Random Number.");
				} 
				else if (guess > RandomNum){
				System.out.println("Guess is greater than Random Number.");
				}
				else {
					System.out.println("You Got it!");
					System.out.println("You took "+count+" tries.");

				}
			}
			System.out.println("Play again?");
			String yesno = scanner.nextLine();
			if (yesno.equals("yes") || yesno.equals("y")) {
				stillPlaying = true;
			}
			else {
				stillPlaying = false;
			}		
		
		}	
	
	}

	public static void main(String[] args) {
		new GuessingGame();
	}
}
//In java read in a string from the console. create an output string that
//displays the string, a space, then the string without the last letter, a
//space, then the string without the last two letters, etc. until you finish
//with only the first letter. display the result to the console. Input: dog.
Output: dog do d
import java.util.Scanner;
public class StringTruncation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.nextLine();
String output = "";
for (int i = input.length(); i > 0; i--) {
output += input.substring(0, i) + " ";
}

System.out.println(output);

}
}

In java read in a string from the console. Multiply the number of
consonants by the number of vowels and display the result to the console.
import java.util.Scanner;
public class ConsonantVowelProduct {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.nextLine();
int consonantCount = 0;
int vowelCount = 0;

for (int i = 0; i < input.length(); i++) {
char c = Character.toLowerCase(input.charAt(i));
if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
vowelCount++;
} else if (Character.isLetter(c)) {
consonantCount++;
}
}

int result = consonantCount * vowelCount;
System.out.println("The product of the number of consonants and vowels
is: " + result);
}
}

In java read in a string from the console. Separate consonants and vowels
into 2 string, all lowercase letters, disregarding punctuation,
capitalization and spaces. Display both strings to the console, consonants
first. Input: Hello World!. Output: hllwrld eoo

import java.util.Scanner;
public class ConsonantVowelSeparation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.nextLine();
String consonants = "";
String vowels = "";
for (int i = 0; i < input.length(); i++) {
char c = input.charAt(i);
if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c

== 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

vowels += Character.toLowerCase(c);
} else if (Character.isLetter(c)) {
consonants += Character.toLowerCase(c);
}
}
System.out.println("Consonants: " + consonants);
System.out.println("Vowels: " + vowels);
}
}

//import java.util.Scanner;

public class IntegerReader {
public static void main(String[] args) {
// Create a Scanner to read input from the console
Scanner scanner = new Scanner(System.in);

// Prompt the user to enter a string of integers
System.out.print("Enter a string of integers separated by spaces: ");

// Read the input and store it in a variable
String input = scanner.nextLine();

// Split the input string into an array of integers
String[] integers = input.split(" ");

// Initialize a variable to track if a number greater than or equal to 12 has been found
boolean greaterThanTwelveFound = false;

// Iterate through the array of integers
for (String str : integers) {
// Parse the current string as an integer
int num = Integer.parseInt(str);
// Check if the current number is greater than or equal to 12
if (num >= 12) {
greaterThanTwelveFound = true;
// If it is, print the number and break out of the loop
System.out.println(num);
break;
}
// If not, print the number
System.out.println(num);
}

// If none of the numbers were greater than or equal to 12, print the original input string
if (!greaterThanTwelveFound) {
System.out.println("original string: " + input);
}
}
}


