package entities;

import java.util.Objects;

public class Book {
	private String Title;
	private String Author;
	private int YearPublication;
	
	public Book(String title,String author,int yearPublication) {
		this.Author=author;
		this.Title=title;
		this.YearPublication=yearPublication;
	}
	
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getYearPublication() {
		return YearPublication;
	}
	public void setYearPublication(int yearPublication) {
		YearPublication = yearPublication;
	}
	 public String showInfo() {
	        return "Livro: " + Title + " | Autor: " + Author + " | Ano de Publicação: " + YearPublication;
	    }

	 public int hashCode() {
	        return Objects.hash(Title, Author, YearPublication);
	    }
	 @Override
	public String toString() {
		return "Livro: " + Title + " | Autor: " + Author + " | Ano de Publicação: " + YearPublication;
	}
}	
