//   http://localhost:8080/Servlets/calciurl


package CalciSum;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Calculation extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        try {
            String a = req.getParameter("firstnumber");
            String b = req.getParameter("secondnumber");
            String cal = req.getParameter("calci"); // HTML button ka name 'calci' hona chahiye

            if (a == null || b == null || a.isEmpty() || b.isEmpty()) {
                pw.println("<h3>Please enter numbers in the form first!</h3>");
                return;
            }

            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            int result = 0;
            String operation = "";

            if ("Addition".equalsIgnoreCase(cal)) {
                result = num1 + num2;
                operation = "Addition";
            } else if ("Subtraction".equalsIgnoreCase(cal)) {
                result = num1 - num2;
                operation = "Subtraction";
            } else if ("Multiplication".equalsIgnoreCase(cal)) {
                result = num1 * num2;
                operation = "Multiplication";
            } else if ("Division".equalsIgnoreCase(cal)) {
                result = num1 / num2;
                operation = "Division";
            }

            pw.println("<h3>Operation: " + operation + "</h3>");
            pw.println("Number1 is : " + num1 + "<br>");
            pw.println("Number2 is : " + num2 + "<br>");
            pw.println("<b>Result is : " + result + "</b>");

        } catch (NumberFormatException e) {
            pw.println("Invalid input! Please enter digits only.");
        } catch (ArithmeticException e) {
            pw.println("Error: Cannot divide by zero!");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        doPost(req, res);
    }
}

