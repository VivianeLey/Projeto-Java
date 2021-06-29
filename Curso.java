
public class Curso {

	//variáveis da instância
	private int codigo;
	private String nome;
	
	public Curso(int codigo, String nome) {
		this.codigo = codigo; //armazena o codigo
		this.nome = nome; //armazena o nome
		
	}
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	
	//método para recuperar o objeto
	public int getCodigo() {
		return codigo; //retorna o valor do código para o método chamador
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
