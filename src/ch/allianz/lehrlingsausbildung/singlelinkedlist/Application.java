package ch.allianz.lehrlingsausbildung.singlelinkedlist;

import java.util.Random;

import ch.allianz.lehrlingsausbildung.singlelinkedlist.data.ListData;
import ch.allianz.lehrlingsausbildung.singlelinkedlist.liste.SingleLinkedList;

public class Application {

	public static void main(String[] args) {
		Application app = new Application();
		app.runApp();
	}

	public void runApp() {
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		Random random = new Random();
		for (int i = 1; i <= 10; i++) {
			ListData listData = new ListData(random.nextInt(5));
			singleLinkedList.add(listData);
		}
		singleLinkedList.print();
		ListData searchfor = new ListData(0);
		while(singleLinkedList.remove(searchfor)) {
			System.out.println("===========");
			singleLinkedList.print();
		}
		System.out.println("**********");
		singleLinkedList.print();
	}
}