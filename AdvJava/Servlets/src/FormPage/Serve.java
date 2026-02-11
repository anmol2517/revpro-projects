//   http://localhost:8080/Servlets/formurl


package FormPage;


//  ::  Taking user data = request
//  ::  Displaying the user's data = response


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class Serve extends HttpServlet {

    public void service(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        // --- Get form data ---

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");

        // Phone number safe handling

        String numStr = request.getParameter("num");
        String numDisplay = (numStr == null || numStr.isEmpty()) ? "Not Provided" : numStr;
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String gender = request.getParameter("gender");
        String[] skills = request.getParameterValues("skill");
        String[] address = request.getParameterValues("address");

        // --- Display data ---

        PrintWriter pw = response.getWriter();
        pw.println("<html><body style='font-family:Arial; background-color:#f0f8ff; padding:20px;'>");
        pw.println("<h2 style='color:#2e8b57;'>Registration Details</h2>");

        pw.println("<p><b>First Name:</b> " + fname + "</p>");
        pw.println("<p><b>Last Name:</b> " + lname + "</p>");
        pw.println("<p><b>Phone Number:</b> " + numDisplay + "</p>");
        pw.println("<p><b>Email Id:</b> " + email + "</p>");
        pw.println("<p><b>Password:</b> " + pass + "</p>");
        pw.println("<p><b>Gender:</b> " + gender + "</p>");

        pw.println("<p><b>Skills:</b> ");
        if (skills != null && skills.length > 0) {
            pw.println(String.join(", ", skills));
        } else {
            pw.println("No skills selected");
        }
        pw.println("</p>");
        pw.println("<p><b>Present Address:</b> " + address + "</p>");

        pw.println("</body></html>");   // Closing HTML File
    }
}
