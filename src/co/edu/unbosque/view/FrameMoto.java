package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class FrameMoto extends JFrame   {

	private PanelMoto panelMoto;

	public FrameMoto () {
		setTitle(" --- Bienvenido al Menu de Motos --- ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout());
		panelMoto= new PanelMoto();
		add(panelMoto);
		this.setVisible(false);
	}

	private void add(PanelMoto panelAuto2, String center) {
		
	}

	public PanelMoto getPanelMoto() {
		return panelMoto;
	}

	public void setPanelMoto(PanelMoto panelMoto) {
		this.panelMoto = panelMoto;
	}

	

	
}