// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRAYS de OBJETOS em JAVA
// Ano/S: 2024/1S
// -------------------------------------

// classe que modela a entidade 'Pessoa'
public class Pessoa {

	// Atributos
	// ---------
	private String nome;
	private String cpf;

	// Método Construtor
	// -----------------
	public Pessoa( String nomeRecebido, String cpfRecebido ) {
		this.nome  = nomeRecebido;
		this.cpf = cpfRecebido;
	}

	// Métodos 'getters' e 'setters' (sempre 'private')
	// ------------------------------------------------
	public String getNome() {
		return nome;
	}
	public void setNome( String nomeRecebido ) {
		nome = nomeRecebido;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	// Outros métodos ('public' ou 'private', conforme a necessidade
	// -------------------------------------------------------------

	// método para exibição dos dados do Pessoa
	public void exibeDadosPessoa() {
	
		// identificação do autor do trabalho
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Pessoa: " + nome);  // nome  da pessoa
		System.out.println("CPF. : " + cpf);    // R.A.  da pessoa
		System.out.println("---------------------------------");
		System.out.println();
	
		// finalização (desnecessário neste caso, pois é procedimento 'void')
		return;	
	}
    
}
