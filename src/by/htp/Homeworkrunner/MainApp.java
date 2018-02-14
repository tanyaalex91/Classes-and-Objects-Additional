package by.htp.Homeworkrunner;

public class MainApp {

	public static void main(String[] args) {
		 Books book1 = new Books("Java 8 Full Manual", "Shildt");
	        Books book2 = new Books("Programming for kids, parents, grandmas and grandpas", "Fain");
	        Books book3 = new Books("Java Methods of programming", "Blinov");
	        Books book4 = new Books ("Soft skills. The software developer's life manual", "Sonmez");

	      Library library = new Library();


	        library.addBooks(book1);
	        library.addBooks(book2);
	        library.addBooks(book3);
	        library.addBooks(book4);


	try {
	    for (int i = 0; i < library.books.length; i++)
	        System.out.println("Название книги : "+library.books[i].name + ". Автор : "+library.books[i].autor+".");

	} catch (Exception E){


	}
	    }

	

	}


