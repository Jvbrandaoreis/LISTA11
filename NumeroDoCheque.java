
public class NumeroDoCheque extends Pagamento {
	private String numeroDoCheque;
	
	public NumeroDoCheque() {
		numeroDoCheque = "";
	}
	
	public NumeroDoCheque(String nomeDoPagador,String cpf, double valorASerPago,String numeroDoCheque) {
		super (nomeDoPagador, cpf, valorASerPago);
		this.numeroDoCheque = numeroDoCheque;
	}
	
	public void setNumeroDoCheque(String numeroDoCheque) {
		this.numeroDoCheque = numeroDoCheque;
	}
	
	public String getNumeroDoCheque() {
		return numeroDoCheque;
	}
}
