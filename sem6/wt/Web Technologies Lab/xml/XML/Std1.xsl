<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns="http://www.w3.org/1999/xhtml">

<xsl:template match="Student-list">
<html><body> <h1> Students Information : </h1><br/></body></html>
<xsl:apply-templates/>
</xsl:template>

<xsl:template match="Student">
 <h3> Student Info : </h3>
<xsl:apply-templates/>
<hr/>
</xsl:template>

<xsl:template match="name">
 <h3> Student Name :  
 <xsl:value-of select="."/> </h3>
</xsl:template>

<xsl:template match="branch">
 <h3> Branch : </h3>
 <xsl:value-of select="."/>
</xsl:template>

<xsl:template match="age">
 <h3> Age : </h3>
 <xsl:value-of select="."/>
</xsl:template>

<xsl:template match="college">
 <h3> College Name : </h3>
 <xsl:value-of select="."/>
</xsl:template>

</xsl:stylesheet>