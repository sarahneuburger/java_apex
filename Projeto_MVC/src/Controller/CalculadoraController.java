package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.CalculadoraModel;
import View.CalculadoraView;

public class CalculadoraController {
	
	private CalculadoraModel model;
	private CalculadoraView view;

	
	public CalculadoraController(CalculadoraModel model, CalculadoraView view) {
		this.model = model;
		this.view = view;
		this.view.CalculadoraListener(new CalculadoraListener());
	}
	
	
	class CalculadoraListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int numero1, numero2 = 0;
			
			numero1 = view.getNumero1();
			numero2 = view.getNumero2();
			
			model.somar(numero1, numero2);
			
			view.setResultado(model.retornaResultado());
			
		}
		
	}
	
	
	

}
