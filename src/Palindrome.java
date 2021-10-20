public class Palindrome {

    public static void main(String[] args){
        System.out.println(isPalindrome("balisticacitsilab"));
    }
    
    public static boolean isPalindrome(String word){
        char[] letters = word.toCharArray();
        boolean isPalindrome = true;
        int totalLength = word.length();    // length of the word
        double numOfVowels = 0;

        for (char letter: letters) // for loop to count number of vowels
        {
            if(isVowel(letter)){
                numOfVowels++;
            }
        }

        int length = word.length(); // new length value that will be altered by the for loop
        for (int index = 0; index < (length/2)+1; index++, length--){   // for loop to check if word is a palindrome
            if(Character.toLowerCase(letters[index]) != Character.toLowerCase(letters[length-1])) {
                isPalindrome = false;
                break;
            }
        }

        boolean isOdd = isOdd((int) numOfVowels);
        double percentage = (numOfVowels/totalLength)*100;

        System.out.println((int)numOfVowels);
        System.out.println(isOdd);
        System.out.println(percentage + "%");

        return isPalindrome;
    }

    public static boolean isVowel(char letter){
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }

    public static boolean isOdd(int number){
        return number%2 > 0;
    }
}
