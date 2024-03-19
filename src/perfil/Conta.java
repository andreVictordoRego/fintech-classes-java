package perfil;

public abstract class Conta {

	
	protected int numero;
	protected String senhaApp;
	protected Double saldo;
	protected boolean lancamentoAuto;
	protected String apelido;
	
	public Conta() {
		
	}
	
	public Conta(int numero, String senhaApp, Double saldo, boolean lancamentoAuto, String apelido) {
		this.numero = numero;
		this.senhaApp = senhaApp;
		this.saldo = saldo;
		this.lancamentoAuto = lancamentoAuto;
		this.apelido = apelido;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getSenhaApp() {
		return senhaApp;
	}
	public void setSenhaApp(String senhaApp) {
		this.senhaApp = senhaApp;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public boolean isLancamentoAuto() {
		return lancamentoAuto;
	}
	public void setLancamentoAuto(boolean lancamentoAuto) {
		this.lancamentoAuto = lancamentoAuto;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	
	
}
