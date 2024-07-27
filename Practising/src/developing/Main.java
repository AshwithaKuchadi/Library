package developing;

public class Main {

	
 public static void main(String[] args) {
	  Library library = new Library();

	   Book book1 = new Book("The Life Tree: A Journey of Life", "A.P.J. Abdul Kalam", "9780743273565");
	   Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467");

	        library.addBook(book1);
	        library.addBook(book2);

	        Member member1 = new Member("renu", "M001");
	        Member member2 = new Member("sonu", "M002");

	        library.registerMember(member1);
	        library.registerMember(member2);

	        try {
	            library.borrowBook("M001", "9780743273565");
	            library.borrowBook("M002", "9780060935467");
	            library.returnBook("M001", "9780743273565");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        System.out.println(library);
	    }
	}


