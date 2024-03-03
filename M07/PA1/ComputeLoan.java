import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ComputeLoan extends HttpServlet {
  public void init() throws ServletException {
    System.out.println("Constructor called");
  }

  public void doGet (HttpServletRequest request, 
    HttpServletResponse response) throws ServletException,
    IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      double loanAmount = Double.parseDouble(
        request.getParameter("loanAmount"));
      double interestRate = Double.parseDouble(
          request.getParameter("interestRate"));
      int numYears = Integer.parseInt(
        request.getParameter("numYears"));
      
      Loan loan = new Loan(interestRate, numYears, loanAmount);

      double monthlyPayment = loan.getMonthlyPayment();
      double totalPayment = loan.getTotalPayment();
      
      out.println("<html>");
      out.println("<head><title>Loan Information</title></head>");
      out.println("<body>");
      out.println("<p>Loan Amount: " + loanAmount + "</p>");
      out.println("<p>Annual Interest Rate: " + interestRate + "</p>");
      out.println("<p>Number of Years: " + numYears + "</p>");
      out.println("<p>Monthly Payment: " + monthlyPayment + "</p>");
      out.println("<p>Total Payment: " + totalPayment + "</p>");
      out.println("</body>");
      out.println("</html>");

    }

    public void destroy() {
      System.out.println("Destroy called");
    }
}
