package projeto_mvc_alunoMedia.comtroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projeto_mvc_alunoMedia.model.CalculadoraMediaModel;
import projeto_mvc_alunoMedia.view.CalculadoraMediaView;


public class CalculadoraMediaController {
	// Objetos das classes View Model
	private CalculadoraMediaView view;
	private CalculadoraMediaModel model;

	// contrutor
	public CalculadoraMediaController(CalculadoraMediaView view, CalculadoraMediaModel model) {
		this.view = view;
		this.model = model;
		// Implementar um ouvinte para o botão de view
		this.view.CalculadoraListener(new CalculadoraListener());
	}

	// calsse ouinte (Listener), quendo o botão for clicado
	class CalculadoraListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// variáveis locais
			int nota1, nota2, nota3,nota4 = 0;
			// tentativa
			try {
				nota1 = view.getNota1();
				nota2 = view.getNota2();
				nota3 = view.getNota3();
				nota4 = view.getNota4();
				model.somar(nota1, nota2,nota3,nota4);
				view.setResultado(model.retornarResultado());
				if (model.retornarResultado()>=6) {
					view.displayErroMessage("Aluno Aprovado! ");
				} else {
					
						view.displayErroMessage("Aluno Reprovado!!");

				}
			} catch (NumberFormatException ex) {
				view.displayErroMessage("informe dois números inteiros.");
			}
		}

	}
}
