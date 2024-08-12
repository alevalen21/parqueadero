package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.AutoDTO;
import co.edu.unbosque.model.BicicletaDTO;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.MotoDTO;
import co.edu.unbosque.view.FrameAuto;
import co.edu.unbosque.view.FrameBicicleta;
import co.edu.unbosque.view.View;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {
	private ModelFacade mf;
	private ViewFacade vf;
	private View view;
	private FrameAuto frameAuto;
	private FrameBicicleta frameBicicleta;

	public Controller() {

		mf = new ModelFacade();
		vf = new ViewFacade();
		view = new View();
		frameAuto = new FrameAuto();
		frameBicicleta = new FrameBicicleta();
		asignarOyentes();

	}

	public void asignarOyentes() {
		view.getPanelPrincipal().getAuto().addActionListener(this);
		view.getPanelPrincipal().getBicicleta().addActionListener(this);
		frameAuto.getPanelAuto().getAceptar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("AUTO")) {
			frameAuto.setVisible(true);
			view.setVisible(false);
		}
		if (e.getActionCommand().equals("BICICLETA")) {
			frameBicicleta.setVisible(true);
			view.setVisible(false);
		}
		if (e.getActionCommand().equals("ACEPTAR")) {

			String nombre = frameAuto.getPanelAuto().getTxtNombreConductor().getText();

			if (nombre.replaceAll(" ", "").equals("")) {
				view.mostrarError("El nombre no puede ir vacio");
			} else {
				try {
					long cedula = Long.parseLong(frameAuto.getPanelAuto().getTxtCedulaConductor().getText());

					if (!frameAuto.getPanelAuto().getTxtMaximoPasajerosAuto().getText().replaceAll(" ", "")
							.equals("")) {
						if (frameAuto.getPanelAuto().getTxtMaximoPasajerosAuto().getText().matches("[0-9]")) {
							int capacidad = Integer
									.parseInt(frameAuto.getPanelAuto().getTxtMaximoPasajerosAuto().getText());
							String combustible = frameAuto.getPanelAuto().getTxtTipoCombustibleAuto().getText();
							if (!combustible.replaceAll(" ", "").equals("")) {

								String placa = frameAuto.getPanelAuto().getTxtPlacaAuto().getText();
								if (!placa.replaceAll(" ", "").equals("")) {
									boolean gps = false;
									boolean cambios = false;
									if (frameAuto.getPanelAuto().getGPS().getSelectedItem().toString().equals("SI")) {
										gps = true;
									}
									if (frameAuto.getPanelAuto().getVelocidades().getSelectedItem().toString()
											.equals("SI")) {
										cambios = true;
									}
									mf.getAutoDao().create(
											new AutoDTO(nombre, cedula, capacidad, combustible, placa, gps, cambios));

									view.mostrarMensaje("Auto creado exitosamente");

									// Limpiar campos
									frameAuto.getPanelAuto().getTxtNombreConductor().setText("");
									frameAuto.getPanelAuto().getTxtCedulaConductor().setText("");
									frameAuto.getPanelAuto().getTxtMaximoPasajerosAuto().setText("");
									frameAuto.getPanelAuto().getTxtTipoCombustibleAuto().setText("");
									frameAuto.getPanelAuto().getTxtPlacaAuto().setText("");
								} else {
									view.mostrarError("Debes colocar una placa");

								}

							} else {
								view.mostrarError("El combustible está vacio");
							}

						} else {
							view.mostrarError("Número no valido de capacidad");
						}
					} else {
						view.mostrarError("La capacidad está vacia");
					}

				} catch (Exception err) {
					// TODO: handle exception
					view.mostrarError("la cédula no es valida");
				}
			}
			// menuOpcionesAuto();
		}

	}

	public void menuOpcionesAuto() {
		autoloop: while (true) {
			vf.getCon().imprimirTexto(" --- Bienvenido al Menu de Autos --- ");
			vf.getCon().imprimirTexto(
					"1) Crear Auto \n2) Eliminar Auto \n3) Actualizar Auto \n4) Mostrar Autos \n5) Salir");
			int opcionAuto = vf.getCon().leerEntero();

			switch (opcionAuto) {

			case 1: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Crear Auto --- ");
				vf.getCon().imprimirTexto("Ingresa el nombre del conductor: ");
				String nombre = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el número de cédula del conductor: ");
				long cedula = vf.getCon().leerLong();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Ingresa el máximo de pasajeros del auto: ");
				int capacidad = vf.getCon().leerEntero();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Ingresa el tipo de combustible que usa el auto: ");
				String combustible = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa la placa del auto: ");
				String placa = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("¿Su auto tiene GPS? ");
				boolean tieneGPS = vf.getCon().leerBoolean();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("¿Su auto cuenta con sistema automático de cambio de velocidades? ");
				boolean esAutomatico = vf.getCon().leerBoolean();
				vf.getCon().quemarLinea();

				mf.getAutoDao()
						.create(new AutoDTO(nombre, cedula, capacidad, combustible, placa, tieneGPS, esAutomatico));
				vf.getCon().imprimirTexto("Auto creado exitosamente");
				break;
			}
			case 2: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Eliminar Auto --- ");
				vf.getCon().imprimirTexto("Ingresa la posición del auto a eliminar: ");
				int posEliminarAuto = vf.getCon().leerEntero();
				vf.getCon().quemarLinea();

				mf.getAutoDao().delete(posEliminarAuto);
				vf.getCon().imprimirTexto("Auto eliminado exitosamente");
				break;
			}
			case 3: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Actualizar Auto --- ");
				vf.getCon().imprimirTexto("Ingresa la posición del auto a actualizar: ");
				int posAuto = vf.getCon().leerEntero();
				vf.getCon().quemarLinea();

				vf.getCon().imprimirTexto("Ingresa el nuevo nombre del conductor: ");
				String newNombre = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el nuevo número de cédula del conductor: ");
				long newCedula = vf.getCon().leerLong();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Ingresa el nuevo máximo de pasajeros del auto: ");
				int newCapacidad = vf.getCon().leerEntero();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Ingresa el nuevo tipo de combustible que usa el auto: ");
				String newCombustible = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa la nueva placa del auto: ");
				String newPlaca = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("¿Su auto tiene GPS? ");
				boolean newTieneGPS = vf.getCon().leerBoolean();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("¿Su auto cuenta con sistema automático de cambio de velocidades? ");
				boolean newEsAutomatico = vf.getCon().leerBoolean();
				vf.getCon().quemarLinea();

				mf.getAutoDao().update(posAuto, new AutoDTO(newNombre, newCedula, newCapacidad, newCombustible,
						newPlaca, newTieneGPS, newEsAutomatico));
				vf.getCon().imprimirTexto("Auto actualizado exitosamente");
				break;
			}
			case 4: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Mostrar Autos --- ");
				vf.getCon().imprimirTexto(mf.getAutoDao().print());
				break;
			}
			case 5: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Volviendo al Menú Principal");
				break autoloop;
			}
			}
		}
	}

	public void menuOpcionesMoto() {
		motoloop: while (true) {
			vf.getCon().imprimirTexto(" --- Bienvenido al Menu de Motos --- ");
			vf.getCon().imprimirTexto(
					"1) Crear Moto \n2) Eliminar Moto \n3) Actualizar Moto \n4) Mostrar Motos \n5) Salir");
			int opcionMoto = vf.getCon().leerEntero();

			switch (opcionMoto) {
			case 1: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Crear Moto --- ");
				vf.getCon().imprimirTexto("Ingresa el nombre del conductor: ");
				String nombre = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el número de cédula del conductor: ");
				long cedula = vf.getCon().leerLong();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Ingresa la marca de la moto: ");
				String marca = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el cilindraje de la moto: ");
				int cilindraje = vf.getCon().leerEntero();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Ingresa el tipo de frenos de la moto: ");
				String tipoFrenos = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("¿Le ha hecho modificaciones a la moto? ");
				boolean modificaciones = vf.getCon().leerBoolean();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("¿Qué tan frecuente usa la moto? ");
				String frecuencia = vf.getCon().leerFrase();
				mf.getMotoDao()
						.create(new MotoDTO(nombre, cedula, marca, cilindraje, tipoFrenos, modificaciones, frecuencia));
				vf.getCon().imprimirTexto("Moto creada exitosamente");
				break;
			}
			case 2: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Eliminar Moto --- ");
				vf.getCon().imprimirTexto("Ingresa la posición de la moto a eliminar: ");
				int posEliminarMoto = vf.getCon().leerEntero();
				vf.getCon().quemarLinea();

				mf.getMotoDao().delete(posEliminarMoto);
				vf.getCon().imprimirTexto("Moto eliminada exitosamente");
				break;
			}
			case 3: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Actualizar Moto --- ");
				vf.getCon().imprimirTexto("Ingresa la posición de la moto a actualizar: ");
				int posMoto = vf.getCon().leerEntero();
				vf.getCon().quemarLinea();

				vf.getCon().imprimirTexto("Ingresa el nuevo nombre del conductor: ");
				String newNombre = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el nuevo número de cédula del conductor: ");
				long newCedula = vf.getCon().leerLong();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Ingresa la nueva marca de la moto: ");
				String newMarca = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el nuevo cilindraje de la moto: ");
				int newCilindraje = vf.getCon().leerEntero();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Ingresa el nuevo tipo de frenos de la moto: ");
				String newTipoFrenos = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("¿Le ha hecho modificaciones a la moto? ");
				boolean newModificaciones = vf.getCon().leerBoolean();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("¿Qué tan frecuente usa la moto? ");
				String newFrecuencia = vf.getCon().leerFrase();

				mf.getMotoDao().update(posMoto, new MotoDTO(newNombre, newCedula, newMarca, newCilindraje,
						newTipoFrenos, newModificaciones, newFrecuencia));
				vf.getCon().imprimirTexto("Moto actualizada exitosamente");
				break;
			}
			case 4: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Mostrar Motos --- ");
				vf.getCon().imprimirTexto(mf.getMotoDao().print());
				break;
			}
			case 5: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Volviendo al Menú Principal");
				break motoloop;
			}
			}
		}
	}

	public void menuOpcionesBici() {
		biciloop: while (true) {
			vf.getCon().imprimirTexto(" --- Bienvenido al Menu de Bicicletas --- ");
			vf.getCon().imprimirTexto(
					"1) Crear Bicicleta \n2) Eliminar Bicicleta \n3) Actualizar Bicicleta \n4) Mostrar Bicicletas \n5) Salir");
			int opcionBici = vf.getCon().leerEntero();

			switch (opcionBici) {
			case 1: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Crear Bicicleta --- ");
				vf.getCon().imprimirTexto("Ingresa el nombre del conductor: ");
				String nombre = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el número de cédula del conductor: ");
				long cedula = vf.getCon().leerLong();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("¿Su bicicleta tiene cambio de velocidades? ");
				boolean velocidades = vf.getCon().leerBoolean();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Ingresa el color de la bicicleta: ");
				String color = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el tipo de la bicicleta: ");
				String tipo = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el material de la bicicleta: ");
				String material = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el tipo de suspension de la bicicleta: ");
				String tipoSuspension = vf.getCon().leerFrase();

				mf.getBiciDao()
						.create(new BicicletaDTO(nombre, cedula, velocidades, color, tipo, material, tipoSuspension));
				vf.getCon().imprimirTexto("Bicicleta creada exitosamente");
				break;
			}
			case 2: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Eliminar Bicicleta --- ");
				vf.getCon().imprimirTexto("Ingresa la posición de la bicicleta a eliminar: ");
				int posEliminarBici = vf.getCon().leerEntero();
				vf.getCon().quemarLinea();

				mf.getBiciDao().delete(posEliminarBici);
				vf.getCon().imprimirTexto("Bicicleta eliminada exitosamente");
				break;
			}
			case 3: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Actualizar Bicicleta --- ");
				vf.getCon().imprimirTexto("Ingresa la posición de la bicicleta a actualizar: ");
				int posBici = vf.getCon().leerEntero();
				vf.getCon().quemarLinea();

				vf.getCon().imprimirTexto("Ingresa el nuevo nombre del conductor: ");
				String newNombre = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el nuevo número de cédula del conductor: ");
				long newCedula = vf.getCon().leerLong();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("¿Su bicicleta tiene cambio de velocidades? ");
				boolean newVelocidades = vf.getCon().leerBoolean();
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Ingresa el nuevo color de la bicicleta: ");
				String newColor = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el nuevo tipo de la bicicleta: ");
				String newTipo = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el nuevo material de la bicicleta: ");
				String newMaterial = vf.getCon().leerFrase();
				vf.getCon().imprimirTexto("Ingresa el nuevo tipo de suspension de la bicicleta: ");
				String newTipoSuspension = vf.getCon().leerFrase();

				mf.getBiciDao().update(posBici, new BicicletaDTO(newNombre, newCedula, newVelocidades, newColor,
						newTipo, newMaterial, newTipoSuspension));
				vf.getCon().imprimirTexto("Bicicleta actualizada exitosamente");
				break;
			}
			case 4: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto(" --- Mostrar Bicicletas --- ");
				vf.getCon().imprimirTexto(mf.getBiciDao().print());
				break;
			}
			case 5: {
				vf.getCon().quemarLinea();
				vf.getCon().imprimirTexto("Volviendo al Menú Principal");
				break biciloop;
			}
			}
		}
	}

	public void run() {

		mainloop: while (true) {
			vf.getCon().imprimirTexto("Bienvenido: ");
			vf.getCon().imprimirTexto("1) Autos \n2) Motos \n3) Bicicletas \n4) Salir");
			int opcion = vf.getCon().leerEntero();

			switch (opcion) {

			case 1: {

				break;
			}
			case 2: {
				menuOpcionesMoto();
				break;
			}
			case 3: {
				menuOpcionesBici();
				break;
			}
			case 4: {
				vf.getCon().imprimirTexto("Gracias por usar, hasta luego :D");
				break mainloop;
			}
			}
		}
	}
}
