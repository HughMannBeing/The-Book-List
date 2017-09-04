package bookslist;

//TODO: Fix author array issue, maybe with hash maps?

public class book {
	private String title;
	private String ISBN;
	private String author;
	private float price;
	private boolean isSold = false;
	private seller seller;
	private buyer buyer = null;
	private log overseer;
	
	public book(String title, String ISBN, String author, float price, seller seller, log overseer) {
		this.title = title;
		this.ISBN = ISBN;
		this.author = author;
		this.price = price;
		this.seller = seller;
		this.overseer = overseer;
	}
	void didSell(buyer buyer) {
		if (this.isSold == false) {
			this.isSold = true;
			this.buyer = buyer;
		}else{
			System.out.println("BOOK ALREADY SOLD");
		}
	}
	void changeInfo(seller adv, int valChange, String newVal) {
		//0 for title, 1 for ISBN, 2 for authors, 3 for price
		if (adv.SIN == this.seller.SIN) {
			switch(valChange){
			case 0:
				this.title = newVal;
				break;
			case 1:
				this.ISBN = newVal;
				break;
			case 2:
				//Fix this later to load the array, maybe make it a hash map
				//this.authors = newVal;
				break;
			case 3:
				this.price = Float.parseFloat(newVal);
			default:
				System.out.println("Failed to identify information to be changed...");
				break;
			}
		}
	}
	public String getTitle() {
		return this.title;
	}
	public String getISBN() {
		return this.ISBN;
	}
	public String getAuthors() {
		return this.author;
	}
	public float getPrice() {
		return this.price;
	}
	public buyer getBuyer() {
		return this.buyer;
	}
	public seller getSeller() {
		return this.seller;
	}
	public log getOverSeer() {
		return this.overseer;
	}
}
