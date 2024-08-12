package co.edu.unbosque.util.estructures;

public class Node<E> {
	private E info;
	private Node<E> next;

	public Node() {
		this(null, null);
	}

	public Node(E info, Node<E> next) {
		this.info = info;
		this.next = next;
	}

	public Node(E info) {
		this.info = info;
	}

	public E getInfo() {
		return info;
	}

	public void setInfo(E info) {
		this.info = info;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		if (info != null) {
			return info.toString();
		} else {
			return null;
		}
	}

}
