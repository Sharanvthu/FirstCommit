package segwisis;

public class NumberException extends RuntimeException {

	private String msg;

	public NumberException(String msg) {
		this.msg=msg;
	}
	public NumberException() {
	}
	@Override
	public String getMessage() {
		return msg;
	}

}
