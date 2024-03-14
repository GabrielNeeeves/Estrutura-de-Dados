// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRAYS de OBJETOS em JAVA
// Ano/S: 2024/1S
// -------------------------------------

// classe que modela a entidade 'Aluno'
public class Aluno {

	// Atributos
	// ---------
	private Long ra;
	private String nome;
	private String curso;

	// Método Construtor
	// -----------------
	public Aluno(Long ra, String nome, String curso) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
	}

	// Métodos 'getters' e 'setters' (sempre 'private')
	// ------------------------------------------------
	//RA
	public Long getRa() {
		return ra;
	}

	public void setRa(Long ra) {
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
	void exibeDadosAluno() {
	
		// identificação do autor do trabalho
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Aluno: " + nome); // nome  do aluno
		System.out.println("R.A. : ..."); // R.A.  do aluno
		System.out.println("Curso: ..."); // curso do aluno
		System.out.println("---------------------------------");
		System.out.println();
	
		// finalização (desnecessário neste caso, pois é procedimento 'void')
		return;	
	}
    
}
