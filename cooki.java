import java.io.*;
import javax.servlet.*;
public class cooki extends GenericServelet
{
public void service(ServletRequest req,ServletResponse res)throws IOException,serveletException
{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h1>Welcome to MSBTE</h1>");
	out.println("</body>");
	out.println("</html>");
}
}