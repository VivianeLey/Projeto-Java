
public class Curso {

	
	private int codigo;
	private String nome;
	
	public Curso(int codigo, String nome) {
		this.codigo = codigo; 
		this.nome = nome; 
		
	}
	public Curso() {
		
	}
	
	//método para recuperar o objeto
	public int getCodigo() {
		return codigo; 
	}
	
	//método para definir o objeto
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
