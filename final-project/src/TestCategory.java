/*
 * Author:  Zachary Barrett
 * Date:    02/18/2024
 * This program tests the Category class and its methods and 
 * constructors.
 */

public class TestCategory {
  public static void main(String[] args) {
    // Initialize two Game classes for testing
    Game sts = new Game("Slay the Spire", "MegaCrit", 
      "2019", 10, "Amazing description");
    Game bg3 = new Game("Baldurs Gate 3", "Larian", 
      "2023", 10, "Game of the year");

    /* Test the default constructor and various methods, utilizing
       the Game class */
    Category cat1 = new Category();
    cat1.setCategoryName("Deck Builders");
    cat1.setCategoryDescription("Building decks category");
    cat1.setCategoryWinner(sts);

    /* Test the primary constructor */
    Category cat2 = new Category("RPGs", "Role-playing games", bg3);
    
    // Display results
    System.out.println(cat1.toString());
    System.out.println(cat2.toString());
  }
}
