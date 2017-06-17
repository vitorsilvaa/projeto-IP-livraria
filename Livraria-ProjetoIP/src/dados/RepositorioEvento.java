package dados;

import eventos.Evento;

public interface RepositorioEvento {
	
	void inserir(String nome);
	void remover (String nome);
	void atualizar (String nome);
	Evento procurar(String nome);
    boolean existe(String nome);
}
