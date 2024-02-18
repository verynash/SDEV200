public class Category {
  private String categoryName;
  private String categoryDescription;
  private Game categoryWinner;

  public Category() {}

  public Category(String name) {
    this.categoryName = name;
  }

  public Category(String name, String description, Game winner) {
    this.categoryName = name;
    this.categoryDescription = description;
    this.categoryWinner = winner;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public String getCategoryDescription() {
    return categoryDescription;
  }

  public Game getWinner() {
    return categoryWinner;
  }

  public void setCategoryName(String name) {
    this.categoryName = name;
  }

  public void setCategoryDescription(String description) {
    this.categoryDescription = description;
  }

  public void setCategoryWinner(Game game) {
    this.categoryWinner = game;
  }

  @Override
  public String toString() {
    return "Category: " + categoryName + "\nDescription: " 
      + categoryDescription + "\nWinner: " + categoryWinner.getGameName();
  }
}
