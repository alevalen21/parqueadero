package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelMoto extends JPanel {

	private JLabel etiquetaNombreConductor;
	private JLabel etiquetaCedulaConductor;
	private JLabel etiquetaMarcaMoto;
	private JLabel etiquetaCilindrajeMoto;
	private JLabel etiquetaFrenosMoto;
	private JLabel etiquetaModificacionesMoto;
	private JLabel etiquetaFrecuenciaMoto;

	private JTextField txtNombreConductor;
	private JTextField txtCedulaConductor;
	private JTextField txtMarcaMoto;
	private JTextField txtCilindrajeMoto;
	private JTextField txtFrenosMoto;
	private JTextField txtFrecuenciaMoto;

	private JComboBox<String> modificacionesMoto;

	private JButton aceptar;
	private JButton volver;
	private JButton visualizar;
	private JButton borrar;
	
	public PanelMoto() {
		Color colorfondo = new Color(230, 230, 221, 255);
		setBackground(colorfondo);
		setLayout(new GridLayout(0, 2, 5, 5));

		etiquetaNombreConductor = new JLabel("Nombre del Conductor");

		txtNombreConductor = new JTextField(5);

		etiquetaCedulaConductor = new JLabel("Número de Cédula del Conductor");

		txtCedulaConductor = new JTextField(5);

		etiquetaModificacionesMoto = new JLabel("¿Su moto tiene modificaciones?");
		modificacionesMoto = new JComboBox<>();
		modificacionesMoto.addItem("SI");
		modificacionesMoto.addItem("NO");

		etiquetaMarcaMoto = new JLabel("Marca de la moto");

		txtMarcaMoto = new JTextField(5);

		etiquetaCilindrajeMoto = new JLabel("Cilindraje de la moto");

		txtCilindrajeMoto = new JTextField(5);

		etiquetaFrenosMoto = new JLabel("Tipo de frenos");

		txtFrenosMoto = new JTextField(5);

		etiquetaFrecuenciaMoto = new JLabel("¿Con qué frecuencia usa la moto?");

		txtFrecuenciaMoto = new JTextField(5);

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
		visualizar.setActionCommand("MOSTRAR");
		visualizar.setBackground(colorboton1);
		visualizar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		visualizar.setEnabled(true);

		borrar = new JButton("Borrar");
		borrar.setActionCommand("BORRAR");
		borrar.setBackground(colorboton1);
		borrar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		borrar.setEnabled(true);

		add(etiquetaNombreConductor);
		add(txtNombreConductor);

		add(etiquetaCedulaConductor);
		add(txtCedulaConductor);

		add(etiquetaMarcaMoto);
		add(txtMarcaMoto);

		add(etiquetaCilindrajeMoto);
		add(txtCilindrajeMoto);

		add(etiquetaFrenosMoto);
		add(txtFrenosMoto);

		add(etiquetaFrecuenciaMoto);
		add(txtFrecuenciaMoto);

		add(etiquetaModificacionesMoto);
		add(modificacionesMoto);

		add(aceptar);
		add(visualizar);
		add(borrar);
		add(volver);
		
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

	public JLabel getEtiquetaMarcaMoto() {
		return etiquetaMarcaMoto;
	}

	public void setEtiquetaMarcaMoto(JLabel etiquetaMarcaMoto) {
		this.etiquetaMarcaMoto = etiquetaMarcaMoto;
	}

	public JLabel getEtiquetaCilindrajeMoto() {
		return etiquetaCilindrajeMoto;
	}

	public void setEtiquetaCilindrajeMoto(JLabel etiquetaCilindrajeMoto) {
		this.etiquetaCilindrajeMoto = etiquetaCilindrajeMoto;
	}

	public JLabel getEtiquetaFrenosMoto() {
		return etiquetaFrenosMoto;
	}

	public void setEtiquetaFrenosMoto(JLabel etiquetaFrenosMoto) {
		this.etiquetaFrenosMoto = etiquetaFrenosMoto;
	}

	public JLabel getEtiquetaModificacionesMoto() {
		return etiquetaModificacionesMoto;
	}

	public void setEtiquetaModificacionesMoto(JLabel etiquetaModificacionesMoto) {
		this.etiquetaModificacionesMoto = etiquetaModificacionesMoto;
	}

	public JLabel getEtiquetaFrecuenciaMoto() {
		return etiquetaFrecuenciaMoto;
	}

	public void setEtiquetaFrecuenciaMoto(JLabel etiquetaFrecuenciaMoto) {
		this.etiquetaFrecuenciaMoto = etiquetaFrecuenciaMoto;
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

	public JTextField getTxtMarcaMoto() {
		return txtMarcaMoto;
	}

	public void setTxtMarcaMoto(JTextField txtMarcaMoto) {
		this.txtMarcaMoto = txtMarcaMoto;
	}

	public JTextField getTxtCilindrajeMoto() {
		return txtCilindrajeMoto;
	}

	public void setTxtCilindrajeMoto(JTextField txtCilindrajeMoto) {
		this.txtCilindrajeMoto = txtCilindrajeMoto;
	}

	public JTextField getTxtFrenosMoto() {
		return txtFrenosMoto;
	}

	public void setTxtFrenosMoto(JTextField txtFrenosMoto) {
		this.txtFrenosMoto = txtFrenosMoto;
	}

	public JTextField getTxtFrecuenciaMoto() {
		return txtFrecuenciaMoto;
	}

	public void setTxtFrecuenciaMoto(JTextField txtFrecuenciaMoto) {
		this.txtFrecuenciaMoto = txtFrecuenciaMoto;
	}

	public JComboBox<String> getModificacionesMoto() {
		return modificacionesMoto;
	}

	public void setModificacionesMoto(JComboBox<String> modificacionesMoto) {
		this.modificacionesMoto = modificacionesMoto;
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
}