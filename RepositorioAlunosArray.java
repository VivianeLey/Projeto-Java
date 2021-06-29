
public class RepositorioAlunosArray {
	
	private Aluno[] alunos;
	private int indice;
	
	public RepositorioAlunosArray(int tamanho) {
		indice = 0;
		alunos = new Aluno[tamanho];
		
	}
	
	public void inserir (Aluno estudante) {
		alunos[indice] = estudante;
		indice = indice +1;
		
	}
	
	public Aluno procurar (String cpf) {
		Aluno encontrado = null;
		for(int i=0; i < indice; i++) {
			Aluno procura = this.alunos[i];
			if(procura.getCpf().equals(cpf))
				encontrado = procura;
		}
		return encontrado;
	}
	
	
	public void remover (String cpf) {
		for(int i=0; i < indice; i++) {
			Aluno procura = this.alunos[i];
			if(procura.getCpf().equals(cpf)) {
				
				this.alunos[i] = this.alunos[indice - 1];
				this.alunos[indice -1] = null;
				
				indice = indice - 1;
			}
			
		}
	}
}
	
	
	


