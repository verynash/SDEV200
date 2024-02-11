/*
 * Name:    Zachary Barrett
 * Date:    02/11/2024
 * Program: CountKeywords.java
 * Purpose: Modify CountKeywords to ignore keywords that are part of
 *          a comment or a string. This program can be tested by
 *          running the command: java CountKeywords
 *          and then entering: test.txt
 *          The file test.txt should contain 3 non-comment and
 *          non-string keywords.
 */

import java.util.*;
import java.io.*;

public class CountKeywords {
  public static void main(String[] args) throws Exception {  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Java source file: ");
    String filename = input.nextLine();

    File file = new File(filename);
    if (file.exists()) {
      System.out.println("The number of keywords in " + filename 
        + " is " + countKeywords(file));
    }
    else {
      System.out.println("File " + filename + " does not exist");
    }    
  }

  public static int countKeywords(File file) throws Exception {  
    // Array of all Java keywords + true, false and null
    String[] keywordString = {"abstract", "assert", "boolean", 
      "break", "byte", "case", "catch", "char", "class", "const",
      "continue", "default", "do", "double", "else", "enum",
      "extends", "for", "final", "finally", "float", "goto",
      "if", "implements", "import", "instanceof", "int", 
      "interface", "long", "native", "new", "package", "private",
      "protected", "public", "return", "short", "static", 
      "strictfp", "super", "switch", "synchronized", "this",
      "throw", "throws", "transient", "try", "void", "volatile",
      "while", "true", "false", "null"};

    Set<String> keywordSet = 
      new HashSet<>(Arrays.asList(keywordString));
    int count = 0;    

    Scanner input = new Scanner(file);

    while (input.hasNext()) {
      String word = input.next();

      // Ignore any words in a comment
      if (word.equals("//")) {
        input.nextLine();
      }

      // Ignore any words in block comments
      else if (word.contains("/*")) {
        String s = "";
        do {
          s = input.next();
        } while (!s.contains("*/"));
      }

      // Ignore any words in strings
      else if (word.contains("\"")) {
        String s = "";
        do {
          s = input.next();
        } while (!s.contains("\""));
      }

      // Add keywords to count
      else if (keywordSet.contains(word)) {
        count++;
      }
    }

    return count;
  }
}