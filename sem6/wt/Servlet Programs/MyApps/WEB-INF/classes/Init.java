// Import required java libraries
import java.io.*;
import javax.servlet.*;


// Extend GenericServlet class
public class Init extends GenericServlet {
 
   int a;
   public void init(ServletConfig sc)throws ServletException
   {
    a=Integer.parseInt(sc.getInitParameter("x"));
   } 
  

  public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
  {
   res.setContentType("text/html");
   PrintWriter pw=res.getWriter(); 

   
   
   pw.write("<font color=red>");
   pw.write("<center><h1> U have passed : </h1><br><br>");
   pw.write("<h2>"+a+"</h2></font>");
   pw.close();
  }
}