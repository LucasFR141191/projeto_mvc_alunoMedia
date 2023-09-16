package projeto_mvc_alunoMedia.model;

public class CalculadoraMediaModel {
	// Reponsáveç pro obter o valor do cálculo
	private int resultado;

	// realizar o cálculo de soma
	public void somar(int nota1, int nota2, int nota3, int nota4) {
		this.resultado = (nota1 + nota2 + nota3 + nota4) /4 ;
	}

	// exibir o cálculo
	public int retornarResultado() {
		return resultado;
	}
}
