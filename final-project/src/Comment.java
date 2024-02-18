public class Comment extends Game {
  private String user;
  private String comment;

  public Comment() {}

  public Comment(String user, String comment) {
    this.user = user;
    this.comment = comment;
  }

  public String getUser() {
    return user;
  }

  public String getComment() {
    return comment;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public String toString()  {
    return user + ": " + comment;
  }
}
