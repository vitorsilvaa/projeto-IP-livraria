package pessoas;

public class Funcionario extends Pessoa {
	double salario;
	double comissao;
	int vendasMes;
	// int funcionarioDestaque;

	// construtor
	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
	}

	// getters & setters
	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	protected double getComissao() {
		return comissao;
	}

	protected void setComissao(double comissao) {
		this.comissao = comissao;
	}

	protected int getVendasMes() {
		return vendasMes;
	}

	protected void setVendasMes(int vendasMes) {
		this.vendasMes = vendasMes;
	}
	
	
	// metodos especificos
	
	public void venderProduto(Produto produto){
		
	}
	
	public void renderComissao(double valorVenda){
		
	}
	
	public void receberComissao(){
		
	}
	
	public void aumentarSalario(){
		
	}
	
	public void ganharDestaque(){
		
	}

}
