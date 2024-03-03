import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class GetParameters extends HttpServlet {
  public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException,
    IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();

      String firstName = request.getParameter("firstName");

      out.println("First name: " + firstName);
      out.close();
    }
}