/*
 * Name:    Zachary Barrett
 * Date:    02/11/2024
 * Program: MatchGroupingSymbols.java
 * Purpose: Create a program that checks if the source code has the
 *          correct grouping symbols. This class can be tested using
 *          the command: java MatchGroupingSymbols test.java
 */

import java.io.*;
import java.util.*;

/*
 * This class can be tested using the command: 
 * java MatchGroupingSymbols test.java
 */
public class MatchGroupingSymbols {
  public static void main(String[] args) throws IOException {
    // Check for proper arguments
    if (args.length != 1) {
      System.out.println("Usage: MatchGroupingSymbols.java FileName");
      System.exit(0);
    }

    // Check if file exists
    File file = new File(args[0]);
    if (!file.exists()) {
      System.out.println("File does not exist.");
      System.exit(1);
    }

    // Create stack for grouping symbols
    Stack<Character> groupingSymbols = new Stack<>();

    
    try (Scanner input = new Scanner(file);) {
      // While there are more characters in the file
      while (input.hasNext()) {
        String line = input.nextLine();
        // Iterate over each character searching for grouping symbols
        for (int i = 0; i < line.length(); i++) {
          char c = line.charAt(i);
          // If there is a starting grouping symbol, 
          // add it to the stack
          if (c == '(' || c == '{' || c == '[') {
            groupingSymbols.push(c);
          }
          // If there is an ending grouping symbol, use
          // manageGroupingSymbols to check if it is valid
          else if (c == ')' || c == '}' || c == ']') {
            manageGroupingSymbols(groupingSymbols, c);
          }
        }
      }
    }
    // If the stack is empty, the grouping symbols were correct.
    if (groupingSymbols.isEmpty()) {
      System.out.println("The grouping symbol pairs are correct");
    }
    else {
      System.out.println("The grouping symbol pairs are incorrect");
    }
  }

  // Check whether opening and closing grouping symbols are correct.
  private static void manageGroupingSymbols(Stack<Character> stack,
                                            Character c) {
      // If the stack opening character and end grouping character
      // match, remove the opening character from the stack.
     if ((stack.peek() == '(' && c == ')') ||
         (stack.peek() == '[' && c == ']') ||
         (stack.peek() == '{' && c == '}')) {        
        stack.pop();
      }
      // If a stack closing character does not match the opening
      // character, display to the user that there are incorrect
      // pairs and exit the program.
      else if ((stack.peek() != '(' && c == ')') ||
               (stack.peek() != '[' && c == ']') ||
               (stack.peek() != '{' && c == '}')) {
        System.out.println("The grouping symbol pairs are incorrect");
        System.exit(1);
      }
   }
}
