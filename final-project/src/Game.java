import java.util.ArrayList;

public class Game extends Category {
  private String name;
  private String developer;
  private String releaseDate;
  private int rating;
  private String description;
  private ArrayList<Comment> comments = new ArrayList<Comment>();

  public Game() {}

  public Game(String name, String developer, String releaseDate, 
              int rating, String description) {
    this.name = name;
    this.developer = developer;
    this.releaseDate = releaseDate;
    this.rating = rating;
    this.description = description;
  }

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

  public void addComment(Comment comment) {
    comments.add(comment);
  }

  @Override
  public String toString() {
    return "Game: " + name + "\nDeveloper: " + developer 
      + "\nRelease date: " + releaseDate + "\nRating: " + rating
      + "\nDescription: " + description + "\nComments: " 
      + comments.toString();
  }
}
