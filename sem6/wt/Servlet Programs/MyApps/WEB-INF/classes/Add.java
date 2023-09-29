import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Add extends HttpServlet
{
 int a,b; 

 public void init()
 {
  a=10;
  b=10;
 }
  
 
public void doGET(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
 PrintWriter p=res.getWriter();
 int c=a+b;

 p.write("<h1 style='color:blue'>");
 p.write("Sum of"+a+" and "+b+" is "+c+"</h1>");
}
}