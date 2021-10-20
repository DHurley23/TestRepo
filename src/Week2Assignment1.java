import java.util.Scanner;

public class Week2Assignment1 {

    public static void main(String[] args){

        /*
        Swapping of variable values – Non-loops question
        One of the most frequent tasks in programming is the swapping of variable values. Create two variables and swap their values. HINT: You may need a third variable to do this.
         */
        //part 1
        int var1 = 21;  //value 1
        int var2 = 38;  //value 2
        int temp;       //temporary variable
        temp = var1;    //save value 1 in temp
        var1 = var2;    //override value 1 with value 2
        var2 = temp;    //override value 2 with temp value


        /*
        Do … while
        1.	Using a Do … While loop to show all the numbers between 1 and 100 inclusively
        2.	Now replicate the code using a While loop
        3.	To demonstrate the difference between a While and the Do … While loop, set the counter variable to a value above 100 and run the code
         */
        //part 2 (i)
        int count = 0;
        do {
            count++;
            System.out.println(count);
        } while(count < 100);

        //part 2 (ii)
        count = 0;
        while(count < 100){
            count++;
            System.out.println(count);
        }
        //part 2 (iii)
        /*
        changing to a value > 100 means that the do while runs and prints once
        the while loop never runs/prints a value
        */

        /*
        String operations
        1.	Write code that takes in a string that includes spacing e.g. “Today is Wednesday”. Then using a Do … While loop, calculate the length of the first word
        2.	Write a program that takes a string. If the string contains a number, stop at that point, show the number and its position.
         */

        //part 3 (i)
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please type in a sentence, the length of the first word will be calculated and returned: ");
        String inputString = myScanner.nextLine();
        char[] letters = inputString.toCharArray();
        int index = 0;
        int counter = 0;
        char space = ' ';
        while(letters[index] != space){
            counter++;
            index++;
        }
        System.out.println("Number of letters in the first word in the sentence: " + counter);


        //part 3 (ii)
        System.out.println("Please type in a word containing a number: ");
        inputString = myScanner.nextLine();
        char[] characters = inputString.toCharArray();
        int i = 0;
        int position = 1;
        while(!Character.isDigit(characters[i])){
            position++;
            i++;
        }
        System.out.println("The number in the word is: " + characters[i] + " and it was located in position: " + position);


        /*
        Menu Options
        1.	Take the menu code from the lecture and improve on it by
        a.	Allowing the user to confirm that they want to Exit
        b.	Ensuring that no incorrect numeric option is not inputted (Assume for now, that the user
         */

    }
}
