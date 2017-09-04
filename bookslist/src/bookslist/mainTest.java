package bookslist;

public class mainTest {

	public static void main(String[] args) {
		log god = new log(0);
		seller frank = new seller(god);
		frank.sellBook("Calculus", "12345", "TIM", (float)123.45);
		System.out.println(god.GetBook(0).getTitle());
	}

}
