package ch.allianz.lehrlingsausbildung.singlelinkedlist.liste;

import ch.allianz.lehrlingsausbildung.singlelinkedlist.data.ListData;

/**
 * Implementation of a single linked list. Just an example for educational purposes
 * 
 * @author pm
 *
 */
public class SingleLinkedList {
	private int size = 0;
	private ListEntry first;

	public SingleLinkedList() {
		size = 0;		
	}

	/**
	 * adds listData to the end of this list
	 * 
	 * @param listData
	 */
	public void add(ListData listData) {
		ListEntry current = first;
		if (current != null) {
			ListEntry next  = current.getNext();
			while( next!= null) {
				current = next;
				next = current.getNext();
			}
			current.setNext(new ListEntry(listData));
		} else {
			first = new ListEntry(listData);
		}
		size++;
	}

	public boolean contains(ListData listData) {
		ListEntry current = first;
		while(current != null) {
			if(current.getListData().getData() == listData.getData()) {
				return true;
			} else {
				current = current.getNext();
			}
		}
		return false;
	}

	public boolean remove(ListData listData) {
		boolean returnValue = false;
		ListEntry previous;
		ListEntry current = first;
		if (first != null) {
			if (first.getListData().getData() == listData.getData()) {
				first = first.getNext();
				size--;
				returnValue = true;
			} else {
				previous = first;
				current = first.getNext();
				while(current != null && !returnValue) {
					if (current.getListData().getData() == listData.getData()) {
						previous.setNext(current.getNext());
						size--;
						returnValue = true;
					} else {
						previous = current;
						current = current.getNext();
					}					
				}
			}
		}
		return returnValue;
	}

	public void print() {
		System.out.println("number of entries: " +size);
		if (size != 0) {
			int position = 1;
			ListEntry listEntry = first;
			while(listEntry != null) {
				System.out.println("entry at position: "+ position +" = "+listEntry.getListData());
				position++;
				listEntry = listEntry.getNext();
			}
		}
	}
}
