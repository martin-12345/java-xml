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


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Vehicle")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Vehicle {
	private String vrm;
	private String fuel;
	private String ktype;
	private String engineCode;

	@XmlElement(name="VRM_Curr")
	public String getVrm() {
		return vrm;
	}

	public void setVrm(String VRM_Curr) {
		this.vrm = VRM_Curr;
	}

	@XmlElement(name="Fuel")
	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@XmlElement(name="Ktype")
	public String getKtype() {
		return ktype;
	}

	public void setKtype(String ktype) {
		this.ktype = ktype;
	}

	@XmlElement(name="EngineCode")
	public String getEngineCode() {
		return engineCode;
	}

	public void setEngineCode(String engineCode) {
		this.engineCode = engineCode;
	}

	public String toString() {
		return	"vrm="+getVrm();
	}
}
