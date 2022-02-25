package Vetor;

public class VetorTeste {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Jose");
		Aluno a3 = new Aluno("Danilo");
		Aluno a4 = new Aluno("Flavio");
		Aluno a5 = new Aluno("Joao");
		Aluno a6 = new Aluno("Jose");
		Aluno a7 = new Aluno("Danilo");
		Aluno a8 = new Aluno("Flavio");
		Aluno a9 = new Aluno("Joao");
		Aluno a10 = new Aluno("Jose");
		Aluno a11 = new Aluno("Danilo");
		Aluno a12 = new Aluno("Flavio");

		Vetor lista = new Vetor();

		lista.adicionaAluno(a1);
		System.out.println(lista.tamanho());
		lista.adicionaAluno(a2);
		System.out.println(lista.tamanho());
		lista.adicionaAluno(a3);
		System.out.println(lista.tamanho());
		System.out.println(lista);

		System.out.println(lista.contem(a4));
		System.out.println(lista.contem(a2));


		lista.adiciona(1, a3);
		
		System.out.println(lista);
		
		lista.remove(1);
		
		System.out.println(lista);
		
		for (int i = 0; i < args.length; i++) {
			
		}

	}

}
