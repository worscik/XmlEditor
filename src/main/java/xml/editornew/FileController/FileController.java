package xml.editornew.FileController;

import xml.editornew.FileFields.XmlFields;
import xml.editornew.MappingController.MappingController;
import xml.editornew.XmlCreator.XmlFile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {



    @PostMapping("/createXml")
    public String createXml(@RequestBody XmlFields xmlFields){
            if (xmlFields.getId() == null || xmlFields.getId().isEmpty()) {
            return "ID cannot be empty.";
            }

            MappingController mapping = new MappingController(xmlFields.getMappingController().getMapping());
            String mappingTypeSelected  = mapping.setMappingToXml(mapping.getMapping());
            XmlFile xmlFile = new XmlFile(xmlFields, mappingTypeSelected);
            return xmlFile.create(xmlFields);
    }

}