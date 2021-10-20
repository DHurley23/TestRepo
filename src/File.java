public class File {

    public static void main(String[] args) {
        int x = 3;
        boolean isOn = true;
        Boolean f = false;
        /*
        Strings are OBJECTS
        1. An object can store a value
        2. Objects have functionality
        */
        // 3 ways to declare a string
        String name = new String(); // Instantiating a blank string ... It's empty
        name = "Eugene";
        String name2 = new String("Frank"); // Instantiating a string with a value
        String name3 = "Donal";
        System.out.println(name);
        char first = name.charAt(0);
        System.out.println(first);
        Character firstChar = first; //Copying the value of a char to it's Object equivalent

        for(int i = 0; i < name.length();i++)
        {
            System.out.println(name.charAt(i));
        }
        /*
        1. How many vowels are in a word
        2. Is it an odd or even number
        3. % of each
        4. Pallindrome ... racecar
        */

    }// End of main

}
