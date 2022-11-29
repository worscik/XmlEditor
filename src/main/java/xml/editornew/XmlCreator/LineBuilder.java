package xml.editornew.XmlCreator;

public class LineBuilder {

    public final static String RRSCHANNELDELETE = "<xsl:template match=\"rss/channel/title | rss/channel/link | rss/channel/description\"/>";
    public final static String RRSCHANNELMATCH = "<xsl:template match=\"rss/channel/item\">";
    public final static String newLine = "\n";
    public final static String choose= "<xsl:choose>";
    public final static String sameLineForFiled = "</xsl:when>\n" +
            "<xsl:otherwise>\n" +
            "<xsl:text>\\N</xsl:text>\n" +
            "</xsl:otherwise>\n" +
            "</xsl:choose>\n" +
            "<xsl:value-of select=\"$sep\"/>";

    public static final String ZeroOrOne = "<xsl:value-of select=\"1\"/>\n" +
                                            "</xsl:when>\n" +
                                            "<xsl:otherwise>\n" +
                                            "<xsl:value-of select=\"0\"/>\n" +
                                            "</xsl:otherwise>\n" +
                                            "</xsl:choose>\n" +
                                            "<xsl:value-of select=\"$sep\"/>";

}
