package xml.editornew.XmlCreator;

import xml.editornew.FileFields.XmlFields;
import xml.editornew.MappingController.ChoosenMappings;

public class XmlFile {

    private XmlFields xmlFields;
    private ChoosenMappings choosenMappings;
    boolean createFile = true;

    public XmlFile(XmlFields xmlFields, ChoosenMappings choosenMappings) {
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

    public StringBuilder create(XmlFields xmlFields){
        CreateXml createXml = new CreateXml();
        return createXml.createNewXml(createFile,xmlFields,choosenMappings);
    }
}
