<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns="http://www.w3.org/1999/xhtml">

<xsl:template match="Student-list">
 <h1> Students Information : </h1><br/>

 <table border="5">
 <tr>
 <th> Name </th><th> Branch </th><th> Age </th> <th> College Name </th>
 </tr>
  
 <xsl:for-each select="Student">

 
 <tr style="color:red">

 <td > <xsl:value-of select="name"/></td>
<td>  <xsl:value-of select="branch"/></td>
<td>  <xsl:value-of select="age"/></td>
<td>  <xsl:value-of select="college"/></td>

</tr>
</xsl:for-each>
</table>
</xsl:template>
</xsl:stylesheet>