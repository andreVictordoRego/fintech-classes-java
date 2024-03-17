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
	
	//CONSTRUTORES

	public LancamentoManual() {
	}

	public LancamentoManual(int idLancamento, String descricao, Date data, double vlLancamento, String metodoPagto,
			String condPag, String tipo) {
		this.idLancamento = idLancamento;
		this.descricao = descricao;
		this.data = data;
		this.vlLancamento = vlLancamento;
		this.metodoPagto = metodoPagto;
		this.condPag = condPag;
		this.tipo = tipo;
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

	//verificar metodo
	public void consultar(int idLancamento) {
	}
	
	//verificar metodo aqui e no astah
	public void editar(String descricao, Date data, Double vlLancamento, String metodoPagto, String condPag) {
		this.descricao = descricao;
		this.data = data;
		this.vlLancamento = vlLancamento;
		this.metodoPagto = metodoPagto;
		this.condPag = condPag;
	}
	
	public void deletar(int idLancamento) {
		this.idLancamento = 0;
		this.descricao = null;
		this.data = null;
		this.vlLancamento = 0;
		this.metodoPagto = null;
		this.condPag = null;
		this.tipo = null;
	}
}