<html>
  <head>
    <title>Addition  Quiz</title>
  </head>
  <body>
  <%@ page import = "java.lang.Math" %>
  <form method="get" action="AnswerCheck">
    <% for (int i = 0; i <= 10; i++) { 
      <% int int1 = computeRandomNumber();
        int int2 = computeRandomNumber(); %>
      <% int1 %> + <% int2 %> = 
      <input type="number" id="answer" value="<% int1 + int2 %>">   
    } %>

   <input type="submit" value="submit">
  </form>

  <%! private int computeRandomNumber() {
    return (Math.random() * 100);
  } %>

  <%! private String AnswerCheck() {
    if (answer = value) {
      return "correct";
    else
      return "incorrect";
    }
  } %>

  </body>
</html>