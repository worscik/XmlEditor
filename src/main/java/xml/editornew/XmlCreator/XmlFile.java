package xml.editornew.XmlCreator;

import xml.editornew.FileFields.XmlFields;

import java.util.logging.Logger;

public class XmlFile {

    private XmlFields xmlFields;
    private String mapping;
    boolean createFile = false;
    private FieldsToBeCut fieldsToBeCut = new FieldsToBeCut();
    private FieldsToBeMatch fieldsToBeMatch = new FieldsToBeMatch();

    public XmlFile(XmlFields xmlFields, String mapping) {
        this.xmlFields = xmlFields;
        this.mapping = mapping;
    }

    public XmlFields getXmlFields() {
        return xmlFields;
    }

    public void setXmlFields(XmlFields xmlFields) {
        this.xmlFields = xmlFields;
    }

    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }

    public String create(XmlFields xmlFields){
        CreateXml createXml = new CreateXml();
        if(mapping == null) {
            return "Cannot create xml. Selected mapping is not available.";
        }

        try{
            fieldsToBeCut.setCutPath(xmlFields.getMappingController().getMapping());
            fieldsToBeMatch.setMatchPath(xmlFields.getMappingController().getMapping());
        } catch (NullPointerException e){
            return "Cannot set match or cut path";
        }

        createFile = true;
        return createXml.createNewXml(createFile,xmlFields,fieldsToBeCut,fieldsToBeMatch);
    }
}
