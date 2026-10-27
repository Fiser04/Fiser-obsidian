<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <xsl:variable name="vybrane" select="katalog/polozka[mnozstvi &gt; 0 and cena &lt; 29999]"/>
  <html>
      <head>
          <meta charset="UTF-8"/>
          <title>Katalog</title>
      </head>
      <body>
          <h1><xsl:value-of select="katalog/info/Firma"/></h1>
          <table border="1">
              <thead>
                  <tr>
                      <th>Název</th>
                      <th>Kategorie</th>
                      <th>Cena</th>
                      <th>Popis</th>
                  </tr>
              </thead>
              <tbody>
                  <xsl:for-each select="$vybrane">
                      <tr>
                          <td><xsl:value-of select="nazev"/></td>
                          <td><xsl:value-of select="kategorie"/></td>
                          <td><xsl:value-of select="cena"/> <xsl:value-of select="/katalog/info/mena"/></td>
                          <td><xsl:value-of select="popis/dulezite"/></td>
                      </tr>
                      </xsl:for-each>
              </tbody>
          </table>
      </body>
  </html>
</xsl:template>

</xsl:stylesheet>
