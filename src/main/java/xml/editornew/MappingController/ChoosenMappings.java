package xml.editornew.MappingController;

import org.springframework.lang.NonNull;

public class ChoosenMappings {

    private String selectedMapping;

    public ChoosenMappings(String choosenMapping) {
        if(choosenMapping == null){
            System.out.println("null object ");
        }
        this.selectedMapping = choosenMapping;
    }

    public String getChoosenMapping() {
        return selectedMapping;
    }

    public void setChoosenMapping(String choosenMapping) {
        this.selectedMapping = choosenMapping;
    }

    public String selectMapping(@NonNull String mapping){
        mapping.toLowerCase();
        if(mapping == null) {
            return "BRAK MAPOWANIA";
        }
        switch (mapping){
            case "rrs/channel/item" -> {
                return selectedMapping = "rrs/channel/item";
            }
            case "root/item" -> {
                return selectedMapping = "root/item";
            }
            default -> {
                selectedMapping = null;
                return "Mapping not available";
            }
        }
    }

}
