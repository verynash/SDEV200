/*
 * Author:  Zachary Barrett
 * Date:    02/18/2024
 * This program tests the Game class and its methods and constructors.
 */

public class TestGame {
  public static void main(String[] args) {
    /* Test the default constructor and methods and utilize the 
       Comment class */
    Game sts = new Game();
    Comment stsComment = new Comment("ice9", "frosty");
    Comment stsComment2 = new Comment("verynash", "cool game");
    sts.setGameName("Slay the Spire");
    sts.setDeveloper("MegaCrit");
    sts.setReleaseDate("2019");
    sts.setRating(10);
    sts.setDescription("Deck Builder");
    sts.addComment(stsComment);
    sts.addComment(stsComment2);
    
    /* Test the primary constructor */
    Game bg3 = new Game("Baldurs Gate 3", "Larian", 
    "2023", 10, "Game of the year", "./images/baldursGate3.jpg");
    Comment bg3Comment = new Comment("ice9", "masterpiece *chef's kiss*");
    bg3.addComment(bg3Comment);
    
    // Display results
    System.out.println(sts.toString());
    System.out.println(bg3.toString());
  }
}
