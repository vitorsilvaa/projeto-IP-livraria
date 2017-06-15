package cliente;

public class Cliente extends Pessoa {
	String bonus;
	CadastroEncomendas encomendas;
	boolean clienteVIP;
	
	// construtor
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
	}

	
	//getters & setters
	protected String getBonus() {
		return bonus;
	}

	protected void setBonus(String bonus) {
		this.bonus = bonus;
	}

	protected CadastroEncomendas getEncomendas() {
		return encomendas;
	}

	protected void setEncomendas(CadastroEncomendas encomendas) {
		this.encomendas = encomendas;
	}

	protected boolean isClienteVIP() {
		return clienteVIP;
	}

	protected void setClienteVIP(boolean clienteVIP) {
		this.clienteVIP = clienteVIP;
	}
	
	
	// metodos de negocio
	
	public void comprarProduto(Produto produto){
		
	}
	
	public void ganharBonus(double valorCompra){
		
	}
	
	public void usarBonus(double valorCompra){
		
	}
	
	public void fazerEncomenda(Encomenda encomenda){
		
	}
	
	public void receberEncomenda(Encomenda encomenda){
		
	}
	
	public String consultarEncomenda(Encomenda encomenda){
		
	}

}
