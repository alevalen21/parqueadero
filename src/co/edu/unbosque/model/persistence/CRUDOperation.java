package co.edu.unbosque.model.persistence;

public interface CRUDOperation<T> {

	public void create(T newData);

	public int delete(int index);

	public int update(int index, T newData);

	public String print();
}
