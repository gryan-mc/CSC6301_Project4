package Projects.Week4;

import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
/**
 * This program asks the user to input integers,
 * stores the integers in a LinkedList, and sorts the
 * list from smallest to shortest.
 * This program also utilizes the Java collections framework, including
 * util.Collections, and util.LinkedList
 * @author Greg Ryan
 * CSC6301
 * @since Week 4 of CSC6301
 */
public class ReadIntegers {
    /**
     * Main method that initializes a new LinkedList 'nums',
     * asks the user to input integers, stores the given input in the LinkedList,
     * prints the original LinkedList, sorts the LinkedList,
     * and then prints the new sorted LinkedList.
     * @param args - default parameter for main, not used
     * @since week 4 of CSC6301
     */
    public static void main(String[] args) {
        /*
        initialize the LinkedList to hold the list of integers

        CODE REUSE
        Here the LinkedList class from the Java Collections framework is utilized rather than
        writing a whole new LinkedList class.
         */
        LinkedList<Integer> nums = new LinkedList<>();

        // get the scanned input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a list of integers separated by spaces");
        System.out.println("Enter 'Q' at the end when done entering integers.");

        /*
          This while loop will run until a non-integer is detected, gathering all
          integer values and adding them to the LinkedList.
          White space and enter/return will also not end the loop, thus why the user
          is asked to input 'Q' when they are done. Really any non-integer value will work,
          it's just simpler to give the user instructions.
         */
        while (sc.hasNextInt()) {
            nums.add(sc.nextInt());
        }

        // print the initial list of integers provided for clarity
        System.out.println("Here is the initial list: ");
        System.out.println(nums);
        System.out.println();

        /*
          Sort the list and print it again

          CODE REUSE
          Here, the Collections.sort() method is utilized from the java collections framework
          rather than writing a whole new sort method.
         */
        Collections.sort(nums);
        System.out.println("Here is the sorted list: ");
        System.out.println(nums);

        sc.close();
    }
}
