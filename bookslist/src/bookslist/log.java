package bookslist;

import java.util.ArrayList;
import java.util.List;

public class log {
	public int reigeon;
	List<transaction> transactionList = new ArrayList<transaction>();
	List<buyer> buyerList = new ArrayList<buyer>();
	List<seller> sellerList = new ArrayList<seller>();
	List<book> currentBooks = new ArrayList<book>();
	private int transactionCount = 0;
	private int buyerCount = 0;
	private int sellerCount = 0;
	private int bookCount = 0;
	
	public log(int reigeon) {
		this.reigeon = reigeon;
	}
	public book GetBook(int ID) {
		return this.currentBooks.get(ID);
	}
	public void registerBook(String title, String ISBN, String author, float price, seller seller) {
		this.currentBooks.add(new book(title, ISBN, author, price, seller, this));
		System.out.println("REGISTERED BOOK IN LOG: " + reigeon + " WITH TITLE: " + currentBooks.get(bookCount).getTitle());
		this.bookCount ++;
	}
	public void registerTransaction(buyer buyer, seller seller, book book) {
		this.transactionList.add(new transaction(buyer, seller, book));
		this.transactionCount ++;
	}
	public int registerSIN(seller seller) {
		//seller placeHolder = new seller(this);
		//this.sellerList.add(placeHolder);
		this.sellerCount ++;
		return this.sellerCount;
	}
	public int registerBIN(buyer buyer) {
		this.buyerList.add(new buyer(this));
		this.buyerCount ++;
		return this.buyerCount - 1;
	}
	public int getTransactionCount() {
		return this.transactionCount;
	}
	
	public transaction getTransaction(int ID) {
		return this.transactionList.get(ID);
	}
}
