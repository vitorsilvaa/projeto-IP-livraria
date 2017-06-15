package dados;

import pessoas.Cliente;

public interface RepositorioClientes {
	public void inserir(Cliente cliente);
	public void remover(Cliente cliente);
	public void atualizar(Cliente cliente);
	public Cliente procurar(String cpf);
	public boolean existe(String cpf);
}