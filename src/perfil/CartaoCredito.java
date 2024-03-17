package perfil;

import java.util.Date;

public class CartaoCredito {
	
	private String apelido;
	private int idCartao, nrCartao;
	private String tipo, senhaCartao;
	private Date dtFechamentoFatura, dtVencFatura, dtValidadeCartao;
	private Double limiteDispo,limiteTotal;
	private boolean lancamentoAuto;
	private Bandeira bandeira;
	private Fatura fatura;
	
	public CartaoCredito() {
	}
	
	public CartaoCredito(String apelido, int idCartao, int nrCartao, String tipo, Date dtFechamentoFatura,Date dtVencFatura, Date dtValidadeCartao, Double limiteDispo, Double limiteTotal,String senhaCartao, boolean lancamentoAuto) {
		this.apelido = apelido;
		this.idCartao = idCartao;
		this.nrCartao = nrCartao;
		this.tipo = tipo;
		this.dtFechamentoFatura = dtFechamentoFatura;
		this.dtVencFatura = dtVencFatura;
		this.dtValidadeCartao = dtValidadeCartao;
		this.limiteDispo = limiteDispo;
		this.limiteTotal = limiteTotal;
		this.senhaCartao = senhaCartao;
		this.lancamentoAuto = lancamentoAuto;
	}

	
	
	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getIdCartao() {
		return idCartao;
	}

	public void setIdCartao(int idCartao) {
		this.idCartao = idCartao;
	}

	public int getNrCartao() {
		return nrCartao;
	}

	public void setNrCartao(int nrCartao) {
		this.nrCartao = nrCartao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDtFechamentoFatura() {
		return dtFechamentoFatura;
	}

	public void setDtFechamentoFatura(Date dtFechamentoFatura) {
		this.dtFechamentoFatura = dtFechamentoFatura;
	}

	public Date getDtVencFatura() {
		return dtVencFatura;
	}

	public void setDtVencFatura(Date dtVencFatura) {
		this.dtVencFatura = dtVencFatura;
	}

	public Date getDtValidadeCartao() {
		return dtValidadeCartao;
	}

	public void setDtValidadeCartao(Date dtValidadeCartao) {
		this.dtValidadeCartao = dtValidadeCartao;
	}

	public Double getLimiteDispo() {
		return limiteDispo;
	}

	public void setLimiteDispo(Double limiteDispo) {
		this.limiteDispo = limiteDispo;
	}

	public Double getLimiteTotal() {
		return limiteTotal;
	}

	public void setLimiteTotal(Double limiteTotal) {
		this.limiteTotal = limiteTotal;
	}

	public boolean isLancamentoAuto() {
		return lancamentoAuto;
	}

	public void setLancamentoAuto(boolean lancamentoAuto) {
		this.lancamentoAuto = lancamentoAuto;
	}
	
	public String getSenhaCartao() {
		return senhaCartao;
	}

	public void setSenhaCartao(String senhaCartao) {
		this.senhaCartao = senhaCartao;
	}

	
	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

	public void cadastrarCartaoCredito(String apelido, int idCartao, int nrCartao, String tipo, Date dtFechamentoFatura,Date dtVencFatura, Date dtValidadeCartao, Double limiteDispo, Double limiteTotal, String senhaCartao){
		this.setLancamentoAuto(true);
		this.setIdCartao(idCartao);
		this.setNrCartao(nrCartao);
		this.setTipo(tipo);
		this.setDtFechamentoFatura(dtFechamentoFatura);
		this.setDtVencFatura(dtVencFatura);
		this.setDtValidadeCartao(dtValidadeCartao);
		this.setDtVencFatura(dtVencFatura);
		this.setLimiteDispo(limiteDispo);	
		this.setSenhaCartao(senhaCartao);
	}
	
	public void cadastrarCartaoCredito(String apelido, int idCartao, int nrCartao, String tipo, Date dtFechamentoFatura,Date dtVencFatura, Date dtValidadeCartao, Double limiteDispo, Double limiteTotal){
		this.setLancamentoAuto(false);
		this.setIdCartao(idCartao);
		this.setNrCartao(nrCartao);
		this.setTipo(tipo);
		this.setDtFechamentoFatura(dtFechamentoFatura);
		this.setDtVencFatura(dtVencFatura);
		this.setDtValidadeCartao(dtValidadeCartao);
		this.setDtVencFatura(dtVencFatura);
		this.setLimiteDispo(limiteDispo);	
	}
	
	public String consultarCartaoCredito(String apelido){
		return "Apelido: " + apelido + "\nNúmero cartão: " + nrCartao + "\nTipo: " + tipo + "\nData de Fechamento Fatura: " + dtFechamentoFatura + "\nData de Vencimento Fatura: " + dtVencFatura + "\nData de Validade do Cartao: " + dtValidadeCartao + "\nLimite Disponível: " + limiteDispo + "\nLimite Total: " + limiteTotal + "\nBandeira: " + bandeira;
	}
	
	public void deletarCartaoCredito(String apelido) {
		this.setApelido(null);
		this.setIdCartao(0);
		this.setNrCartao(0);
		this.setTipo(null);
		this.setDtFechamentoFatura(null);
		this.setDtVencFatura(null);
		this.setDtValidadeCartao(null);
		this.setLimiteDispo(0.0);
		this.setLimiteTotal(0.0);
		this.setSenhaCartao(null);
		this.setLancamentoAuto(false);
	}
}
