package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.MotoDTO;
import co.edu.unbosque.util.estructures.MyLinkedList;

public class MotoDAO implements CRUDOperation<MotoDTO> {
	private MyLinkedList<MotoDTO> listaMotos;

	public MotoDAO() {
		listaMotos = new MyLinkedList<>();
	}

	@Override
	public void create(MotoDTO newData) {
		listaMotos.add(newData);
	}

	@Override
	public int delete(int index) {
		if (index < 0 || index >= listaMotos.size()) {
			return 0;
		} else {
			listaMotos.extract(index);
			return 1;
		}
	}

	@Override
	public int update(int index, MotoDTO newData) {
		if (index < 0 || index >= listaMotos.size()) {
			return 0;
		} else {
			listaMotos.get(index).setInfo(newData);
			return 1;
		}
	}

	@Override
	public String print() {
		return listaMotos.print();
	}
}
