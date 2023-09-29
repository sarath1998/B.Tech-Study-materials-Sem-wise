<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns="http://www.w3.org/1999/xhtml">

<xsl:template match="Student-list">
 <h1> Students Information : </h1><br/>

<xsl:for-each select="Student">
 <h3> Student Info : </h3> 
 <h3> Name : </h3>  <xsl:value-of select="name"/>
 <h3> Branch : </h3> <xsl:value-of select="branch"/>
 <h3> Age : </h3>   <xsl:value-of select="age"/>
 <h3> College Name : </h3>  <xsl:value-of select="college"/>
<br/>
</xsl:for-each>

</xsl:template>
</xsl:stylesheet>