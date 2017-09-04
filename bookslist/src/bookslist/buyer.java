package bookslist;

public class buyer {
	public int BIN;
	log overSeer;
	int reigeon;
	
	public buyer(log overSeer) {
		this.reigeon = overSeer.reigeon;
		this.overSeer = overSeer;
		this.BIN = overSeer.registerBIN(this);
	}
}
