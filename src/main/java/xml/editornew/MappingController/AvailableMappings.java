package xml.editornew.MappingController;

import java.util.ArrayList;
import java.util.List;

public class AvailableMappings implements MappingsService{

    private List<String> availableMappings;

    public AvailableMappings(List<String> availableMappings) {
        this.availableMappings = availableMappings;
        addAndReturnMappings();
    }

    public List<String> getAvailableMappings() {
        return availableMappings;
    }

    public void setAvailableMappings(List<String> availableMappings) {
        this.availableMappings = availableMappings;
    }

    @Override
    public List<String> addAndReturnMappings() {
        availableMappings.add("rrs/channel/item");
        availableMappings.add("root/item");
        availableMappings.add("products/product");
        return availableMappings;
    }

}
