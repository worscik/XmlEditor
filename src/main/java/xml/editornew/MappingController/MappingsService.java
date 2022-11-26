package xml.editornew.MappingController;

import java.util.ArrayList;
import java.util.List;

public interface MappingsService {

    List<String> availableMappings = new ArrayList<>();

    List<String> addAndReturnMappings();

}
