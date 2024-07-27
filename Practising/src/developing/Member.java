package developing;

public class Member {
	    private String name;
	    private String memberId;
	    private int borrowedBooksCount;

	    public Member(String name, String memberId) {
	        this.name = name;
	        this.memberId = memberId;
	        this.borrowedBooksCount = 0;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getMemberId() {
	        return memberId;
	    }

	    public int getBorrowedBooksCount() {
	        return borrowedBooksCount;
	    }

	    public void borrowBook() {
	        borrowedBooksCount++;
	    }

	    public void returnBook() {
	        borrowedBooksCount--;
	    }

	    @Override
	    public String toString() {
	        return "Member{" +
	                "name='" + name + '\'' +
	                ", memberId='" + memberId + '\'' +
	                ", borrowedBooksCount=" + borrowedBooksCount +
	                '}';
	    }
	}


