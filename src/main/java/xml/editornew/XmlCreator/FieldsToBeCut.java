package xml.editornew.XmlCreator;

public class FieldsToBeCut {

    private String cuteFields;

    public FieldsToBeCut() {
    }

    public String getCuteFields() {
        return cuteFields;
    }

    public void setCuteFields(String cuteFields) {
        this.cuteFields = cuteFields;
    }

    public String fieldsToCut(String fieldToBeCute){
        return "fields";
    }

}
