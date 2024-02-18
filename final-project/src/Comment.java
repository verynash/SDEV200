/*
 * Author:  Zachary Barrett
 * Date:    02/18/2024
 * This program creates a Comment class with constructors, 
 * variables, and methods. It extends the Game class.
 */

public class Comment extends Game {
  // Initialize variables
  private String user;
  private String comment;

  // Default constructor
  public Comment() {}

  // Primary constructor
  public Comment(String user, String comment) {
    this.user = user;
    this.comment = comment;
  }

  /* GETTERS */
  public String getUser() {
    return user;
  }

  public String getComment() {
    return comment;
  }

  /* SETTERS */
  public void setUser(String user) {
    this.user = user;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  // Override default toString method
  @Override
  public String toString()  {
    return user + ": " + comment;
  }
}
