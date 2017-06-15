package dados;

import pessoas.Funcionario;

public interface RepositorioFuncionarios {
	public void inserir(Funcionario funcionario);
	public void remover(Funcionario funcionario);
	public void atualizar(Funcionario funcionario);
	public Funcionario procurar(String cpf);
	public boolean existe(String cpf);
}
