// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRAYS de OBJETOS em JAVA
// Ano/S: 2024/1S
// -------------------------------------

// classe que modela a entidade 'Aluno'
public class Aluno {

	// Atributo
	// ---------
<<<<<<< HEAD:14-03/bro/ANTES_AULA/src/Aluno.java
	private String nome;
	private String RA;
=======
	private String ra;
	private String nome;
>>>>>>> v3:14-03/bro/src/Aluno.java
	private String curso;

	// Método Construtor
	// -----------------
<<<<<<< HEAD:14-03/bro/ANTES_AULA/src/Aluno.java
	public Aluno(String nomeRecebido, String raRecebido, String cursoRecebido) {
		this.RA = raRecebido;
		this.nome = nomeRecebido;
		this.curso = cursoRecebido;
=======
	public Aluno(String ra, String nome, String curso) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
>>>>>>> v3:14-03/bro/src/Aluno.java
	}

	// Métodos 'getters' e 'setters' (sempre 'private')
	// ------------------------------------------------
	//RA
	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	//NOME
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//CURSO
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	// Outros métodos ('public' ou 'private', conforme a necessidade
	// -------------------------------------------------------------

	// método para exibição dos dados do Aluno
	public void exibeDadosAluno() {
	
		// identificação do autor do trabalho
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Aluno: " + nome); // nome  do aluno
		System.out.println("R.A. : " + RA); // R.A.  do aluno
		System.out.println("Curso: " + curso); // curso do aluno
		System.out.println("---------------------------------");
		System.out.println();
	
		// finalização (desnecessário neste caso, pois é procedimento 'void')
		return;	
	}
    
}
