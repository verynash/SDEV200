/*
 * Author:  Zachary Barrett
 * Date:    02/18/2024
 * This program creates a Game class with constructors, variables,
 *  and methods. It extends the Category class.
 */

import java.util.ArrayList;

public class Game extends Category {
  // Initialize variables
  private String name;
  private String developer;
  private String releaseDate;
  private int rating;
  private String description;
  private ArrayList<Comment> comments = new ArrayList<Comment>();

  // Default constructor
  public Game() {}

  // Primary constructor
  public Game(String name, String developer, String releaseDate, 
              int rating, String description) {
    this.name = name;
    this.developer = developer;
    this.releaseDate = releaseDate;
    this.rating = rating;
    this.description = description;
  }

  /* GETTERS */
  public String getGameName() {
    return name;
  }

  public String getDeveloper() {
    return developer;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public int getRating() {
    return rating;
  }

  public String getDescription() {
    return description;
  }

  /* SETTERS */
  public void setGameName(String name) {
    this.name = name;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  // Add a comment to the ArrayList<> comments
  public void addComment(Comment comment) {
    comments.add(comment);
  }

  // Override the default toString method
  @Override
  public String toString() {
    return "Game: " + name + "\nDeveloper: " + developer 
      + "\nRelease date: " + releaseDate + "\nRating: " + rating
      + "\nDescription: " + description + "\nComments: " 
      + comments.toString();
  }
}
