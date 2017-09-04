package bookslist;

public class seller {
	public int SIN;
	private book currentSellings[];
	private int numSellings = 0;
	log overSeer;
	int reigeon;
	
	public seller(log overSeer) {
		this.reigeon = overSeer.reigeon;
		this.overSeer = overSeer;
		this.SIN = overSeer.registerSIN(this);
	}
	
	public void sellBook(String title, String ISBN, String author, float price) {
		this.overSeer.registerBook(title, ISBN, author, price, this);
		this.currentSellings[numSellings] = new book(title, ISBN, author, price, this, overSeer);
		this.numSellings ++;
	}
}
