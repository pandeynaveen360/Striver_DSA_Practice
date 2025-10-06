package String;

public class ReverseWordsInString {

    public static String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();

        // Step 2: Split by one or more spaces (regex \\s+ handles multiple spaces)
        String[] words = s.split("\\s+");

        // Step 3: Reverse words
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        // Step 4: Return final string
        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello   world  ";
        String s3 = "a good   example";

        System.out.println(reverseWords(s1)); // Output: "blue is sky the"
        System.out.println(reverseWords(s2)); // Output: "world hello"
        System.out.println(reverseWords(s3)); // Output: "example good a"
    }
}
