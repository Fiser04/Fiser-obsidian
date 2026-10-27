<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
      <head>
          <meta charset="UTF-8"/>
          <title>Katalog - <xsl:value-of select="katalog/info/Firma"/></title>
          <style>
              body { font-family: Arial, sans-serif; margin: 2em; }
              h1 { color: #2c3e50; }
              .info { color: #666; margin-bottom: 1em; }
              table { border-collapse: collapse; width: 100%; }
              th, td { border: 1px solid #ccc; padding: 8px; text-align: left; }
              th { background: #2c3e50; color: #fff; }
              tr:nth-child(even) { background: #f4f4f4; }
              .cena { text-align: right; white-space: nowrap; }
              .skladem { text-align: center; }
          </style>
      </head>
      <body>
          <h1><xsl:value-of select="katalog/info/Firma"/></h1>
          <p class="info">Měna: <xsl:value-of select="katalog/info/mena"/></p>
          <table>
              <thead>
                  <tr>
                      <th>ID</th>
                      <th>Název</th>
                      <th>Kategorie</th>
                      <th>Cena</th>
                      <th>Popis</th>
                      <th>Skladem</th>
                  </tr>
              </thead>
              <tbody>
                  <xsl:apply-templates select="katalog/polozka"/>
              </tbody>
          </table>
      </body>
  </html>
</xsl:template>

<xsl:template match="polozka">
    <tr>
        <td><xsl:value-of select="@id"/></td>
        <th scope="row"><xsl:value-of select="nazev"/></th>
        <td><xsl:value-of select="kategorie"/></td>
        <td class="cena"><xsl:value-of select="cena"/> <xsl:value-of select="/katalog/info/mena"/></td>
        <td><xsl:value-of select="popis/dulezite"/></td>
        <td class="skladem"><xsl:value-of select="mnozstvi"/></td>
    </tr>
</xsl:template>

</xsl:stylesheet>
