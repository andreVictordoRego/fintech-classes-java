package perfil;

import java.util.Date;

public class LancamentoManual {

	//ATRIBUTOS
	private int idLancamento;
	private String descricao;
	private Date data;
	private double vlLancamento;
	private String metodoPagto;
	private String condPag;
	private String tipo;
	private String periodicidade;
	private String categoria;
	
	//CONSTRUTORES

	public LancamentoManual() {
	}

	public LancamentoManual(int idLancamento, String descricao, Date data, double vlLancamento, String metodoPagto, String condPag, String tipo, String periodicidade, String categoria) {
		this.setIdLancamento(idLancamento);
		this.setDescricao(descricao);
		this.setData(data);
		this.setVlLancamento(vlLancamento);
		this.setMetodoPagto(metodoPagto);
		this.setCondPag(condPag);
		this.setTipo(tipo);
		this.setPeriodicidade(periodicidade);
		this.setCategoria(categoria);
	}
	
	public LancamentoManual(int idLancamento, Date data, double vlLancamento, String metodoPagto, String condPag, String tipo, String periodicidade, String categoria) {
		this.setData(data);
		this.setVlLancamento(vlLancamento);
		this.setMetodoPagto(metodoPagto);
		this.setCondPag(condPag);
		this.setTipo(tipo);
		this.setPeriodicidade(periodicidade);
		this.setCategoria(categoria);
	}

	public int getIdLancamento() {
		return idLancamento;
	}

	public void setIdLancamento(int idLancamento) {
		this.idLancamento = idLancamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getVlLancanmento() {
		return vlLancamento;
	}

	public void setVlLancamento(double vlLancamento) {
		this.vlLancamento = vlLancamento;
	}

	public String getMetodoPagto() {
		return metodoPagto;
	}

	public void setMetodoPagto(String metodoPagto) {
		this.metodoPagto = metodoPagto;
	}

	public String getCondPag() {
		return condPag;
	}

	public void setCondPag(String condPag) {
		this.condPag = condPag;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
	public String getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}
	
		public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void cadastrarLancamento(int idLancamento, String descricao, Date data, Double vlLancamento, String metodoPagto, String condPag, String tipo, String periodicidade, String categoria) {
		this.setIdLancamento(idLancamento);
		this.setDescricao(descricao);
		this.setData(data);
		this.setVlLancamento(vlLancamento);
		this.setMetodoPagto(metodoPagto);
		this.setCondPag(condPag);
		this.setTipo(tipo);
		this.setPeriodicidade(periodicidade);
		this.setCategoria(categoria);
	}

	public String consultarLancamento(int idLancamento) {
		return "Descrição: " + descricao + "\nData: " + data + "\nValor lançamento: " + vlLancamento + "\nMetodo de pagamento: " + metodoPagto + "\nCondição de pagamento: " + condPag + "\nTipo: " + tipo + "\nPeriodicidade: " + periodicidade + "\nCategoria:" + categoria;	
	}
	
	public void editarLancamento(String descricao, Date data, Double vlLancamento, String metodoPagto, String condPag, String periodicidade, String categoria) {
		this.setDescricao(descricao);
		this.setData(data);
		this.setVlLancamento(vlLancamento);
		this.setMetodoPagto(metodoPagto);
		this.setCondPag(condPag);
		this.setPeriodicidade(periodicidade);
		this.setCategoria(categoria);
	}
	
	public void deletarLancamento(int idLancamento) {
		this.setIdLancamento(0);
		this.setDescricao(null);
		this.setData(null);
		this.setVlLancamento(0);
		this.setMetodoPagto(null);
		this.setCondPag(null);
		this.setTipo(null);
		this.setPeriodicidade(null);
		this.setCategoria(null);
	}
}