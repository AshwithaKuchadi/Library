package developing;

public class Book {
	    private String title;
	    private String author;
	    private String bookNo;
	    private boolean isAvailable;

	    public Book(String title, String author, String bookNo) {
	        this.title = title;
	        this.author = author;
	        this.bookNo = bookNo;
	        this.isAvailable = true;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getBookNo() {
	        return bookNo;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    public void setAvailable(boolean available) {
	        isAvailable = available;
	    }

	    @Override
	    public String toString() {
	        return "Book{" +
	                "title='" + title + '\'' +
	                ", author='" + author + '\'' +
	                ", bookNo='" + bookNo + '\'' +
	                ", isAvailable=" + isAvailable +
	                '}';
	    }
	}



