/*
 * Author:  Zachary Barrett
 * Date:    02/18/2024
 * This program creates a Category class with constructors, 
 * variables, and methods.
 */

public class Category {
  // Initialize variables
  private String categoryName;
  private String categoryDescription;
  private Game categoryWinner;

  // Default constructor
  public Category() {}

  public Category(String name) {
    this.categoryName = name;
  }

  // Primary constructor
  public Category(String name, String description, Game winner) {
    this.categoryName = name;
    this.categoryDescription = description;
    this.categoryWinner = winner;
  }

  /* GETTERS */
  public String getCategoryName() {
    return categoryName;
  }

  public String getCategoryDescription() {
    return categoryDescription;
  }

  public Game getWinner() {
    return categoryWinner;
  }

  /* SETTERS */
  public void setCategoryName(String name) {
    this.categoryName = name;
  }

  public void setCategoryDescription(String description) {
    this.categoryDescription = description;
  }

  public void setCategoryWinner(Game game) {
    this.categoryWinner = game;
  }

  // Override default toString method.
  @Override
  public String toString() {
    return "Category: " + categoryName + "\nDescription: " 
      + categoryDescription + "\nWinner: " + categoryWinner.getGameName();
  }
}
