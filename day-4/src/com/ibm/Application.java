package com.ibm; 

class Book{
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws MyException{
		if(title==null) {
			throw new MyException();
		}
		this.title = title;
	}
	
	@Override
	public String toString() {
		return this.title;
	}
}

public class Application {
	public static void main(String[] args) {
		Book book = new Book();
		try {
			book.setTitle(null);
		}
		catch(IllegalArgumentException illegalArgumentException ) {	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("always");
		}
		
		//book.setTitle("learning java");
		System.out.println(book.toString());
	//	Book book1 = new Book();
	//	book1.setTitle("learning javascript");
	//	System.out.println(book1);
		
	}

}
