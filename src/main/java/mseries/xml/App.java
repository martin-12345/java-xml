package mseries.xml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Main class to house the functions to serialize and deserialize our Java
 * objects.
 */
public class App {


    /**
     * This function deserializes the contents of an XML file into a Java Object
     * matching our PhoneDetails class.
     */
    public static void deserializeFromXML() {
        try {
            XmlMapper xmlMapper = new XmlMapper();

            // read file and put contents into the string
            String readContent = new String(Files.readAllBytes(Paths.get("to_deserialize.xml")));

            // deserialize from the XML into a PhoneDetails object
            ResponseData deserializedData = xmlMapper.readValue(readContent, ResponseData.class);

            // Print object details
            System.out.println("Deserialized data: ");

            System.out.println(deserializedData.getData().getVehicleCount() +" vehicles");
            System.out.println(deserializedData.getData().getVehicleAt(0));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
        System.out.println("\nDeserializing from XML...\n");
        deserializeFromXML();
    }
}
