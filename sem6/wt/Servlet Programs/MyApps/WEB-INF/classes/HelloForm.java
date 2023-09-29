// Import required java libraries
import java.io.*;
import javax.servlet.*;
import java.util.*;

// Extend GenericServlet class
public class HelloForm extends GenericServlet {
 
  public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
  {
   res.setContentType("text/html");
   PrintWriter pw=res.getWriter(); 

   String un=req.getParameter("uname");
   String pwd=req.getParameter("pass");
   
   pw.write("<font color=red>");
   pw.write("<center><h1> User Information : </h1><br><br>");
   pw.write("<h2>Hello : "+un+" <br> U r Password is: "+pwd+"</h2></font>");
   pw.close();
  }
}