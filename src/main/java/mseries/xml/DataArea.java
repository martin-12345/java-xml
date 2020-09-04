/*
 *   Copyright (c) 2017 Martin Newstead (java@mseries.plus.com).  All Rights Reserved.
 *
 *   The author makes no representations or warranties about the suitability of the
 *   software, either express or implied, including but not limited to the
 *   implied warranties of merchantability, fitness for a particular
 *   purpose, or non-infringement. The author shall not be liable for any damages
 *   suffered by licensee as a result of using, modifying or distributing
 *   this software or its derivatives.
 *
 *   The author requests that he be notified of any application, applet, or other binary that
 *   makes use of this code and that some acknowledgement is given. Comments, questions and
 *   requests for change will be welcomed.
 */
package mseries.xml;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class DataArea {


	@JsonProperty("Vehicles")
	@JacksonXmlElementWrapper(localName = "Vehicles")
	private List<Vehicle> vehicles;
	
	@JsonProperty("Error")
	private ErrorArea error;
	
	public boolean hasVehicles() {
		return vehicles != null;
	}
	
	public int getVehicleCount() {
		return vehicles == null ? 0 : vehicles.size();
	}
	
	public Vehicle getVehicleAt(int n) {
		return vehicles.get(n);
	}

}
