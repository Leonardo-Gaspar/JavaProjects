package APICP5.exception;

public class translateException extends Exception {

	public translateException(String mensagem) {
		super(mensagem);
	}
	public translateException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
