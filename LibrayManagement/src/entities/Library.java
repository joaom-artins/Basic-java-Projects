package entities;

import java.util.List;
import java.util.ArrayList;

public class Library {
	private List<Book> Collection;
	
	public Library(){
		Collection=new ArrayList<>();
	}
	
	public void addBook(Book book) {
		Collection.add(book);
		 System.out.println("Livro adicionado com sucesso!");
	}
	public void showCollection() {
		System.out.println("Livros disponiveis");
		for(Book book:Collection) {
	               System.out.println(book.showInfo());
		}
	}
	public Book searchBook(String title) {
	    for (Book book : Collection) {
	        if (book.getTitle().equalsIgnoreCase(title)) {
	      	    return book; 
	        }
	    }
	    return null;
	}
	
	
	public void deleteBook(String title) {
		Book book=searchBook(title);
		if(book!=null) {
			Collection.remove(book);
			System.out.println("Livro removido com sucesso");
		}else {
			System.out.println("Livro não está no nosso acervo");
		}
	}

}
