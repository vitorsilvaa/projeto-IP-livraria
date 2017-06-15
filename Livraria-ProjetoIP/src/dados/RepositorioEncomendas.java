package dados;

import encomenda.Encomenda;

public interface RepositorioEncomendas {
	public void inserir(Encomenda encomenda);
	public void atualizar(Encomenda encomenda);
	public void remover(Encomenda encomenda);
	//public Encomenda procurar(Produto produto);
	//public boolean existe(Produto produto);
}
