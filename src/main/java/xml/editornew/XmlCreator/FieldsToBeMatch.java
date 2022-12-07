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

    public String setMatchPath(String mapping){
        switch (mapping){
            case  "rrs/channel/item" -> {
                return matchFields = "rss/channel/item";
            }
            case "root/item" -> {
                return matchFields = "root/item";
            }
        }
        return "Cannot find fileds to match";
    }

}
