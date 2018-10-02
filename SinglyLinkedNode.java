
public class SinglyLinkedNode<T> {
	private T data;
	private SinglyLinkedNode<T> next;
	
	public SinglyLinkedNode() {
		this.data = null;
		this.next = null;
	}
	public SinglyLinkedNode(T data, SinglyLinkedNode<T> node) {
		this.data = data;
		this.next = node;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
	public void setNext(SinglyLinkedNode<T> next) {
		this.next = next;
	}
	public SinglyLinkedNode<T> getNext() {
		return this.next;
	}
	public String toString() {
		return this.data.toString();
	}
}
