package xml.editornew.XmlCreator;

import xml.editornew.FileFields.XmlFields;
import xml.editornew.MappingController.ChoosenMappings;

public class CreateXmlFile {

    private XmlFields xmlFields;
    private ChoosenMappings choosenMappings;
    boolean createFile = true;

    public CreateXmlFile(XmlFields xmlFields, ChoosenMappings choosenMappings) {
        this.xmlFields = xmlFields;
        if(choosenMappings.getChoosenMapping() == null){
            System.out.println("Błąd w wybieraniu mapowania");
            createFile = false;
        }
        this.choosenMappings = choosenMappings;
    }

    public XmlFields getXmlFields() {
        return xmlFields;
    }

    public void setXmlFields(XmlFields xmlFields) {
        this.xmlFields = xmlFields;
    }

    public ChoosenMappings getChoosenMappings() {
        return choosenMappings;
    }

    public void setChoosenMappings(ChoosenMappings choosenMappings) {
        this.choosenMappings = choosenMappings;
    }

    public StringBuilder create(){
        StringBuilder sb = new StringBuilder();
        if(createFile) {
            sb.append("MAPPING " + choosenMappings.getChoosenMapping() + "\n");
            sb.append("TEST XML FILE" + "\n");
            sb.append("ID: " + xmlFields.getId() + "\n");
            sb.append("IMG " + xmlFields.getImg() + "\n");
            sb.append("URL " + xmlFields.getUrl() + "\n");
            sb.append("PRICE " + xmlFields.getPrice() + "\n");
            sb.append("PRICE_PROMO " + xmlFields.getPromoPrice() + "\n");
            return sb;
        }
        return sb.append("Something gonna bad");
    }

}
