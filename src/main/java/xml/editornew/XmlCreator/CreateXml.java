package xml.editornew.XmlCreator;

import xml.editornew.FileFields.XmlFields;
import xml.editornew.MappingController.ChoosenMappings;
import static xml.editornew.XmlCreator.LineBuilder.*;

public class CreateXml {
      StringBuilder sb = new StringBuilder();
      LineBuilder linebuilder = new LineBuilder();


    public StringBuilder createNewXml(boolean create, XmlFields field, ChoosenMappings choosenMappings){
      sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + newLine);
      sb.append("<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\" version=\"1.0\"" + newLine);
      sb.append("xmlns:g=\"http://base.google.com/ns/1.0\">" + newLine);
      sb.append("<xsl:output method=\"text\"/>" + newLine);
      sb.append("<xsl:strip-space elements=\"node\"/>" + newLine);
      sb.append("<xsl:strip-space elements=\"*\" />" + newLine);
      sb.append("<xsl:variable name=\"newline\"><xsl:text>&#x0a;</xsl:text></xsl:variable>" + newLine);
      sb.append("<xsl:variable name=\"sep\"><xsl:text>&#x7f;</xsl:text></xsl:variable>" + newLine);

      //DO ZROBIENIA OSOBNA KLASE Z TYMI POLAMI
      sb.append(RRSCHANNELDELETE + newLine); // WYCINANIE POL
      sb.append(RRSCHANNELMATCH  + newLine); // MATCH

      sb.append("<!-- ustawienie zmiennych -->" + newLine);

      sb.append("<!--EXTERNAL_ID-->" + newLine);
      sb.append("<xsl:choose>" + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getId() + ")\">" + " " + " " + newLine); // ID
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getId() + ")\"/>" + newLine); // ID
      sb.append(sameLineForFiled + newLine); // Te same linie kodu

      sb.append("<!--NAME-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getName() + ")\">" + newLine); // NAME
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getName() + ")\"/>" + newLine); // NAME
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--NEW_PRODUCT-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:whentest=\""+field.getNewProductKey()+"='" + field.getNewProductValue() +"'"+ "\">" + newLine);
      sb.append(ZeroOrOne + newLine) ;

      sb.append("<!--AVAILABLE-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:whentest=\""+field.getNewProductKey()+"='" + field.getNewProductValue() +"'"+ "\">" + newLine);
      sb.append(ZeroOrOne + newLine) ;

      sb.append("<!--BESTSELLER-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:whentest=\""+field.getBestsellerValue()+"='" + field.getBestsellerKey() +"'"+ "\">" + newLine);
      sb.append(ZeroOrOne + newLine) ;

      sb.append("<!--BRAND-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getBrand() + ")\">" + newLine); // BRAND
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getBrand() + ")\"/>" + newLine); // BRAND
      sb.append(sameLineForFiled + newLine);

      sb.append(" <!--CATEGORIES-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getCategories() + ")\">" + newLine); // CATEGORIES
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getCategories() + ")\"/>" + newLine); // CATEGORIES
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--CATEGORY_MAIN-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getCategoryMain() + ")\">" + newLine); // CATEGORY MAIN
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getCategoryMain() + ")\"/>" + newLine); // CATEGORY MAIN
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--DESCRIPTION-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getDescription() + ")\">" + newLine); // DESCRIPTION
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getDescription() + ")\"/>" + newLine); // DESCRIPTION
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--DETAIL_1-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getDetail1() + ")\">" + newLine); // DETAIL1
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getDetail1() + ")\"/>" + newLine); // DETAIL1
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--DETAIL_2-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getDetail2() + ")\">" + newLine); // DETAIL2
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getDetail2() + ")\"/>" + newLine); // DETAIL2
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--DETAIL_3-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getDetail3() + ")\">" + newLine); // DETAIL3
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getDetail3() + ")\"/>" + newLine); // DETAIL3
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--DETAIL_4-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getDetail4() + ")\">" + newLine); // DETAIL4
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getDetail4() + ")\"/>" + newLine); // DETAIL4
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--DETAIL_5-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getDetail5() + ")\">" + newLine); // DETAIL5
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getDetail5() + ")\"/>" + newLine); // DETAIL5
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--MANUFACTURER-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getManufacturer() + ")\">" + newLine); // MANUFACTURER
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getManufacturer() + ")\"/>" + newLine); // MANUFACTURER
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--PRICE-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:whentest=\"string-length("+field.getPrice()+")\">" + newLine);
      sb.append("<xsl:value-ofselect=\"normalize-space(translate(" + field.getPrice() + ",'" + field.getCurrency()+"',''))\"/>" + newLine);
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--PRICE_PROMO-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:whentest=\"string-length("+field.getPricePromo()+")\">" + newLine);
      sb.append("<xsl:value-ofselect=\"normalize-space(translate(" + field.getPricePromo() + ",'" + field.getCurrency()+"',''))\"/>" + newLine);
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--QUANTITY-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getQuantity() + ")\">" + newLine); // QUANTITY
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getQuantity() + ")\"/>" + newLine); // QUANTITY
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--URL_PRODUCT-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getUrlProduct() + ")\">" + newLine); // QUANTITY
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getUrlProduct() + ")\"/>" + newLine); // QUANTITY
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--URL_IMG-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getUrlProduct() + ")\">" + newLine); // URL_IMG
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getUrlProduct() + ")\"/>" + newLine); // URL_IMG
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--GENDER-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:whentest=\""+field.getGenderKey()+"='" + field.getGenderValue() +"'"+ "\">" + newLine);
      sb.append(ZeroOrOne + newLine) ;

      sb.append("<!--URL_CATEGORY-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getUrlCategory() + ")\">" + newLine); // URL_CATEGORY
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getUrlCategory() + ")\"/>" + newLine); // URL_CATEGORY
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--URL_CATEGORY_MARK-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getUrlCategoryMark() + ")\">" + newLine); // URL_CATEGORY_MARK
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getUrlCategoryMark() + ")\"/>" + newLine); // URL_CATEGORY_MARK
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--POPULARITY-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getPopularity() + ")\">" + newLine); // POPULARITY
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getPopularity() + ")\"/>" + newLine); // POPULARITY
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--SEASON-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getSeason() + ")\">" + newLine); // SEASON
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getSeason() + ")\"/>" + newLine); // SEASON
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--COLOR-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getColor() + ")\">" + newLine); // COLOR
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getColor() + ")\"/>" + newLine); // COLOR
      sb.append(sameLineForFiled + newLine);

      sb.append("<!--ADDITIONAL_IMAGE-->" + newLine);
      sb.append(choose + newLine);
      sb.append("<xsl:when test=\"string-length(" + field.getName() + ")\">" + newLine); // ADDITIONAL_IMAGE
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getName() + ")\"/>" + newLine); // ADDITIONAL_IMAGE
      sb.append(sameLineForFiled + newLine);

      // CZY TO POTRZEBNE ?
//      sb.append("<!--INT_DETAIL1-->" + newLine);
//      // ??????
//
//      sb.append("<!--INT_DETAIL2-->" + newLine);
//      // ??????
//
//      sb.append("<!--DEC_DETAIL1-->" + newLine);
//      // ??????
//
//      sb.append("<!--array-->" + newLine);
      // ??????

      sb.append("<!-- koniec -->" + newLine);
      sb.append("<xsl:value-of select=\"$newline\"/>" + newLine);
      sb.append("</xsl:template>" + newLine);
      sb.append("</xsl:stylesheet>" + newLine);
      return sb;
   }

}
