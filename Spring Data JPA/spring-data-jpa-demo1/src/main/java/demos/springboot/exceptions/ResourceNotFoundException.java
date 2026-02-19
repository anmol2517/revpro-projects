package demos.springboot.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		super("ResourceNotFoundException occured");
	}

	public ResourceNotFoundException(String message) {
		super("ResourceNotFoundException occured: " + message);
	}
}
