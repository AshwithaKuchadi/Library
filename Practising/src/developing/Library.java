package developing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

	public class Library {
	    private Map<String, Book> books;
	    private Map<String, Member> members;

	    public Library() {
	        books = new HashMap<>();
	        members = new HashMap<>();
	    }

	    public void addBook(Book book) {
	        books.put(book.getBookNo(), book);
	    }

	    public void removeBook(String bookNo) {
	        books.remove(bookNo);
	    }

	    public void registerMember(Member member) {
	        members.put(member.getMemberId(), member);
	    }

	    public void borrowBook(String memberId, String bookNo) throws Exception {
	        Book book = books.get(bookNo);
	        Member member = members.get(memberId);

	        if (book == null) {
	            throw new Exception("Book not found!");
	        }
	        if (member == null) {
	            throw new Exception("Member not found!");
	        }
	        if (!book.isAvailable()) {
	            throw new Exception("Book is not available!");
	        }

	        book.setAvailable(false);
	        member.borrowBook();
	        System.out.println(member.getName() + " borrowed " + book.getTitle());
	    }

	    public void returnBook(String memberId, String bookNo) throws Exception {
	        Book book = books.get(bookNo);
	        Member member = members.get(memberId);

	        if (book == null) {
	            throw new Exception("Book not found!");
	        }
	        if (member == null) {
	            throw new Exception("Member not found!");
	        }
	        if (book.isAvailable()) {
	            throw new Exception("Book is not borrowed!");
	        }

	        book.setAvailable(true);
	        member.returnBook();
	        System.out.println(member.getName() + " returned " + book.getTitle());
	    }

	    @Override
	    public String toString() {
	        return "Library{" +
	                "books=" + books.values() +
	                ", members=" + members.values() +
	                '}';
	    }
	}


