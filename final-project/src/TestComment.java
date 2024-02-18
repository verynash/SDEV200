/*
 * Author:  Zachary Barrett
 * Date:    02/18/2024
 * This program tests the Comment class and its constructors and 
 * methods.
 */

public class TestComment {
  public static void main(String[] args) {
    /* Test the default constructor and methods */
    Comment comment1 = new Comment();
    comment1.setUser("ice9");
    comment1.setComment("This is the first comment.");

    /* Test the primary constructor */
    Comment comment2 = new Comment("ice9", 
      "This is the second comment.");

    // Display results
    System.out.println(comment1.toString());
    System.out.println(comment2.toString());

  }
  
}
