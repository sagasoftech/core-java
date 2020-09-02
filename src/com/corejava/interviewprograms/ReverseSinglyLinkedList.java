package com.corejava.interviewprograms;

/**
 * Write a sample code to reverse Singly Linked List by iterating through it
 * only once.
 * 
 * Recursive Method: 
 * 1) Divide the list in two parts - first node and rest of the linked list. 
 * 2) Call reverse for the rest of the linked list. 
 * 3) Link rest to first. 
 * 4) Fix head pointer.
 * 
 * @author sagar.dighe
 *
 * @param <T>
 */
public class ReverseSinglyLinkedList<T> {

	private Node<T> head;

	public void add(T element) {

		Node<T> nd = new Node<T>();
		nd.setValue(element);
		System.out.println("Adding: " + element);
		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				// since there is only one element, both head and
				// tail points to the same object.
				head = nd;
				break;
			} else if (tmp.getNextRef() == null) {
				tmp.setNextRef(nd);
				break;
			} else {
				tmp = tmp.getNextRef();
			}
		}
	}

	public void traverse() {

		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.print(tmp.getValue() + "\t");
			tmp = tmp.getNextRef();
		}
	}

	public void reverse() {

		System.out.println("\nreversing the linked list\n");
		Node<T> prev = null;
		Node<T> current = head;
		Node<T> next = null;
		while (current != null) {
			next = current.getNextRef();
			current.setNextRef(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}

	public static void main(String a[]) {
		ReverseSinglyLinkedList<Integer> sl = new ReverseSinglyLinkedList<Integer>();
		sl.add(3);
		sl.add(32);
		sl.add(54);
		sl.add(89);
		System.out.println();
		sl.traverse();
		System.out.println();
		sl.reverse();
		sl.traverse();
	}
}

class Node<T> implements Comparable<T> {

	private T value;
	private Node<T> nextRef;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> ref) {
		this.nextRef = ref;
	}

	@Override
	public int compareTo(T arg) {
		if (arg == this.value) {
			return 0;
		} else {
			return 1;
		}
	}
}