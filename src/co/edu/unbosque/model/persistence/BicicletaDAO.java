package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.BicicletaDTO;
import co.edu.unbosque.util.estructures.MyLinkedList;

public class BicicletaDAO implements CRUDOperation<BicicletaDTO> {
	private MyLinkedList<BicicletaDTO> listaBicis;

	public BicicletaDAO() {
		listaBicis = new MyLinkedList<>();
	}

	@Override
	public void create(BicicletaDTO newData) {
		listaBicis.add(newData);
	}

	@Override
	public int delete(int index) {
		if (index < 0 || index >= listaBicis.size()) {
			return 0;
		} else {
			listaBicis.extract(index);
			return 1;
		}
	}

	@Override
	public int update(int index, BicicletaDTO newData) {
		if (index < 0 || index >= listaBicis.size()) {
			return 0;
		} else {
			listaBicis.get(index).setInfo(newData);
			return 1;
		}
	}

	@Override
	public String print() {
		return listaBicis.print();
	}

}
