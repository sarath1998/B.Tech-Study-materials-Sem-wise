
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Cook extends HttpServlet {
 
  public void service(HttpServletRequest req,
		HttpServletResponse res)
	 throws ServletException,IOException
  {
   res.setContentType("text/html");
   PrintWriter pw=res.getWriter(); 
   String ck=req.getParameter("c");

   Cookie cke1=new Cookie("Myck1",ck);
   res.addCookie(cke1);

  Cookie cke2=new Cookie("Myck2","abc");
   res.addCookie(cke2);


   pw.write("<font color=red>");
   pw.write("<center><h1> My Cookie has been Set to : </h1><br><br>");
   pw.write(ck+"</font>");
   pw.close();
  }}