package prob02;

public class Book {

	int bookNo;
	String title;
	String author;
	int stateCode;

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void rent() {
		this.stateCode = 0;
		System.out.println(this.title + "이(가) 출력되었습니다.");
	}

	public void print() {
		String checkCode;
		if (stateCode == 0) {
			checkCode = "대여중";
			System.out.println("책 제목 : " + this.title + " 저자 : " + this.title + " 대여 여부 : " + checkCode);
		} else {

			checkCode = "재고 있음";
			System.out.println("책 제목 : " + this.title + " 저자 : " + this.title + " 대여 여부 : " + checkCode);

		}

	}
}
