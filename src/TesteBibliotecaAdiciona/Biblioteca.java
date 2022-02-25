package TesteBibliotecaAdiciona;

import java.util.Arrays;

public class Biblioteca {
	
	private Livro[] livros = new Livro[10];
	private Audio[]audios =new Audio[10];

	public Biblioteca() {
		super();

	}

	public Biblioteca(Livro[] livros) {
		super();
		this.livros = livros;
	}

	
	public void adicionaLivro(Livro livro) {
		
		for (int i = 0; i < livros.length; i++) {
			if(livros[i]==null) {
				livros[i]=livro;
				break;
			}
		}
	}
	
	
	public void adicionaAudio(Audio audio) {
		
		for (int i = 0; i < audios.length; i++) {
			if(audios[i]==null) {
				audios[i]=audio;
				break;
			}
		}
	}
	
	@Override
	public String toString() {
		return "Biblioteca [livros=" + Arrays.toString(livros) + "]";
	}
	
	public String toString1() {
		return "Biblioteca [audios=" + Arrays.toString(audios) + "]";
	}
	
	
}
