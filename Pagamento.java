
public class Pagamento {
	private String nomeDoPagador;
	private String cpf;
	private double valorASerPago;
	
	public Pagamento(){
		nomeDoPagador = "";
		cpf = "";
		valorASerPago = 0.0;
	}
	
	public Pagamento(String nomeDoPagador,String cpf, double valorASerPago) {
		this.nomeDoPagador = nomeDoPagador;
		this.cpf = cpf;
		this.valorASerPago = valorASerPago;
	}
	
	public void setNomeDoPagado(String nomeDoPagador) {
		this.nomeDoPagador = nomeDoPagador;
	}
	
	public String getNomeDoPagador() {
		return nomeDoPagador;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setValorASerPago(double valorASerPago) {
		this.valorASerPago = valorASerPago;
	}
	
	public double getValorASerPago() {
		return valorASerPago;
	}
}
