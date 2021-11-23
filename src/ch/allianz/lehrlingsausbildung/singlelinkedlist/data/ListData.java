package ch.allianz.lehrlingsausbildung.singlelinkedlist.data;

/**
 * Own wrapper for holding data entries to singlelinkedlist
 * 
 * @author pm
 *
 */
public class ListData {
	private int data;
	
	public ListData(int daten) {
		this.data = daten;
	}
	public int getData() {
		return data;
	}
	
	public String toString() {
		return String.valueOf(data);
	}
}
