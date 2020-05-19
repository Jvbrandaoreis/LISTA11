
public class CartaoDeCredito extends Pagamento {
	private String numeroDoCartao;
	
	
	public CartaoDeCredito() {
		numeroDoCartao = "";
	}
	
	public CartaoDeCredito(String nomeDoPagador,String cpf, double valorASerPago,String numeroDoCartao) {
		super (nomeDoPagador, cpf, valorASerPago);
		this.numeroDoCartao = numeroDoCartao;
	}
	
	public void setCartaoDeCredito(String numeroDoCartao) {
		this.numeroDoCartao = numeroDoCartao;
	}
	
	public String getCartaoDeCredito() {
		return numeroDoCartao;
	}
}
