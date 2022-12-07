package xml.editornew.XmlCreator;

import xml.editornew.FileFields.XmlFields;



public class CreateXml extends LineBuilder {
      StringBuilder sb = new StringBuilder();

    public String createNewXml(boolean create, XmlFields field,FieldsToBeCut fieldsToBeCut, FieldsToBeMatch fieldsToBeMatch){
      sb.append(HEADERS);

      sb.append(NEWLINE);

      sb.append("<xsl:template match=\"" + fieldsToBeCut.getCuteFields() + "\" />" + NEWLINE); // WYCINANIE
      sb.append("<xsl:template match=\"" + fieldsToBeMatch.getMatchFields() + "\">" + NEWLINE); // MATCH

      sb.append(NEWLINE);

      sb.append("<!-- ustawienie zmiennych -->" + NEWLINE);

      sb.append("<!--EXTERNAL_ID-->" + NEWLINE);
      sb.append("<xsl:choose>" + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getId() + ")\">" + " " + " " + NEWLINE); // ID
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getId() + ")\"/>" + NEWLINE); // ID
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--NAME-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getName() + ")\">" + NEWLINE); // NAME
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getName() + "),0,100)\"/>" + NEWLINE); // NAME
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--NEW_PRODUCT-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\""+field.getNewProductKey()+"='" + field.getNewProductValue() +"'"+ "\">" + NEWLINE);
      sb.append(NUMERICPATH + NEWLINE) ;

      sb.append("<!--AVAILABLE-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\""+field.getAvailableKey()+"='" + field.getAvailableValue() +"'"+ "\">" + NEWLINE);
      sb.append(NUMERICPATH + NEWLINE) ;

      sb.append("<!--BESTSELLER-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\""+field.getBestsellerKey()+"='" + field.getBestsellerValue() +"'"+ "\">" + NEWLINE);
      sb.append(NUMERICPATH + NEWLINE) ;

      sb.append("<!--BRAND-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getBrand() + ")\">" + NEWLINE); // BRAND
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getBrand() + "),0,512)\"/>" + NEWLINE); // BRAND
      sb.append(STRINGPATH + NEWLINE);

      sb.append(" <!--CATEGORIES-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getCategories() + ")\">" + NEWLINE); // CATEGORIES
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getCategories() + "),0,512)\"/>" + NEWLINE); // CATEGORIES
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--CATEGORY_MAIN-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getCategoryMain() + ")\">" + NEWLINE); // CATEGORY MAIN
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getCategoryMain() + "),0,200)\"/>" + NEWLINE); // CATEGORY MAIN
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--DESCRIPTION-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getDescription() + ")\">" + NEWLINE); // DESCRIPTION
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getDescription() + "),0,1024)\"/>" + NEWLINE); // DESCRIPTION
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--DETAIL_1-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getDetail1() + ")\">" + NEWLINE); // DETAIL1
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getDetail1() + "),0,512)\"/>" + NEWLINE); // DETAIL1
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--DETAIL_2-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getDetail2() + ")\">" + NEWLINE); // DETAIL2
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getDetail2() + "),0,512)\"/>" + NEWLINE); // DETAIL2
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--DETAIL_3-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getDetail3() + ")\">" + NEWLINE); // DETAIL3
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getDetail3() + "),0,512)\"/>" + NEWLINE); // DETAIL3
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--DETAIL_4-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getDetail4() + ")\">" + NEWLINE); // DETAIL4
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getDetail4() + "),0,512)\"/>" + NEWLINE); // DETAIL4
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--DETAIL_5-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getDetail5() + ")\">" + NEWLINE); // DETAIL5
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getDetail5() + "),0,512)\"/>" + NEWLINE); // DETAIL5
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--MANUFACTURER-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getManufacturer() + ")\">" + NEWLINE); // MANUFACTURER
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getManufacturer() + "),0,100)\"/>" + NEWLINE); // MANUFACTURER
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--PRICE-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length("+field.getPrice()+")\">" + NEWLINE);
      sb.append("<xsl:value-ofselect=\"normalize-space(translate(" + field.getPrice() + ",'" + field.getCurrency()+"', ''))\"/>" + NEWLINE);
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--PRICE_PROMO-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length("+field.getPricePromo()+")\">" + NEWLINE);
      sb.append("<xsl:value-ofselect=\"normalize-space(translate(" + field.getPricePromo() + ",'" + field.getCurrency()+"', ''))\"/>" + NEWLINE);
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--QUANTITY-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getQuantity() + ")\">" + NEWLINE); // QUANTITY
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getQuantity() + ")\"/>" + NEWLINE); // QUANTITY
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--URL_PRODUCT-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getUrlProduct() + ")\">" + NEWLINE); // QUANTITY
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getUrlProduct() + "),0,512)\"/>" + NEWLINE); // QUANTITY
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--URL_IMG-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getUrlProduct() + ")\">" + NEWLINE); // URL_IMG
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getUrlProduct() + "),0,512)\"/>" + NEWLINE); // URL_IMG
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--GENDER-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\""+field.getGenderKey()+"='" + field.getGenderValue() +"'"+ "\">" + NEWLINE);
      sb.append(NUMERICPATH + NEWLINE) ;

      sb.append("<!--URL_CATEGORY-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getUrlCategory() + ")\">" + NEWLINE); // URL_CATEGORY
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getUrlCategory() + ")\"/>" + NEWLINE); // URL_CATEGORY
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--URL_CATEGORY_MARK-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getUrlCategoryMark() + ")\">" + NEWLINE); // URL_CATEGORY_MARK
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getUrlCategoryMark() + "),0,512)\"/>" + NEWLINE); // URL_CATEGORY_MARK
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--POPULARITY-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getPopularity() + ")\">" + NEWLINE); // POPULARITY
      sb.append("<xsl:value-of select=\"normalize-space(" + field.getPopularity() + ")\"/>" + NEWLINE); // POPULARITY
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--SEASON-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getSeason() + ")\">" + NEWLINE); // SEASON
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getSeason() + "),0,40)\"/>" + NEWLINE); // SEASON
      sb.append(STRINGPATH + NEWLINE);

      sb.append("<!--COLOR-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getColor() + ")\">" + NEWLINE); // COLOR
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getColor() + "),0,40)\"/>" + NEWLINE); // COLOR
      sb.append(STRINGPATH + NEWLINE);
      
      sb.append("<!--ADDITIONAL_IMAGE-->" + NEWLINE);
      sb.append(CHOOSE + NEWLINE);
      sb.append("<xsl:when test=\"string-length(" + field.getName() + ")\">" + NEWLINE); // ADDITIONAL_IMAGE
      sb.append("<xsl:value-of select=\"substring(normalize-space(" + field.getName() + "),0,128)\"/>" + NEWLINE); // ADDITIONAL_IMAGE
      sb.append(STRINGPATH + NEWLINE);
      
      sb.append(LASTLINE);
      
      System.out.println("Xml file successfully created");
      return sb.toString();
   }

}
