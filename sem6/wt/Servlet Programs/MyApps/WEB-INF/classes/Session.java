import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;



public class Session extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws
			ServletException,IOException
{


  res.setContentType("text/html");
  
  String un=req.getParameter("uname");
  

  HttpSession ses=req.getSession();

  ses.putValue("name",un);

  
 
  res.sendRedirect("http://localhost:8080/MyApps/ses2"); 
  
 
}}
 
