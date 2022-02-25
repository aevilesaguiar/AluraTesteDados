package testeProdutos;

import java.util.Objects;

public class Produto {
	
	private String nome;
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	

	public Produto() {
		super();

	}



	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome);
	}



	@Override
	public String toString() {
		return "Produto [nome=" + nome + "]";
	}



	
	

}
