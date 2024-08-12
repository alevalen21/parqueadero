package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class FrameBicicleta extends JFrame   {

	private PanelBicicleta panelBicicleta;

	public FrameBicicleta () {
		setTitle("  --- Bienvenido al Menu de Bicicletas --- ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout());
		panelBicicleta= new PanelBicicleta();
		add(panelBicicleta);
		this.setVisible(false);
	}
	



	public PanelBicicleta getPanelBicicleta() {
		return panelBicicleta;
	}



	public void setPanelBicicleta(PanelBicicleta panelBicicleta) {
		this.panelBicicleta = panelBicicleta;
	}




	
}