
public class test {
	public static void main(String[] args) {
		SinglyLinkedList<Integer> newList = new SinglyLinkedList<>();
		for(int i = 0; i < 17; i ++) {
			newList.insert(i);
		}
		System.out.println(newList.toString());
	}
	
}
