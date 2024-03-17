package perfil;

public class Categoria {

	private int idCategoria;
	private String nomeCategoria;
	private String tipoCategoria;
	
	
	public Categoria() {
	
	}
	
	public Categoria(int idCategoria, String nomeCategoria, String tipoCategoria) {
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.tipoCategoria = tipoCategoria;
	}
	
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	public String getTipoCategoria() {
		return tipoCategoria;
	}
	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}
	
	@Override
    public String toString() {
        return nomeCategoria;
    }	
	
	public void cadastrarCategoria(int idCategoria, String nomeCategoria, String tipoCategoria) {
		this.setIdCategoria(idCategoria);
		this.setNomeCategoria(nomeCategoria);
		this.setTipoCategoria(tipoCategoria);
	}
	
	public void editarCategoria(int idCategoria, String nomeCategoria, String tipoCategoria) {
		this.setNomeCategoria(nomeCategoria);
		this.setTipoCategoria(tipoCategoria);
	}

	public void deletarCategoria(int idCategoria, String nomeCategoria, String tipoCategoria) {
		this.setIdCategoria(0);
		this.setNomeCategoria(null);
		this.setTipoCategoria(null);
	}
}

