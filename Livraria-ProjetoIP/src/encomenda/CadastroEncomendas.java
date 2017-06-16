package encomenda;

import dados.RepositorioEncomendas;

public class CadastroEncomendas {
	private RepositorioEncomendas encomendas;

	public CadastroEncomendas(RepositorioEncomendas encomendas) {
		this.encomendas = encomendas;
	}
	
	public void novaEncomenda(Encomenda encomenda) throws EncomendaJaCadastradaException{
		if(encomendas.existe(encomenda)){
			throw new EncomendaJaCadastradaException();
		}else{
			encomendas.inserir(encomenda);			
		}		
	}
	
	public void entregarEncomenda(Encomenda encomenda) throws EncomendaNaoEncontradaException{
		if(encomendas.existe(encomenda)){
			encomenda.setStatusEntrega("entregue");
		}else{
			throw new EncomendaNaoEncontradaException();
		}
	}
	
	public void cancelarEncomenda(Encomenda encomenda) throws EncomendaNaoEncontradaException{
		if(encomendas.existe(encomenda)){
			encomenda.setStatusEntrega("cancelada");
			encomenda.setPrazoEntrega(-1);			
		}else{
			throw new EncomendaNaoEncontradaException();
		}
	}
	
	public void prazoRestante(Encomenda encomenda){
		//usar código de lista anterior criado para calcular diferenças entre datas
	}
	

}
