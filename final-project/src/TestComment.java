public class TestComment {
  public static void main(String[] args) {
    Comment comment1 = new Comment();
    comment1.setUser("ice9");
    comment1.setComment("This is the first comment.");

    Comment comment2 = new Comment("ice9", 
      "This is the second comment.");

    System.out.println(comment1.toString());
    System.out.println(comment2.toString());

  }
  
}
