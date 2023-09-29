import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;



public class Session2 extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws
			ServletException,IOException
{

 PrintWriter out=res.getWriter();

  res.setContentType("text/html");
  
  
  HttpSession ses=req.getSession(true);

  out.print("Name of the User :"+ses.getValue("name") +"    Id :"+ses.getId());

 
 
}}
 
