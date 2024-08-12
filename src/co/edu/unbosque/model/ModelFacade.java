package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.AutoDAO;
import co.edu.unbosque.model.persistence.BicicletaDAO;
import co.edu.unbosque.model.persistence.MotoDAO;

public class ModelFacade {
	AutoDAO autoDao;
	MotoDAO motoDao;
	BicicletaDAO biciDao;

	public ModelFacade() {
		autoDao = new AutoDAO();
		motoDao = new MotoDAO();
		biciDao = new BicicletaDAO();
	}

	public AutoDAO getAutoDao() {
		return autoDao;
	}

	public void setAutoDao(AutoDAO autoDao) {
		this.autoDao = autoDao;
	}

	public MotoDAO getMotoDao() {
		return motoDao;
	}

	public void setMotoDao(MotoDAO motoDao) {
		this.motoDao = motoDao;
	}

	public BicicletaDAO getBiciDao() {
		return biciDao;
	}

	public void setBiciDao(BicicletaDAO biciDao) {
		this.biciDao = biciDao;
	}

}
