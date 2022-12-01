package xml.editornew.MappingController;

import org.springframework.stereotype.Controller;

@Controller
public class MappingController {

    private String mapping;

    public MappingController() {
    }

    public MappingController(String mapping) {
        this.mapping = mapping;
    }

    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }

    public String setMappingToXml(String mapping){
        switch (mapping) {
            case "rrs/channel/item" -> {
                return "rrr/channel/item";
            }
            case "root/item" -> {
                return "root/item";
            }
            default -> {
                return  null;
            }
        }
    }


}
