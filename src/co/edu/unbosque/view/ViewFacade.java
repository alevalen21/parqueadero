package co.edu.unbosque.view;

public class ViewFacade {
	Console con;

	public ViewFacade() {
		con = new Console();
	}

	public Console getCon() {
		return con;
	}

	public void setCon(Console con) {
		this.con = con;
	}

}
