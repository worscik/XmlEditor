package xml.editornew.XmlCreator;

import xml.editornew.FileFields.XmlFields;

public class CreateXmlFile {

    private XmlFields xmlFields;

    public CreateXmlFile(XmlFields xmlFields) {
        this.xmlFields = xmlFields;
    }

    public XmlFields getXmlFields() {
        return xmlFields;
    }

    public void setXmlFields(XmlFields xmlFields) {
        this.xmlFields = xmlFields;
    }

    public StringBuilder create(){
        StringBuilder sb = new StringBuilder();
        sb.append("TEST XML FILE" + "\n");
        sb.append("ID: " + xmlFields.getId() + "\n");
        sb.append("IMG " + xmlFields.getImg() + "\n");
        sb.append("URL " + xmlFields.getUrl() + "\n");
        sb.append("PRICE " + xmlFields.getPrice() + "\n");
        sb.append("PRICE_PROMO " + xmlFields.getPromoPrice() + "\n");
        return sb;
    }

}
