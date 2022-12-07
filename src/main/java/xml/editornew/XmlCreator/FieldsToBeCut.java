package xml.editornew.XmlCreator;

public class FieldsToBeCut {

    private String cuteFields;

    private String additionalFieldToCut;

    public FieldsToBeCut() {
    }

    public String getCuteFields() {
        return cuteFields;
    }

    public void setCuteFields(String cuteFields) {
        this.cuteFields = cuteFields;
    }

    public String getAdditionalFieldToCut() {
        return additionalFieldToCut;
    }

    public void setAdditionalFieldToCut(String additionalFieldToCut) {
        this.additionalFieldToCut = additionalFieldToCut;
    }

    public String fieldsToCut(String mapping){
        switch (mapping){
            case  "rrr/channel/item" -> {
                return cuteFields = "rrs/channel/TODO";
            }
            case "root/item" -> {
                return cuteFields = "root/item";
            }
        }
            return "Cannot find fileds to cute";
    }

}
