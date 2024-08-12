package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelBicicleta extends JPanel {

	private JLabel etiquetaNombreConductor;
	private JLabel etiquetaCedulaConductor;
	private JLabel etiquetaCambioVelocidades;
	private JLabel etiquetaColorBicicleta;
	private JLabel etiquetaTipoBicicleta;
	private JLabel etiquetaMaterialBicicleta;
	private JLabel etiquetaTipoSuspensionBicicleta;

	private JTextField txtNombreConductor;
	private JTextField txtCedulaConductor;
	private JTextField txtColorBicicleta;
	private JTextField txtTipoBicicleta;
	private JTextField txtMaterialBicicleta;
	private JTextField txtTipoSuspensionBicicleta;

	private JComboBox<String> cambioVelocidades;

	private JButton aceptar;
	private JButton volver;
	private JButton visualizar;
	private JButton borrar;

	public PanelBicicleta() {
		Color colorfondo = new Color(230, 230, 221, 255);
		setBackground(colorfondo);
		setLayout(new GridLayout(0, 2, 5, 5));

		etiquetaNombreConductor = new JLabel("Nombre del Conductor");

		txtNombreConductor = new JTextField(5);

		etiquetaCedulaConductor = new JLabel("Número de Cédula del Conductor");

		txtCedulaConductor = new JTextField(5);

		etiquetaCambioVelocidades = new JLabel("¿Su bicicleta tiene cambio de velocidades?");
		cambioVelocidades = new JComboBox<>();
		cambioVelocidades.addItem("SI");
		cambioVelocidades.addItem("NO");

		etiquetaColorBicicleta = new JLabel("Color de la bicicleta");

		txtColorBicicleta = new JTextField(5);

		etiquetaTipoBicicleta = new JLabel("Tipo de la bicicleta");

		txtTipoBicicleta = new JTextField(5);
		
		etiquetaMaterialBicicleta = new JLabel("Material de la bicicleta");

		txtMaterialBicicleta = new JTextField(5);
		
		etiquetaTipoSuspensionBicicleta = new JLabel("Tipo de suspensión de la bicicleta");

		txtTipoSuspensionBicicleta = new JTextField(5);

	
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
		visualizar.setActionCommand("MOSTRAREMISORA");
		visualizar.setBackground(colorboton1);
		visualizar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		visualizar.setEnabled(true);

		borrar = new JButton("Borrar");
		borrar.setActionCommand("BORRAREMISORA");
		borrar.setBackground(colorboton1);
		borrar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		borrar.setEnabled(true);

		add(etiquetaNombreConductor);
		add(txtNombreConductor);
		
		add(etiquetaCedulaConductor);
		add(txtCedulaConductor);
		
		add(etiquetaCambioVelocidades);
		add(cambioVelocidades);
		
		add(etiquetaColorBicicleta);
		add(txtColorBicicleta);
		
		add(etiquetaTipoBicicleta);
		add(txtTipoBicicleta);

		add(etiquetaMaterialBicicleta);
		add(txtMaterialBicicleta);

		add(etiquetaTipoSuspensionBicicleta);
		add(txtTipoSuspensionBicicleta);

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

	public JLabel getEtiquetaCambioVelocidades() {
		return etiquetaCambioVelocidades;
	}

	public void setEtiquetaCambioVelocidades(JLabel etiquetaCambioVelocidades) {
		this.etiquetaCambioVelocidades = etiquetaCambioVelocidades;
	}

	public JLabel getEtiquetaColorBicicleta() {
		return etiquetaColorBicicleta;
	}

	public void setEtiquetaColorBicicleta(JLabel etiquetaColorBicicleta) {
		this.etiquetaColorBicicleta = etiquetaColorBicicleta;
	}

	public JLabel getEtiquetaTipoBicicleta() {
		return etiquetaTipoBicicleta;
	}

	public void setEtiquetaTipoBicicleta(JLabel etiquetaTipoBicicleta) {
		this.etiquetaTipoBicicleta = etiquetaTipoBicicleta;
	}

	public JLabel getEtiquetaMaterialBicicleta() {
		return etiquetaMaterialBicicleta;
	}

	public void setEtiquetaMaterialBicicleta(JLabel etiquetaMaterialBicicleta) {
		this.etiquetaMaterialBicicleta = etiquetaMaterialBicicleta;
	}

	public JLabel getEtiquetaTipoSuspensionBicicleta() {
		return etiquetaTipoSuspensionBicicleta;
	}

	public void setEtiquetaTipoSuspensionBicicleta(JLabel etiquetaTipoSuspensionBicicleta) {
		this.etiquetaTipoSuspensionBicicleta = etiquetaTipoSuspensionBicicleta;
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

	public JTextField getTxtColorBicicleta() {
		return txtColorBicicleta;
	}

	public void setTxtColorBicicleta(JTextField txtColorBicicleta) {
		this.txtColorBicicleta = txtColorBicicleta;
	}

	public JTextField getTxtTipoBicicleta() {
		return txtTipoBicicleta;
	}

	public void setTxtTipoBicicleta(JTextField txtTipoBicicleta) {
		this.txtTipoBicicleta = txtTipoBicicleta;
	}

	public JTextField getTxtMaterialBicicleta() {
		return txtMaterialBicicleta;
	}

	public void setTxtMaterialBicicleta(JTextField txtMaterialBicicleta) {
		this.txtMaterialBicicleta = txtMaterialBicicleta;
	}

	public JTextField getTxtTipoSuspensionBicicleta() {
		return txtTipoSuspensionBicicleta;
	}

	public void setTxtTipoSuspensionBicicleta(JTextField txtTipoSuspensionBicicleta) {
		this.txtTipoSuspensionBicicleta = txtTipoSuspensionBicicleta;
	}

	public JComboBox<String> getCambioVelocidades() {
		return cambioVelocidades;
	}

	public void setCambioVelocidades(JComboBox<String> cambioVelocidades) {
		this.cambioVelocidades = cambioVelocidades;
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