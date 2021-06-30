
public class Pessoa {
	
	private String nome;
	private String cpf;
	private int idade;
	
	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
		public Pessoa(double salario) {
		// TODO Auto-generated constructor stub
	}

		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public class Professor extends Pessoa{

		public Professor(String nome, String cpf, int idade) {
			super(nome, cpf, idade);
			// TODO Auto-generated constructor stub
		}}

	public class Aluno extends Pessoa{

		public Aluno(String nome, String cpf, int idade) {
			super(nome, cpf, idade);
			// TODO Auto-generated constructor stub
		}
		
	}
}
