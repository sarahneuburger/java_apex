package Principal;

import Controller.CalculadoraController;
import Model.CalculadoraModel;
import View.CalculadoraView;

public class Principal {
	
	public static void main(String[] args) {
		
		CalculadoraView view = new CalculadoraView();
		
		CalculadoraModel model = new CalculadoraModel();
		
		CalculadoraController controller = new CalculadoraController(model, view);
		
		view.setVisible(true);
		
	}

}
