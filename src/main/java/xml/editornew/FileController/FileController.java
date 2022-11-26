package xml.editornew.FileController;

import xml.editornew.FileFields.XmlFields;
import xml.editornew.XmlCreator.CreateXmlFile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @PostMapping("/createXml")
    public String createXml(@RequestBody XmlFields xmlFields){
        CreateXmlFile createXmlFile = new CreateXmlFile(xmlFields);
        return createXmlFile.create().toString();
    }

}