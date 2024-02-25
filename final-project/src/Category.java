/*
 * Author:  Zachary Barrett
 * Date:    02/18/2024
 * This program creates a Category class with constructors, 
 * variables, and methods.
 */

import java.util.ArrayList;

public class Category {
  // Initialize variables
  private String categoryName;
  private String categoryDescription;
  protected Game categoryWinner;
  ArrayList<Game> games = new ArrayList<>();
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

  public ArrayList<Game> getGames() {
    return this.games;
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

  public void addGames(Game... args) {
    for (Game arg : args) {
      games.add(arg);
    }
  }
  // Override default toString method.
  @Override
  public String toString() {
    return "Category: " + categoryName + "\nDescription: " 
      + categoryDescription + "\nWinner: " + categoryWinner.getGameName()
      + "\n";
  }
}
