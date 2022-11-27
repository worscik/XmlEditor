package xml.editornew.XmlCreator;

import xml.editornew.FileFields.XmlFields;
import xml.editornew.MappingController.ChoosenMappings;

public class CreateXml {

    public StringBuilder createNewXml(boolean create, XmlFields field, ChoosenMappings choosenMappings){
       StringBuilder sb = new StringBuilder();
       sb.append("MAPPING " + choosenMappings.getChoosenMapping() + "\n");
       sb.append("TEST XML FILE" + "\n");
       sb.append("ID: " + field.getId() + "\n");
       sb.append("IMG " + field.getImg() + "\n");
       sb.append("URL " + field.getUrl() + "\n");
       sb.append("PRICE " + field.getPrice() + "\n");
       sb.append("PRICE_PROMO " + field.getPromoPrice() + "\n");
       return sb;
   }

}
