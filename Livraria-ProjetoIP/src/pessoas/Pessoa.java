package pessoas;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String email;
	private String endereco;
	private String telefone;
	
	
	// construtor
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	
	// getters & setters
	
	protected String getNome() {
		return nome;
	}
	protected String getCpf() {
		return cpf;
	}
	protected String getEmail() {
		return email;
	}
	protected String getEndereco() {
		return endereco;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	protected String getTelefone() {
		return telefone;
	}


	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
