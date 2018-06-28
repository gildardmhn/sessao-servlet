
public class Usuario {
	private String Nome;
	private String senha;
	

	
	public Usuario(String nome, String senha) {
		super();
		Nome = nome;
		this.senha = senha;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
