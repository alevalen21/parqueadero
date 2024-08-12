package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class FrameAuto extends JFrame   {

	private PanelAuto panelAuto;

	public FrameAuto () {
		setTitle(" --- Bienvenido al Menu de Autos --- ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout());
		panelAuto= new PanelAuto();
		add(panelAuto);
		this.setVisible(false);
	}

	public PanelAuto getPanelAuto() {
		return panelAuto;
	}

	public void setPanelAuto(PanelAuto panelAuto) {
		this.panelAuto = panelAuto;
	}


	
}