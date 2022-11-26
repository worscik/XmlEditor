package xml.editornew.MappingController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MappingsController {

    List<String> mappings = new ArrayList<>();
    AvailableMappings availableMappings = new AvailableMappings(mappings);

    @GetMapping("/getAvailableMappings")
    public List<String> getMappings(){
        return mappings;
    }


}
