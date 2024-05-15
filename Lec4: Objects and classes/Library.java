package Library;

import java.util.function.BooleanSupplier;

import Book.Book;

public class Library {
	String address;
	Book[] books;
	int bookNum;

	public Library(String location) {
		address = location;
		books = new Book[10];
		bookNum = 0;
	}

	public void addBook(Book book) {
		books[bookNum] = book;
		bookNum++;
	}

	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}

	public void printAddress() {
		System.out.println(address);
	}

	public void borrowBook(String book) {
		for (int i = 0; i < bookNum; i++)
			if (books[i].getTitle().equals(book)) {
				if (books[i].isBorrowed()) {
					System.out.println("Sorry, this book is already borrowed.");
				} else {
					System.out.println("You successfully borrowed " + book);
					books[i].borrowed();
				}
				return;
			}
		System.out.println("Sorry, this book is not in our catalog.");
	}

	public void printAvailableBooks() {
		boolean bookExist = false;
		for (int i = 0; i < bookNum; i++)
			if (!books[i].isBorrowed()) {
				bookExist = true;
				System.out.println(books[i].getTitle());
			}
		if (!bookExist)
			System.out.println("No book in catalog");
	}

	public void returnBook(String book) {
		for (int i = 0; i < bookNum; i++)
			if (books[i].getTitle().equals(book)) {
				if (books[i].isBorrowed()) {
					System.out.println("You successfully returned " + book);
					books[i].returned();
				} else {
					System.out.println("Sorry, this book is already returned.");
				}
				return;
			}
		System.out.println("Sorry, this book is not in our catalog.");
	}

	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();
		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
}