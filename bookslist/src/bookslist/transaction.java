package bookslist;

public class transaction {
	private buyer buyer;
	private seller seller;
	private book book;
	public transaction(buyer buyer, seller seller, book book) {
		this.buyer = buyer;
		this.seller = seller;
		this.book = book;
	}
	public void officiate() {
		if (this.book.getSeller().SIN == this.seller.SIN) {
			book.didSell(this.buyer);
		}else
			System.out.println("Failed to complete sale: SIN != SIN");
	}
}
