package encomenda;

public class Encomenda {
	private Produto produto;
	private boolean opcaoEntrega;	// true -> entrega em casa; false -> entrega na loja.
	private String enderecoEntrega;
	private int prazoEntrega;		// prazo de entrega em dias corridos
	private String dataPedido;		// data em que o pedido foi realizado
	private String statusEntrega;	// "a caminho", "entregue" ou "cancelado"
	private double valorFrete;
	
	
	public Encomenda(Produto produto, boolean opcaoEntrega, String enderecoEntrega, int prazoEntrega, String dataPedido,
			String statusEntrega, double valorFrete) {
		super();
		this.produto = produto;
		this.opcaoEntrega = opcaoEntrega;
		this.enderecoEntrega = enderecoEntrega;
		this.prazoEntrega = prazoEntrega;
		this.dataPedido = dataPedido;
		this.statusEntrega = statusEntrega;
		this.valorFrete = valorFrete;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public boolean isOpcaoEntrega() {
		return opcaoEntrega;
	}


	public void setOpcaoEntrega(boolean opcaoEntrega) {
		this.opcaoEntrega = opcaoEntrega;
	}


	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}


	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}


	public int getPrazoEntrega() {
		return prazoEntrega;
	}


	public void setPrazoEntrega(int prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}


	public String getDataPedido() {
		return dataPedido;
	}


	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}


	public String getStatusEntrega() {
		return statusEntrega;
	}


	public void setStatusEntrega(String statusEntrega) {
		this.statusEntrega = statusEntrega;
	}


	public double getValorFrete() {
		return valorFrete;
	}


	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	
	
	
	
}
