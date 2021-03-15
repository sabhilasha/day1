import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class ListDemo {
	public static void main(String[] args) {
		//demo1();
		bookList();
		}
		public static void bookList() {
			List<Book> books = new ArrayList<Book>();
			Book book1 = new Book ("learn java");
			book1.setPrice(100.0f);
			book1.setPublishYear(1999);
			
			books.add(book1);
			Book book2 = new Book ("learn java");
			book2.setPrice(20.0f);
			books.add(book2);
			book1.setPublishYear(1997);
		//	books.add(new Book("learn Java"));
		//	books.add(new Book("teach Javascript"));
			System.out.println(books);
			
			//sorting
			books.sort(new Comparator<Book>() { 
				
				@Override
				public int compare(Book book1, Book book2) {
					return (int)(book1.getPrice() - book2.getPrice());
				}
			});
			System.out.println("after sorting"+books);
		}		
			//Iterator<Book> it = books.iterator();
		//	while(it.hasNext()) {
		//		Book book = it.next();
			//	if(book.getTitle().contains("learn")) {
		//			System.out.println(book);
		//		}
	//	}
	

	public static void demo1() {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();//generics
		list.add(1);
		list.add(3);
		//list.add("Ram");//not allowed
		System.out.println(list.contains(3));
		System.out.println("Before"+list);
		list.remove(1);
		System.out.println("After"+list);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}
	}

}
