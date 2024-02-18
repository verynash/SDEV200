public class TestGame {
  public static void main(String[] args) {
    
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

    System.out.println(sts.toString());

    Game bg3 = new Game("Baldurs Gate 3", "Larian", 
      "2023", 10, "Game of the year");
    Comment bg3Comment = new Comment("ice9", "masterpiece *chef's kiss*");
    bg3.addComment(bg3Comment);
   
    System.out.println(bg3.toString());
  }
}
