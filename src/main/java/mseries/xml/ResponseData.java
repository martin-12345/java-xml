package mseries.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CarDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseData {

	@XmlElement(name ="ApplicationArea")
	private ApplicationArea application;

	@XmlElement(name ="DataArea")
	private DataArea data;

	public DataArea getData() {
		return data;
	}

	public void setData(DataArea data) {
		this.data = data;
	}

	public ApplicationArea getApplication() {
		return application;
	}

	public void setApplication(ApplicationArea application) {
		this.application = application;
	}
}
