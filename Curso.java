
public class Curso {

	private double codigo;
	private String nome;

	public Curso() {

	}

	public Curso(double codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;

	}

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Codigo do curso: " + getCodigo() + "\n" + "Nome do curso: " + getNome() + "\n";
	}

}
