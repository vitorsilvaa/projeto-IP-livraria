package pessoas;

import dados.RepositorioClientes;

public class CadastroClientes {
	private RepositorioClientes clientes;
	
	public CadastroClientes(RepositorioClientes clientes){
		this.clientes = clientes;
	}
	
	public void cadastrar(Cliente cliente) throws PessoaJaCadastradaException{
		if(!clientes.existe(cliente.getCpf())){
			clientes.inserir(cliente);
		}else{
			throw new PessoaJaCadastradaException();
		}
	}
	
	public void remover(Cliente cliente) throws PessoaNaoEncontradaException{
		if(clientes.existe(cliente.getCpf())){
			clientes.remover(cliente);
		}else{
			throw new PessoaNaoEncontradaException();
		}
	}
	
	public void atualizar(Cliente cliente, Cliente clienteAtualizado) throws PessoaNaoEncontradaException{
		if(clientes.existe(cliente.getCpf())){
			clientes.atualizar(cliente, clienteAtualizado);
		}else{
			throw new PessoaNaoEncontradaException();
		}
	}
	
	public Cliente procurar(String cpf) throws PessoaNaoEncontradaException{
		if(clientes.existe(cpf)){
			return clientes.procurar(cpf);
		}else{
			throw new PessoaNaoEncontradaException();
		}
	}
	
}
