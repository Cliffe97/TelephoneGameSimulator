import static org.junit.Assert.*;

import org.junit.Test;

public class SinglyLinkedNodeTest {

	@Test
	public void insertRemoveTest() {
		SinglyLinkedList<Integer> newList = new SinglyLinkedList<>();
		for(int i = 0; i < 11; i ++) {
			newList.insert(i);
		}
		int output = newList.remove().getData();
		assertEquals(10, output);
	}
	@Test
	public void insertRemoveTest2() {
		SinglyLinkedList<Integer> newList = new SinglyLinkedList<>();
		for(int i = 0; i < 11; i ++) {
			newList.insert(i);
		}
		int output = newList.remove(5).getData();
		assertEquals(5, output);
	}
	@Test
	public void insertRemoveTest3() {
		SinglyLinkedList<Integer> newList = new SinglyLinkedList<>();
		for(int i = 0; i < 11; i ++) {
			newList.insert(i);
		}
		newList.insert(99,5);
		int output = newList.remove(5).getData();
		assertEquals(99, output);
	}
	@Test
	public void toStringTest() {
		SinglyLinkedList<Integer> newList = new SinglyLinkedList<>();
		for(int i = 0; i < 11; i ++) {
			newList.insert(i);
		}
		String output = newList.toString();
		String expectedOutput = "SinglyLinkedList : ";
		for(int i = 0; i < 11; i ++) {
			if(i < 10) {
				expectedOutput += i + " -> ";
			}else {
				expectedOutput += i;
			}
		}
		assertEquals(expectedOutput, output);
	}
	@Test 
	public void insertRemovetest4() {
		SinglyLinkedList<Integer> newList = new SinglyLinkedList<>();
		for(int i = 11; i < 21; i ++) {
			newList.insert(i);
		}
		for(int i = 11; i < 21; i ++) {
			newList.removeData(i);
		}
		assertEquals(0, newList.size());
	}
	@Test
	public void sizeTest() {
		SinglyLinkedList<Integer> newList = new SinglyLinkedList<>();
		for(int i = 0; i < 11; i ++) {
			newList.insert(i);
		}
		int output = newList.size();
		assertEquals(11, output);
	}
}
