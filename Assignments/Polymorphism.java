import java.util.*;

// Declaration of parent class publication

class publication{
	String title;
	double price;
	int copies;
	public int getcopies() {
		return this.copies;
	}
	public void setcopies(int copies) {
		this.copies = copies;
	}
	public void salecopy(int no) {
		System.out.println("Total Publication sell: $" + (no * price));​
	}
}

// Declaration of book class 

class book extends publication{
	String author;
}

// Declaration of magazine class

class magazine extends publication{
	void orderQty() {}
	void Currentissue() {}
	void receiveissue() {}
}

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
