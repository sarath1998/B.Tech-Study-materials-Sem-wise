
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class Cook2 extends HttpServlet {
 
  public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
  {
   res.setContentType("text/html");
   PrintWriter pw=res.getWriter(); 

   Cookie[] cks=req.getCookies();

  for(int i=0;i<cks.length;i++)
  {
    String name=cks[i].getName();
    String value=cks[i].getValue();
    pw.println("Name = "+name+" Value= "+value); 
  }
   pw.close();
 }
}