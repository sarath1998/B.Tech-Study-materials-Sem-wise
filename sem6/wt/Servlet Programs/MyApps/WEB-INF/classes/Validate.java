import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class Validate extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws
			ServletException,IOException
{
  PrintWriter out=res.getWriter();
  try  
   {
  res.setContentType("text/html");
  String un=req.getParameter("uname");
  String ps=req.getParameter("pass");
  
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection con=DriverManager.getConnection("Jdbc:Odbc:git","","");
  Statement st=con.createStatement(); 
  ResultSet rs=st.executeQuery("select * from Login");
 
  while(rs.next())
  {
    if((rs.getString(1).equals(un)) && (rs.getString(2).equals(ps)))
     {
      res.sendRedirect("http://localhost:8080/MyApps/Home.html");
      st.close();
      con.close(); 
      } 
   }
   res.sendRedirect("http://localhost:8080/MyApps/Login.html"); 
   st.close();
   con.close();
 }
 catch(Exception e)
  { out.print(e);}
  
}}
 
