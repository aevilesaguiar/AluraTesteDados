package testeProdutos;

import java.util.Arrays;
import java.util.Objects;

public class MetodosProduto {

	private Produto[] produto = new Produto[10];

	private Integer qtdeTotal = 0;

	public MetodosProduto() {
		super();

	}

	public MetodosProduto(Produto[] produto) {
		super();
		this.produto = produto;
	}

	// ADICIONA NO FINAL
	public void adiciona(Produto produto) {

		this.produto[qtdeTotal] = produto;
		qtdeTotal++;

	}

	// ADICIONAR EM QUALQUER LUGAR

	public void adiciona(int posicao, Produto produto) {
		for (int i = qtdeTotal; i >= posicao; i -= 1) {

			this.produto[i + 1] = this.produto[i];
		}

		this.produto[posicao] = produto;
		qtdeTotal++;

	}

//verifica se a posiçãoestá ocupada

	private boolean posicaoOcupada(int posicao) {
		
		return posicao>=0 && posicao< qtdeTotal;
	}
	


	@Override
	public String toString() {
		return "MetodosProduto [produto=" + Arrays.toString(produto) + ", qtdeTotal=" + qtdeTotal + "]";
	}

}
