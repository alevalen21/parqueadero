package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
	private JButton auto;
	private JButton bicicleta;
	private JButton moto;

	public PanelPrincipal() {
		Color colorfondo = new Color(230,230,221,255);
		setBackground(colorfondo);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets.top = 10;
		gbc.ipadx = 20;
		gbc.ipady = 10;
		start(gbc);
	}

	public void start(GridBagConstraints gbc) {
		gbc.gridx = 1;
        gbc.gridy = -1;
        gbc.gridheight = 0;
		
		JButton botonSiguiente = new JButton();
		botonSiguiente.setBounds(630, 524, 40, 40);
		botonSiguiente.setContentAreaFilled(false);
		add(botonSiguiente);
		
		auto = createButton("Auto");
		auto.setActionCommand("AUTO");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        auto.setFont(new Font("Times New Roman", Font.BOLD, 16));

       
        add(auto, gbc);
        auto.setBackground(Color.LIGHT_GRAY);
	
        bicicleta = createButton("Bicicleta");
		bicicleta.setActionCommand("ACTIVARBICICLETA");
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 1; 
        add(bicicleta, gbc);
        bicicleta.setBackground(Color.LIGHT_GRAY);
        bicicleta.setFont(new Font("Times New Roman", Font.BOLD, 14));

        
        moto = createButton("Moto");
        moto.setActionCommand("MOTO");
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 2; 
        add(moto, gbc);
        moto.setBackground(Color.LIGHT_GRAY);
        moto.setFont(new Font("Times New Roman", Font.BOLD, 12));


	}

	public JButton createButton(String label) {

		JButton button = new JButton(label);
		button.setFont(new Font("Arial", Font.PLAIN, 12));
		button.setPreferredSize(new Dimension(120, 30));
		button.setFocusPainted(false);
		button.setBorderPainted(false);
		button.setOpaque(true);
		button.setActionCommand(label.toUpperCase());
		return button;

	}

	public JButton getAuto() {
		return auto;
	}

	public void setAuto(JButton auto) {
		this.auto = auto;
	}

	public JButton getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(JButton bicicleta) {
		this.bicicleta = bicicleta;
	}

	public JButton getMoto() {
		return moto;
	}

	public void setMoto(JButton moto) {
		this.moto = moto;
	}
	
}