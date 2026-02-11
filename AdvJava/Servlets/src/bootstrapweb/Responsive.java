package bootstrapweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Responsive extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        String em = req.getParameter("inputEmail");
        String ps = req.getParameter("inputPassword");
        String fn = req.getParameter("inputName");
        String ad = req.getParameter("inputAddress");
        String ci = req.getParameter("inputCity");
        String st = req.getParameter("inputState");
        String zp = req.getParameter("inputZip");

        pw.println("<html><body>");

        pw.println("<p>Email : " + em + "</p>");
        pw.println("<p>Password : " + ps + "</p>");
        pw.println("<p>Name : " + fn + "</p>");
        pw.println("<p>Address : " + ad + "</p>");
        pw.println("<p>City : " + ci + "</p>");
        pw.println("<p>State : " + st + "</p>");
        pw.println("<p>Zip : " + zp + "</p>");

        pw.println("</body></html>");
    }
}
