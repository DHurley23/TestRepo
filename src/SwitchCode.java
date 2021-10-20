public class SwitchCode {
    public static void main(String[] args) {
        /*
        1. Why
        2. How
        3. What
         */
        int x = 5, y = 3; // Declared two ints and initialized their values
        char charExamined = 'i';
        /**
         * if ... else if ... else
         */
        if (charExamined == 'a') {
            System.out.println("It's a vowel");
        } else if (charExamined == 'e') {
            System.out.println("It's a vowel");
        } else if (charExamined == 'i') {
            System.out.println("It's a vowel");
        } else {
            System.out.println("It's a consonant");
        }

        /*
        AND &, && or OR |, ||
         */
        if ((charExamined == 'a') | (charExamined == 'e')) {
            System.out.println("It's a vowel");
        }
        /*
        If using &
         */
        int age = 29;

        if ((age >= 13) & (age <= 19)) {
            System.out.println("Person is a teenager");
        }

    }
}
