package mseries.xml;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseData {
	@JsonProperty("ApplicationArea")
	private ApplicationArea application;

	@JsonProperty("DataArea")
	private DataArea data;

	public DataArea getData() {
		return data;
	}

	public void setData(DataArea data) {
		this.data = data;
	}

}
