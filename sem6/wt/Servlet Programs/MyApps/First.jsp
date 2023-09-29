<html>
<head>
<title> My First JSP Page </title>
</head>

<body>
<h1> Welcome All ... </h1><br/>
<h1> Today's Date :</h1>
<%
  java.util.Date d=new java.util.Date();
  out.print(d.toString());
%>
</body>
</html>