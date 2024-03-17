package perfil;

import java.util.Date;

public class ContaInvest {
	
	//ATRIBUTOS
	private int idContaInvest;
	private String estrategia;
	private String produto;
	private String instituicao;
	private String emissor;
	private Date dataAplic;
	private Double precoCusto;
	private Double quantidade; //verificar se é double ou float
	private Double saldo;
	private Float porcentagem;
	private String descricao;
	private boolean lancamentoAuto;
	
	//CONSTRUTORE PADRÃO
	public ContaInvest() {
		
	}
	
	//CONSTRUTORES
	public ContaInvest(int idContaInvest, String estrategia, String produto, String instituicao, String emissor,
			Date dataAplic, Double precoCusto, Double quantidade, Double saldo, Float porcentagem, String descricao,
			boolean lancamentoAuto) {
		this.idContaInvest = idContaInvest;
		this.estrategia = estrategia;
		this.produto = produto;
		this.instituicao = instituicao;
		this.emissor = emissor;
		this.dataAplic = dataAplic;
		this.precoCusto = precoCusto;
		this.quantidade = quantidade;
		this.saldo = saldo;
		this.porcentagem = porcentagem;
		this.descricao = descricao;
		this.lancamentoAuto = lancamentoAuto;
	}
	
	//GETTER AND SETTERS PADROES

	public int getIdContaInvest() {
		return idContaInvest;
	}

	public void setIdContaInvest(int idContaInvest) {
		this.idContaInvest = idContaInvest;
	}

	public String getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public Date getDataAplic() {
		return dataAplic;
	}

	public void setDataAplic(Date dataAplic) {
		this.dataAplic = dataAplic;
	}

	public Double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(Double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getSaldo() {
		return saldo;
	}

	//VERIFICAR SE TEM QUE TIRAR O SET SALDO(ACHO QUE SIM)
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Float getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(Float porcentagem) {
		this.porcentagem = porcentagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isLancamentoAuto() {
		return lancamentoAuto;
	}

	public void setLancamentoAuto(boolean lancamentoAuto) {
		this.lancamentoAuto = lancamentoAuto;
	}
	
	//METODOS
	
	//verificar com time
	public void consultar(int idContaInvest) {
		
	}
	
	public void deletar(int idContaInvest) {
		this.idContaInvest = 0;
		this.estrategia = null;
		this.produto = null;
		this.instituicao = null;
		this.emissor = null;
		this.dataAplic = null;
		this.precoCusto = null;
		this.quantidade = null;
		this.saldo = null;
		this.porcentagem = null;
		this.descricao = null;
		this.lancamentoAuto = false; //verificar com time
	}
	
}
