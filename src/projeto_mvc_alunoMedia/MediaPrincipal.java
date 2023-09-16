package projeto_mvc_alunoMedia;

import projeto_mvc_alunoMedia.comtroller.CalculadoraMediaController;
import projeto_mvc_alunoMedia.model.CalculadoraMediaModel;
import projeto_mvc_alunoMedia.view.CalculadoraMediaView;

public class MediaPrincipal {

	public static void main(String[] args) {
		CalculadoraMediaView view = new CalculadoraMediaView();
	    CalculadoraMediaModel  model = new CalculadoraMediaModel ();
	    CalculadoraMediaController controller = new CalculadoraMediaController(view,model);
		
		//exibir o formulario
		view.setVisible(true);

	}

}
