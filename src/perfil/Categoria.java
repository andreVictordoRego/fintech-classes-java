package perfil;

public class Categoria {

	//ATRIBUTOS
	private int idCategoria;
	private String nome;
	private boolean tipo;
	
	
	
	//CONSTRUTORES
	public Categoria() {
		
	}
	
	public Categoria(int idCategoria, String nome, boolean tipo) {
		this.idCategoria = idCategoria;
		this.nome = nome;
		this.tipo = tipo;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	
	public void editar(int idCategoria, String nome, boolean tipo) {
		this.idCategoria = idCategoria; //verificar se o usuario pode mudar o ID
		this.nome = nome;
		this.tipo = tipo;
	}
	
}
