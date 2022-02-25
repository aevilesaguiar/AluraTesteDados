package TesteBibliotecaAdiciona;

import java.util.Objects;

public class Livro {
	
	private String nome;
	private String autor;
	

	public Livro() {

	}
	
	

	public Livro(String nome, String autor) {
		super();
		this.nome = nome;
		this.autor = autor;
	}



	public String getNome() {
		return nome;
	}
	
	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(nome, other.nome);
	}
	
	

	

}
