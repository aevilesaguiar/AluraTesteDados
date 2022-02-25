package Vetor;
import java.util.Objects;

public class Aluno {
	
	private String nome;

	public Aluno(String nome) {

		this.nome = nome;
	}
	
	

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	//m�todo compara dois objetos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "]";
	}
	
	

}
