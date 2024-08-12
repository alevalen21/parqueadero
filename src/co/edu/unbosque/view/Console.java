package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	Scanner sc = new Scanner(System.in);

	public int leerEntero() {
		return sc.nextInt();
	}

	public long leerLong() {
		return sc.nextLong();
	}

	public boolean leerBoolean() {
		String dato = sc.nextLine().toLowerCase();
		if (dato.equals("si")) {
			return true;
		} else {
			return false;
		}
	}

	public String leerFrase() {
		return sc.nextLine();
	}

	public void quemarLinea() {
		sc.nextLine();
	}

	public void imprimirTexto(String dato) {
		System.out.println(dato);
	}

}
