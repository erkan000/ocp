package chapter10.s3;

public class InterferanceSample {

	public static void main(String[] args) {
		Book book = new Book("Java");
		Thread task1 = new OnlineBuy(book); task1.start();
		Thread task2 = new OnlineBuy(book); task2.start();
		Thread task3 = new OnlineReturn(book); task3.start();
	}

}

class OnlineBuy extends Thread{
	private Book book;
	public OnlineBuy(Book book) {
		this.book = book;
	}
	@Override
	public void run() {
		book.newSale();
		System.out.println("Buy = " + book.copiesSold);
	}
}
class OnlineReturn extends Thread{
	private Book book;
	public OnlineReturn(Book book) {
		this.book = book;
	}
	@Override
	public void run() {
		book.returnBook();
		System.out.println("Return = " + book.copiesSold);
	}
}

class Book{
	String title;
	int copiesSold = 0;
	Book(String title) {
		this.title = title;
	}
	public synchronized void newSale() {
		++copiesSold;
	}
	synchronized public void returnBook() {
		--copiesSold;
	}
}
