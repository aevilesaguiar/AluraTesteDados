package testeProdutos;

public class MainProduto {

	public static void main(String[] args) {
		Produto p1=new Produto("Arroz");
		Produto p2=new Produto("Feijão");
		Produto p5=new Produto("Maçã");
		Produto p3=new Produto("Farinha");
		Produto p4=new Produto("Fubá");
		
		MetodosProduto listagem = new MetodosProduto();
		
		listagem.adiciona(p1);
		listagem.adiciona(p2);
		listagem.adiciona(p3);
		listagem.adiciona(p4);
		listagem.adiciona(p5);
		System.out.println(listagem);
		
		
		listagem.adiciona(0,p4);
		listagem.adiciona(3,p1);
		listagem.adiciona(1,p5);
		listagem.adiciona(0,p2);
		System.out.println(listagem);
		
		
		
		
		
	}

}
