package entities;

public class Main {
	public static void main(String[] args) {
		Book book1=new Book("Poderoso chefão","Mario puzzo",1965);
		Book book2=new Book("Conde de Monte cristo","Alexandre Dumas",1846);
		Library library=new Library();
		library.addBook(book1);
		library.addBook(book2);
		library.showCollection();
		System.out.println(library.searchBook("Poderoso chefão"));
		System.out.println(library.searchBook("A vingança do Poderoso Chefão"));
		System.out.println(library.searchBook("Conde de Monte cristo"));
		library.deleteBook("conde de monte cristo");
		library.showCollection();
	}
}
