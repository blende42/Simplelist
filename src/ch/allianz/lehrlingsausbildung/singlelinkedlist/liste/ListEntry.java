package ch.allianz.lehrlingsausbildung.singlelinkedlist.liste;

import ch.allianz.lehrlingsausbildung.singlelinkedlist.data.ListData;

public class ListEntry {
	private ListData listData;
	private ListEntry next;
	
	public ListEntry(ListData listData) {
		this.listData = listData;
		next = null;
	}
	
	public ListData getListData() {
		return listData;
	}
	
	public ListEntry getNext() {
		return next;
	}
	
	public void setNext(ListEntry next) {
		this.next = next;
	}
}
