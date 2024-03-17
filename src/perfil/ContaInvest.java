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
	private Double porcentagem;
	private String descricao;
	private boolean lancamentoAuto;
	
	//CONSTRUTORE PADRÃO
	public ContaInvest() {
		
	}
	
	//CONSTRUTORES
	public ContaInvest(int idContaInvest, String estrategia, String produto, String instituicao, String emissor,
			Date dataAplic, Double precoCusto, Double quantidade, Double saldo, Double porcentagem, String descricao,
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

	public Double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(Double porcentagem) {
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
	public void cadastrarContaInvest(int idContaInvest, String estrategia, String produto, String instituicao, String emissor, Date dataAplic, Double precoCusto, Double quantidade, Double saldo, Double porcentagem, String descricao) {
	this.setIdContaInvest(idContaInvest);
	this.setEstrategia(estrategia);
	this.setProduto(produto);
	this.setInstituicao(instituicao);
	this.setEmissor(emissor);
	this.setDataAplic(dataAplic);
	this.setPrecoCusto(precoCusto);
	this.setQuantidade(quantidade);
	this.setSaldo(saldo);
	this.setPorcentagem(porcentagem);
	this.setDescricao(descricao);
	}

	public String consultarContaInvest(int idContaInvest) {
		return "Estratégia: " + estrategia + "\nProduto: " + produto + "\nInstituição: " + instituicao + "\nEmissor: " + emissor + "\nData da Aplicação: " + dataAplic + "\nPreço de Unitário: " + precoCusto + "\nQuantidade de Cotas: " + quantidade + "\nSaldo: " + saldo + "\nPorcentagem de Rendimento: " + porcentagem + "\nDescrição: " + descricao + "\nLançamento Automático: " + lancamentoAuto ;
	}
	
	public void deletarContaInvest(int idContaInvest) {
		this.setIdContaInvest(0);
		this.setEstrategia(null);
		this.setProduto(null);
		this.setInstituicao(null);
		this.setEmissor(null);
		this.setDataAplic(null);
		this.setPrecoCusto(0.0);
		this.setQuantidade(0.0);
		this.setSaldo(0.0);
		this.setPorcentagem(0.0);
		this.setDescricao(null);
	}
	
}
