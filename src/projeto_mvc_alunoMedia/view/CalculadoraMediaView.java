package projeto_mvc_alunoMedia.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraMediaView extends JFrame {
		private JTextField nota1 = new JTextField(10);
		private JLabel rotuloSomar = new JLabel("+");
		private JTextField nota2 = new JTextField(10);
		private JTextField nota3 = new JTextField(10);
		private JTextField nota4 = new JTextField(10);				
		private JButton botaoCalcular = new JButton("Calcular");
		private JTextField Resultado = new JTextField(20);

	//construtor
		public CalculadoraMediaView() {
			JPanel calcPanel = new JPanel();
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(600, 200);
			calcPanel.add(nota1);
			calcPanel.add(rotuloSomar);
			calcPanel.add(nota2);
			calcPanel.add(nota3);
			calcPanel.add(nota4);
			calcPanel.add(botaoCalcular);
			calcPanel.add(Resultado);
			this.add(calcPanel);
		}
		// Set e Get

		public int getNota1() {
			return Integer.parseInt(nota1.getText());
		}

		public int getNota2() {
			return Integer.parseInt(nota2.getText());
		}
		public int getNota3() {
			return Integer.parseInt(nota3.getText());
		}
		public int getNota4() {
			return Integer.parseInt(nota4.getText());
		}
		public int Resultado() {
			return Integer.parseInt(Resultado.getText());
		}

		public void setResultado(int solution) {
			Resultado.setText(Integer.toString(solution));
		}

		// ActionListenner , responsável pelo evento do botão
		public void CalculadoraListener(ActionListener eventoBotaoCacular) {
			botaoCalcular.addActionListener(eventoBotaoCacular);
		}

		public void displayErroMessage(String mesagemErro) {
			JOptionPane.showMessageDialog(this, mesagemErro);
		}
	}