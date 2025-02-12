package model.exceptions;

public class DomainException extends Exception {
	
	// RunTimeException - Não obrigado que o erro seja tratado 
	// Exception exige tratamento dos erros dentro de um catch

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
