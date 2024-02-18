public class TestCategory {
  public static void main(String[] args) {
    Category cat1 = new Category();
    Game sts = new Game("Slay the Spire", "MegaCrit", 
      "2019", 10, "Amazing description");
    Game bg3 = new Game("Baldurs Gate 3", "Larian", 
      "2023", 10, "Game of the year");

    cat1.setCategoryName("Deck Builders");
    cat1.setCategoryDescription("Building decks category");
    cat1.setCategoryWinner(sts);
    System.out.println(cat1.toString());

    Category cat2 = new Category("RPGs", "Role-playing games", bg3);
    System.out.println(cat2.toString());
  }
}
