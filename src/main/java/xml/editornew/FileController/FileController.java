package xml.editornew.FileController;

import xml.editornew.FileFields.XmlFields;
import xml.editornew.MappingController.ChoosenMappings;
import xml.editornew.XmlCreator.CreateXmlFile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @PostMapping("/createXml")
    public String createXml(@RequestBody XmlFields xmlFields,
                            @RequestBody ChoosenMappings mapping){
            ChoosenMappings choosenMappings = new ChoosenMappings(mapping.getChoosenMapping());
            choosenMappings.selectMapping(mapping.getChoosenMapping());
            CreateXmlFile createXmlFile = new CreateXmlFile(xmlFields,choosenMappings);
            return createXmlFile.create().toString();
    }

}