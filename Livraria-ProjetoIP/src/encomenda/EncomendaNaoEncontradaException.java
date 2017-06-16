package encomenda;

public class EncomendaNaoEncontradaException extends Exception {

	public EncomendaNaoEncontradaException(){
		super("Encomenda nao encontrada");
	}
}
