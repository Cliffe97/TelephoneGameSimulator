
public class SinglyLinkedList<T> {
	private int size;
	private SinglyLinkedNode<T> head;
	private SinglyLinkedNode<T> tail;
	
	public SinglyLinkedList() {
		size = 0;
	}
	
	public SinglyLinkedNode<T> getHead(){
		return this.head;
	}
	public void insert(T data, int index) {
		SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>(data, null);
		SinglyLinkedNode<T> current = this.head;
		for(int i = 0; i < this.size; i++) {
			if(i == index - 1) {
				SinglyLinkedNode<T> temp = current.getNext();
				current.setNext(newNode);
				newNode.setNext(temp);
				break;
			}
			current = current.getNext();
		}
		this.size++;
		
    }
	public void insert(T data) {
		SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>(data, null);
		if(this.size == 0) {
			this.head = newNode;
			this.tail = this.head;
			this.size ++;
		}else {
			this.tail.setNext(newNode);
			this.tail = newNode;
			this.size ++;
		}
	}
	public SinglyLinkedNode<T> remove(int index){
		// if want to remove the first node
		if(index == 0) {
			this.size --;
			SinglyLinkedNode<T> targetNode = this.head;
			this.head = this.head.getNext();
			return targetNode;
		}
		// if want to remove the last node
		if(index == this.size - 1) {
			SinglyLinkedNode<T> current = this.head;
			for(int i = 0; i < this.size; i++) {
				if(i == this.size - 2) {
					SinglyLinkedNode<T> targetNode = current.getNext();
					current.setNext(null);
					this.tail = current;
					this.size --;
					return targetNode;
				}
				current = current.getNext();
			}
		}
		//remove other nodes
		SinglyLinkedNode<T> current = this.head;
		for(int i = 0; i < this.size; i++) {
			if(i == index - 1) {
				SinglyLinkedNode<T> targetNode = current.getNext();
				SinglyLinkedNode<T> temp = current.getNext().getNext();
				current.setNext(temp);
				this.size --;
				return targetNode;
			}
			current = current.getNext();
		}
		return null;
	}
	public SinglyLinkedNode<T> removeData(T data){
		SinglyLinkedNode<T> current = this.head;
		if(current.getData() == data) {
			SinglyLinkedNode<T> targetNode = current;
			this.head = current.getNext();
			current.setNext(null);
			this.size --;
			return targetNode;
		}else {
			for(int i = 0; i < this.size; i ++) {
				if(current.getNext().getData()== data || !(current.getNext()==this.tail)) {
					SinglyLinkedNode<T> targetNode = current.getNext();
					SinglyLinkedNode<T> temp = current.getNext().getNext();
					current.setNext(temp);
					this.size --;
					return targetNode;
				}else if(current.getNext().getData()== data ) {
					SinglyLinkedNode<T> targetNode = this.tail;
					current.setNext(null);
					this.size --;
					return targetNode;
				}
				current = current.getNext();
			}
		}
		
		return null;
		
	}
	public SinglyLinkedNode<T> remove(){
		SinglyLinkedNode<T> current = this.head;
		for(int i = 0; i < this.size; i ++) {
			if(i == this.size - 2) {
				SinglyLinkedNode<T> targetNode = current.getNext();
				current.setNext(null);
				this.tail = current;
				this.size --;
				return targetNode;
			}
			current = current.getNext();
		}
		return null;
	}
	public int size() {
		return this.size;
	}
	public String toString() {
		String result = "SinglyLinkedList : ";
		SinglyLinkedNode<T> current = this.head;
		for(int i = 0; i < this.size; i++) {
			if(current.getNext()==null) {
				result += current.getData();
			}else {
				result += current.getData() + " -> ";
			}
			current = current.getNext();
		}
		return result;
	}
	
}
