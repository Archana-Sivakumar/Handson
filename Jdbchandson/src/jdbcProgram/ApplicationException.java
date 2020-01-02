package jdbcProgram;

public class ApplicationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String errorMessage;
	int errorCode;

	public ApplicationException(String errorMessage, int errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return ("Duplicate entry in id " + errorCode + "\n" + errorMessage);
	}

}
