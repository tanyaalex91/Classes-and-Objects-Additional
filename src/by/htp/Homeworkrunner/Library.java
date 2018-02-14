package by.htp.Homeworkrunner;

public class Library {
	 Books [] books;
	    int BooksCounter;


	    public void addBooks (Books Books) {
	        if (this.books!=null) {
	            if (BooksCounter < books.length) {
	                books[BooksCounter] = Books;
	                BooksCounter++;
	            }else {
	                Books [] books = new Books[this.books.length + 10];
	                for (int i = 0; i < this.books.length; i++) {
	                    books [i] = this.books [i];

	                }
	                this.books = books;
	                this.books[BooksCounter] = Books;
	                BooksCounter++;

	            }
	        } else {
	            this.books = new Books [10];
	            this.books [0] = Books;
	            BooksCounter++;
	        }


	    }


	}

