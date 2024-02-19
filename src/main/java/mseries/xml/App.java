package mseries.xml;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class App {

	/**
	 * This function deserializes the contents of an XML file into a Java Object
	 * matching our PhoneDetails class.
	 */
	public static void deserializeFromXML() {
		try {

			// read file and put contents into the string

			// deserialize from the XML into a PhoneDetails object
			JAXBContext jaxbContext = JAXBContext.newInstance(ResponseData.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			ResponseData deserializedData = (ResponseData) jaxbUnmarshaller.unmarshal(new File("to_deserialize.xml"));


			// Print object details
			System.out.println("Deserialized data: ");

			System.out.println(deserializedData.getData().getVehicleCount() + " vehicles");
			for (int i = 0; i < deserializedData.getData().getVehicleCount(); i++) {

				System.out.println(deserializedData.getData().getVehicleAt(i));
			}

		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		deserializeFromXML();
	}
}
