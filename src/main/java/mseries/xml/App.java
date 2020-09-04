package mseries.xml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

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

			System.out.println(deserializedData.getData().getVehicleCount() + " vehicles");
			for (int i = 0; i < deserializedData.getData().getVehicleCount(); i++) {

				System.out.println(deserializedData.getData().getVehicleAt(i));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		deserializeFromXML();
	}
}
