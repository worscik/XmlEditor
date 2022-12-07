package xml.editornew.XmlCreator;

public class FieldsToBeMatch {

    private String matchFields;

    public FieldsToBeMatch() {
    }

    public String getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(String matchFields) {
        this.matchFields = matchFields;
    }

    public String fieldsToCut(String mapping){
        switch (mapping){
            case  "rrr/channel/item" -> {
                return matchFields = "rrs/channel/item";
            }
            case "root/item" -> {
                return matchFields = "root/item";
            }
        }
        return "Cannot find fileds to match";
    }

}
