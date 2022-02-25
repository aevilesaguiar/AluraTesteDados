package TesteBibliotecaAdiciona;

public class Audio {
	
	private String autor;

	public Audio() {
		super();
 
	}

	public Audio(String autor) {
		super();
		this.autor = autor;
	}

	
	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Audio [autor=" + autor + "]";
	}
	
	
	
}
