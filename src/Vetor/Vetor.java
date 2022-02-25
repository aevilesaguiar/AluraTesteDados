package Vetor;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[10];
	private int totalDeAlunos = 0;

	public Vetor() {
		super();

	}

	public Vetor(Aluno[] alunos) {
		super();
		this.alunos = alunos;
	}
	
	//método que verifica se uma posição é válida ou não
	private boolean posicaoValida(int posicao) {
		return posicao>= 0 && posicao<= totalDeAlunos;
	}
	
	private void garanteEspaco() {
		if(totalDeAlunos==alunos.length) {
			Aluno[] novoArray = new Aluno[alunos.length*2];
			for (int i = 0; i < novoArray.length; i++) {
				novoArray[i]=alunos[i];
			}
			this.alunos=novoArray;
			}
	}
	
	// adiciona em qualquer posição

	public void adiciona(int posicao, Aluno aluno) {
		
		this.garanteEspaco();
		
		if(!posicaoValida(posicao)) {
			throw new IllegalArgumentException("posição Inválida");
		}
		
		for (int i = totalDeAlunos-1; i >= posicao; i-=1) {
			alunos[i+1]=alunos[i];	
		}
		alunos[posicao]=aluno;
		totalDeAlunos++;
	}

//adiciona no fim da lista
	public void adicionaAluno(Aluno aluno) {
		this.garanteEspaco();

		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;

	}

	// método auxiliar diz se a posição está ocupada ou não

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}

	public Aluno alunoPega(int posicao) {

		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posição Inválida");
		}

		return alunos[posicao];
	}

	public void remove(int posicao) {
		
		for (int i = posicao; i < totalDeAlunos; i++) {
			this.alunos[i]=this.alunos[i+1];
		}
		totalDeAlunos--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < totalDeAlunos; i++) {// ao inves de .length vai até total de alunos
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return totalDeAlunos;
	}

	@Override
	public String toString() {
		return "Vetor [alunos=" + Arrays.toString(alunos) + "]";
	}

}
