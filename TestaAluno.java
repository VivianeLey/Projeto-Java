
public class TestaAluno {

	public static void main(String[] args) {
		
		RepositorioAlunosArray local  = new RepositorioAlunosArray(3);
		
		//Criação de Objeto
		Curso curso1 = new Curso(001,"Análise e Desenvolvimento de Sistemas");
		Curso curso2 = new Curso(002,"Psicologia");
		
		Aluno aluno1 = new Aluno("Maria Fernanda","12345678-9",22, curso1);
		Aluno aluno2 = new Aluno("José Henrique","34456433-9",20, curso2);
		
		//curso1.setCodigo(001);
		//curso1.setNome("Análise e Desenvolvimento de Sistemas");
		  
		//curso2.setCodigo(002);
		//curso2.setNome("Psicologia");
		
		/*aluno1.setNome("Maria Fernanda");
		aluno1.setCpf("12345678-9");
		aluno1.setIdade(22);
		aluno1.setCurso(curso1); */
		
		//aluno2.setNome("José Henrique");
		//aluno2.setCpf("34456433-9");
		//aluno2.setIdade(20);
		//aluno2.setCurso(curso2);
		
		//		
		System.out.println("Nome: " + aluno1.getNome() + "\n" + "CPF:" + aluno1.getCpf() + "\n" + "Curso: " + aluno1.getCurso().getNome());
		System.out.println("\n");
		System.out.println("Nome: " + aluno2.getNome() + "\n" + "CPF:" + aluno2.getCpf() + "\n" + "Curso: " + aluno2.getCurso().getNome() + "\n");

		
		//inserir aluno
		Aluno aluno3 = new Aluno ("Vanessa Cristina", "12365487-0", 24, curso2);
		local.inserir(aluno3);
		
		Aluno aluno4 = new Aluno ("Fabio Luis", "45698329-0",35, curso1);
		local.inserir(aluno4);
		
		System.out.println("Nome: " + aluno3.getNome());
		
		//procurar aluno
		Aluno encontrado = local.procurar("12365487-0");
		System.out.println("O aluno procurado foi: " + encontrado.getNome() + " portadora do CPF: " + aluno3.getCpf() + " inclusa no curso de " + aluno3.getCurso().getNome());
		
		//removerconta
		encontrado = local.procurar("45698329-0");
		if(encontrado == null) {
			System.out.println("Não existe aluno com o cpf informado!");
		} else {
			local.remover("45698329-0");
			System.out.println("Aluno " + encontrado.getNome() + " removido!");
		}
	
		
	}

}
