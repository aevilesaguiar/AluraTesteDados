package TesteBibliotecaAdiciona;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Livro l1 = new Livro("Anne with 'e'-1", "lucy");
		Livro l2 = new Livro("Anne with 'e'-2", "lucy");
		Livro l3 = new Livro("Anne with 'e'-3", "lucy");
		
		Biblioteca lista=new Biblioteca();
		
		lista.adicionaLivro(l1);
		lista.adicionaLivro(l2);
		lista.adicionaLivro(l3);
		
		System.out.println(lista);
		
		
		Livro l4 = new Livro("Lagoa azul", " perez");
		
		lista.adicionaLivro(l4);
		System.out.println(lista);
		
		
		Audio a1= new Audio("Carlos Araujo");
		
		Biblioteca listaAudio =new Biblioteca();
		
		listaAudio.adicionaAudio(a1);
		
		System.out.println(listaAudio.toString1());
		
		
		
	}

}
