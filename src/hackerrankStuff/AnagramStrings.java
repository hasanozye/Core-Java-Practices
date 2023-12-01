package hackerrankStuff;

import java.util.Arrays;

public class AnagramStrings {

    public static void main(String[] args) {

        String a = "java";
        String b = "java";

        System.out.println(isAnagram(a, b));


    }


    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int charCount = 26; // assuming lowercase letters only
        int[] frequency = new int[charCount];

        // count occurrences of each character in a
        for (char c : a.toLowerCase().toCharArray()) {
            frequency[c - 'a']++;
        }

        // subtract occurrences of each character in b
        for (char c : b.toLowerCase().toCharArray()) {
            frequency[c - 'a']--;
        }

        // check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

/*
Let's break down the provided code for the anagram problem:

1. Function Definition:

public static boolean isAnagram(String str1, String str2) {
This defines a public static method called isAnagram that takes two strings, str1 and str2, as arguments and returns a boolean value indicating whether they are anagrams.

2. Length Check:

if (str1.length() != str2.length()) {
  return false;
}
This checks if the lengths of both strings are equal. If they are not, they cannot be anagrams, so the function returns false immediately.

3. Character Frequency Array:

int charCount = 26; // assuming lowercase letters only
int[] frequency = new int[charCount];
This initializes two variables:

charCount: This is an integer set to 26, assuming the strings only contain lowercase letters (a to z).
frequency: This is an integer array of size charCount, used to store the frequency of each character.
4. Count Occurrences (str1):

for (char c : str1.toCharArray()) {
  frequency[c - 'a']++;
}
This iterates through each character c in the str1 string using a for-each loop:

toCharArray(): This method converts the string str1 into an array of characters.
c - 'a': This calculates the index of the character in the frequency array by subtracting its ASCII value ('a') from the current character's ASCII value.
frequency[c - 'a']++: This increments the frequency count at the calculated index for the current character.
5. Subtract Occurrences (str2):

for (char c : str2.toCharArray()) {
  frequency[c - 'a']--;
}
This performs the same operation as step 4 but iterates through str2 and decrements the frequency count for each character's index in the frequency array.

6. Frequency Check:

for (int count : frequency) {
  if (count != 0) {
    return false;
  }
}
This iterates through each element of the frequency array:

count: This iterates over each element in the frequency array.
count != 0: This checks if the current frequency count is not equal to zero.
return false: If any frequency count is not zero, it indicates that the character occurrences are not equal in both strings, so the function returns false.
7. Anagram Found:

return true;
If the loop in step 6 completes without encountering any non-zero count, it means the frequency of all characters is equal in both strings. Therefore, the function returns true, indicating they are anagrams.

Overall Explanation:

This approach leverages a single array to track character frequencies. It avoids complex data structures like HashMaps while maintaining readability and efficiency. The code iterates through both strings once, updating the frequency count accordingly. Finally, it checks if all frequencies are zero, indicating equal character distribution, signifying anagrams. This solution demonstrates your understanding of basic character manipulation, array indexing, and logic flow, making it a suitable choice for interview settings.


Fourth Step Explanation:

Imagine the frequency array as a list of 26 boxes, one for each letter of the alphabet (a to z).

Breakdown:

for (char c : str1.toCharArray()): This line iterates through each character "c" in the first string "str1" one by one.
c - 'a': This subtracts the ASCII value of 'a' (97) from the ASCII value of the current character "c". This helps us determine the index of the corresponding box in the frequency array.
frequency[c - 'a']++: This increases the value stored in the box with the index calculated in step 2. This essentially counts the number of times each character appears in the first string.
For example:

If "c" is the letter "b", then c - 'a' becomes 1.
This means we increment the value in the second box (index 1) of the frequency array.
This process repeats for each character in the first string, maintaining a count of their occurrences.
Think of it like putting colored marbles in the boxes. Each box represents a letter, and each marble represents a time that letter appears in the string.

This step is crucial because it helps us compare the character occurrences of both strings. We will use the updated frequency array in the next step to see if the second string has the same character distribution, confirming if they are anagrams.

Remember, the key takeaway is that this step builds a "counter" for each letter in the first string, helping us compare character frequencies later.
 */
