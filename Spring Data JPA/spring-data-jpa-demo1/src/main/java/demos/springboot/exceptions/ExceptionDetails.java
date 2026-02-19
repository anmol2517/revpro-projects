
package demos.springboot.exceptions;

import java.util.Date;

public class ExceptionDetails {
	
	private String message;
	private String url;
	private Date date;

	public ExceptionDetails() {
		super();
	}

	public ExceptionDetails(String message, String url) {
		super();
		this.message = message;
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ExceptionDetails [message=" + message + ", url=" + url + "]";
	}

}
