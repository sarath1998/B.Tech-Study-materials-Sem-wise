import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Life extends HttpServlet
{
  String msg="";

 public void init()
 {
  msg+="In init() method ";
 }
  
 
public void service(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException
{
 msg+="In service() method "; 

 res.setContentType("text/html");  
 PrintWriter p=res.getWriter();

  p.write("<h1 style='color:red'>"+msg+"</h1>");

 }
}