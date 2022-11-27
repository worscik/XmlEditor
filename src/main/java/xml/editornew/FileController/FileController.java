package xml.editornew.FileController;

import xml.editornew.FileFields.XmlFields;
import xml.editornew.MappingController.ChoosenMappings;
import xml.editornew.XmlCreator.XmlFile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @PostMapping("/createXml")
    public String createXml(@RequestBody XmlFields xmlFields){
            String mapping = "root/item";
            ChoosenMappings choosenMappings = new ChoosenMappings(mapping);
            choosenMappings.selectMapping(mapping);
            XmlFile xmlFile = new XmlFile(xmlFields,choosenMappings);
            return xmlFile.create(xmlFields).toString();
    }

}