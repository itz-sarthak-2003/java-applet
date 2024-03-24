import java.servlet.*; 
import java.servlet.http.*; 
import java.io.IOException; 
import java.io.PrintWriter; 
public class Servletma extends HttpServlet { 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{ 
       response.setContentType("text/html;charset=UTF-8"); 
       try (PrintWriter out = response.getWriter()) { 
            out.println("<!DOCTYPE html>"); 
            out.println("<html>"); 
            out.println("<head>"); 
            out.println("<title>Servlet Servlet1</title>"); 
            out.println("</head>"); 
            out.println("<body>"); 
            String name = request.getParameter("name"); 
            out.println("<h1> Hello, welcome to " + name + " </h1>"); 
            out.println("<h1><a href =\"servlet2\">Go to Servlet2</a></h1>"); 
            Cookie c = new Cookie("user_name", name); 
           response.addCookie(c); 
            out.println("</body>"); 
            out.println("</html>");
        }

    }
}
