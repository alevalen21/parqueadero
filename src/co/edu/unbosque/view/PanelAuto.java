package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelAuto extends JPanel {

	private JLabel etiquetaNombreConductor;
	private JLabel etiquetaCedulaConductor;
	private JLabel etiquetaMaximoPasajerosAuto;
	private JLabel etiquetaTipoCombustibleAuto;
	private JLabel etiquetaPlacaAuto;
	private JLabel etiquetaGPS;
	private JLabel etiquetaVelocidades;

	private JTextField txtNombreConductor;
	private JTextField txtCedulaConductor;
	private JTextField txtMaximoPasajerosAuto;
	private JTextField txtTipoCombustibleAuto;
	private JTextField txtPlacaAuto;

	private JComboBox<String> GPS;
	private JComboBox<String> velocidades;

	private JButton aceptar;
	private JButton volver;
	private JButton visualizar;
	private JButton actualizar;
	private JButton actualizarGuardarCambios;

	private JButton borrar;

	public PanelAuto() {
		Color colorfondo = new Color(230, 230, 221, 255);
		setBackground(colorfondo);
		setLayout(new GridLayout(0, 2, 5, 5));

		etiquetaNombreConductor = new JLabel("Nombre del Conductor");

		txtNombreConductor = new JTextField(5);

		etiquetaCedulaConductor = new JLabel("Número de Cédula del Conductor");

		txtCedulaConductor = new JTextField(5);

		etiquetaMaximoPasajerosAuto = new JLabel("Máximo de pasajeros del auto");

		txtMaximoPasajerosAuto = new JTextField(5);

		etiquetaTipoCombustibleAuto = new JLabel("Tipo de combustible que usa el auto");

		txtTipoCombustibleAuto = new JTextField(5);

		etiquetaPlacaAuto = new JLabel("Placa del auto");

		txtPlacaAuto = new JTextField(5);

		etiquetaGPS = new JLabel("¿Su auto tiene GPS?");
		GPS = new JComboBox<>();
		GPS.addItem("SI");
		GPS.addItem("NO");

		etiquetaVelocidades = new JLabel("¿Su auto cuenta con sistema automático de cambio de velocidades?");
		velocidades = new JComboBox<>();
		velocidades.addItem("SI");
		velocidades.addItem("NO");

		Color colorboton1 = new Color(127, 179, 213);

		aceptar = new JButton("Crear");
		aceptar.setActionCommand("ACEPTAR");
		aceptar.setBackground(colorboton1);
		aceptar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		aceptar.setEnabled(true);

		volver = new JButton("Volver");
		volver.setActionCommand("VOLVER");
		volver.setBackground(colorboton1);
		volver.setFont(new Font("Times New Roman", Font.BOLD, 20));
		volver.setEnabled(true);

		visualizar = new JButton("Mostrar Información");
		visualizar.setActionCommand("MOSTRARAUTO");
		visualizar.setBackground(colorboton1);
		visualizar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		visualizar.setEnabled(true);
		
		
		actualizar = new JButton("Actualizar");
		actualizar.setActionCommand("ACTUALIZARAUTO");
		actualizar.setBackground(colorboton1);
		actualizar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		actualizar.setEnabled(true);
		
		
		
		actualizarGuardarCambios= new JButton("Guardar Cambios");
		actualizarGuardarCambios.setActionCommand("GUARDARCAMBIOSAUTO");
		actualizarGuardarCambios.setBackground(colorboton1);
		actualizarGuardarCambios.setFont(new Font("Times New Roman", Font.BOLD, 20));
		actualizarGuardarCambios.setEnabled(true);
		actualizarGuardarCambios.setVisible(false);

		borrar = new JButton("Borrar");
		borrar.setActionCommand("BORRARAUTO");
		borrar.setBackground(colorboton1);
		borrar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		borrar.setEnabled(true);

		add(etiquetaNombreConductor);
		add(txtNombreConductor);
		
		add(etiquetaCedulaConductor);
		add(txtCedulaConductor);
		
		add(etiquetaMaximoPasajerosAuto);
		add(txtMaximoPasajerosAuto);
		
		add(etiquetaTipoCombustibleAuto);
		add(txtTipoCombustibleAuto);
		
		add(etiquetaPlacaAuto);
		add(txtPlacaAuto);

		add(etiquetaGPS);
		add(GPS);

		add(etiquetaVelocidades);
		add(velocidades);

		add(aceptar);
		add(visualizar);
		add(borrar);
		
		add(actualizar);
	
		add(volver);
		add(actualizarGuardarCambios);
	}

	public JLabel getEtiquetaNombreConductor() {
		return etiquetaNombreConductor;
	}

	public void setEtiquetaNombreConductor(JLabel etiquetaNombreConductor) {
		this.etiquetaNombreConductor = etiquetaNombreConductor;
	}

	public JLabel getEtiquetaCedulaConductor() {
		return etiquetaCedulaConductor;
	}

	public void setEtiquetaCedulaConductor(JLabel etiquetaCedulaConductor) {
		this.etiquetaCedulaConductor = etiquetaCedulaConductor;
	}

	public JLabel getEtiquetaMaximoPasajerosAuto() {
		return etiquetaMaximoPasajerosAuto;
	}

	public void setEtiquetaMaximoPasajerosAuto(JLabel etiquetaMaximoPasajerosAuto) {
		this.etiquetaMaximoPasajerosAuto = etiquetaMaximoPasajerosAuto;
	}

	public JLabel getEtiquetaTipoCombustibleAuto() {
		return etiquetaTipoCombustibleAuto;
	}

	public void setEtiquetaTipoCombustibleAuto(JLabel etiquetaTipoCombustibleAuto) {
		this.etiquetaTipoCombustibleAuto = etiquetaTipoCombustibleAuto;
	}

	public JLabel getEtiquetaPlacaAuto() {
		return etiquetaPlacaAuto;
	}

	public void setEtiquetaPlacaAuto(JLabel etiquetaPlacaAuto) {
		this.etiquetaPlacaAuto = etiquetaPlacaAuto;
	}

	public JLabel getEtiquetaGPS() {
		return etiquetaGPS;
	}

	public void setEtiquetaGPS(JLabel etiquetaGPS) {
		this.etiquetaGPS = etiquetaGPS;
	}

	public JLabel getEtiquetaVelocidades() {
		return etiquetaVelocidades;
	}

	public void setEtiquetaVelocidades(JLabel etiquetaVelocidades) {
		this.etiquetaVelocidades = etiquetaVelocidades;
	}

	public JTextField getTxtNombreConductor() {
		return txtNombreConductor;
	}

	public void setTxtNombreConductor(JTextField txtNombreConductor) {
		this.txtNombreConductor = txtNombreConductor;
	}

	public JTextField getTxtCedulaConductor() {
		return txtCedulaConductor;
	}

	public void setTxtCedulaConductor(JTextField txtCedulaConductor) {
		this.txtCedulaConductor = txtCedulaConductor;
	}

	public JTextField getTxtMaximoPasajerosAuto() {
		return txtMaximoPasajerosAuto;
	}

	public void setTxtMaximoPasajerosAuto(JTextField txtMaximoPasajerosAuto) {
		this.txtMaximoPasajerosAuto = txtMaximoPasajerosAuto;
	}

	public JTextField getTxtTipoCombustibleAuto() {
		return txtTipoCombustibleAuto;
	}

	public void setTxtTipoCombustibleAuto(JTextField txtTipoCombustibleAuto) {
		this.txtTipoCombustibleAuto = txtTipoCombustibleAuto;
	}

	public JTextField getTxtPlacaAuto() {
		return txtPlacaAuto;
	}

	public void setTxtPlacaAuto(JTextField txtPlacaAuto) {
		this.txtPlacaAuto = txtPlacaAuto;
	}

	public JComboBox<String> getGPS() {
		return GPS;
	}

	public void setGPS(JComboBox<String> gPS) {
		GPS = gPS;
	}

	public JComboBox<String> getVelocidades() {
		return velocidades;
	}

	public void setVelocidades(JComboBox<String> velocidades) {
		this.velocidades = velocidades;
	}

	public JButton getAceptar() {
		return aceptar;
	}

	public void setAceptar(JButton aceptar) {
		this.aceptar = aceptar;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public JButton getVisualizar() {
		return visualizar;
	}

	public void setVisualizar(JButton visualizar) {
		this.visualizar = visualizar;
	}

	public JButton getBorrar() {
		return borrar;
	}

	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}

	public JButton getActualizar() {
		return actualizar;
	}

	public void setActualizar(JButton actualizar) {
		this.actualizar = actualizar;
	}

	public JButton getActualizarGuardarCambios() {
		return actualizarGuardarCambios;
	}

	public void setActualizarGuardarCambios(JButton actualizarGuardarCambios) {
		this.actualizarGuardarCambios = actualizarGuardarCambios;
	}

	
	
	
}