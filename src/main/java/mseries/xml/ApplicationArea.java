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

@XmlRootElement(name = "DataArea")
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationArea {

	@XmlElement(name="Date")
	private String date;
	@XmlElement(name="Caller")
	private String caller;
		

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

}
