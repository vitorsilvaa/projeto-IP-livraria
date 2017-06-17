package eventos;
import dados.RepositorioEvento;

public class Cadastroevento {
	
	private RepositorioEvento evento;
	
	public Cadastroevento(RepositorioEvento evento){
		this.evento = evento;
		
	}
	public void cadastrar(String nome) throws EventoExistenteException{
		
		if(!evento.existe(nome)){
			evento.inserir(nome);
		}else {
			throw new EventoExistenteException();
		}
	}
	public void remover(String nome) throws EventoNaoExisteException{
		
		if(evento.existe(nome)){
			evento.remover(nome);
		}else {
			throw new EventoNaoExisteException();
		}
	}
	public void atualizar(String nome) throws EventoNaoExisteException{
		
		if(evento.existe(nome)){
			evento.atualizar(nome);
		}else {
			throw new EventoNaoExisteException();
		}
	}
	public Evento procurar(String nome) throws EventoNaoExisteException{
		if(evento.existe(nome)){
			return evento.procurar(nome);	
		}else {
			throw new EventoNaoExisteException();
		}
		
		
	}

		
}
