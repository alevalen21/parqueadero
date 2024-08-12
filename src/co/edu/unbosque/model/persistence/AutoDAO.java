package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.AutoDTO;
import co.edu.unbosque.util.estructures.MyLinkedList;

public class AutoDAO implements CRUDOperation<AutoDTO> {
	private MyLinkedList<AutoDTO> listaAutos;

	public AutoDAO() {
		listaAutos = new MyLinkedList<>();
	}

	@Override
	public void create(AutoDTO newData) {
		listaAutos.add(newData);
	}

	@Override
	public int delete(int index) {
		if (index < 0 || index >= listaAutos.size()) {
			return 0;
		} else {
			listaAutos.extract(index);
			return 1;
		}
	}

	@Override
	public int update(int index, AutoDTO newData) {
		if (index < 0 || index >= listaAutos.size()) {
			return 0;
		} else {
			listaAutos.get(index).setInfo(newData);
			return 1;
		}
	}

	@Override
	public String print() {
		return listaAutos.print();
	}

	public MyLinkedList<AutoDTO> getListaAutos() {
		return listaAutos;
	}

	public void setListaAutos(MyLinkedList<AutoDTO> listaAutos) {
		this.listaAutos = listaAutos;
	}

	
	
	
}
