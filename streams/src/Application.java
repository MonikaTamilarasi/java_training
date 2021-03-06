import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookServices;

public class Application {
public static void print(List<Book> books) {
	for(Book eachBook:books) {
		System.out.println(eachBook);
	}
	
	
}
	public static void main(String[] args) {
		Book java=new Book(101,"java","suba",450);
		Book spring=new Book(102,"spring","Mad",650);
		Book maven=new Book(103,"Maven","Harish",550);
		Book html=new Book(104,"Html","priya",1450);
		Book python=new Book(105,"python","Sathya",850);
		
		CrudRepository service=new BookServices();
		
		System.out.println(service.add(java));
		System.out.println(service.add(spring));
		System.out.println(service.add(maven));
		System.out.println(service.add(html));
		System.out.println(service.add(python));
		print(service.findAll());
		
		List<Book> bookList=service.findAll();
//		for(Book eachBook:bookList) {
//			System.out.println(eachBook);
//		}
		System.out.println("===============The Found Book is================");
		Book foundBook=service.findById(103);
		System.out.println(foundBook);
		
		service.remove(python);
		
		//List<Book> bookList2=service.findAll();
//		for(Book eachBook:bookList) {
//			System.out.println(eachBook);
//		}
		System.out.println("==================The updated Book list is===============");
		print(service.findAll());
		System.out.println("size of array is :"+bookList.size());
		
		System.out.println("=============");
		Book react=new Book(106,"ReactJs","Moni",6850);
		service.add(react);
		print(service.findAll());
		
		Book reactNew=new Book(202,"ReactJS","Rahul Kanwal",7850);
		service.update(react, reactNew);
		System.out.println("========AFTER UPDATE=========");
		print(service.findAll());
		System.out.println("Greater than");
		List<Book> bookList2=((BookServices)service).getBooksGrtThan(500);
		bookList.forEach(System.out::println);
		
		
		///streams/////////////////////////////
		System.out.println("USING STREAMS");
		((BookServices)service).findBookGrtThan(500).forEach(System.out::println);
		
		
		System.out.println("====Book names using stream map=====");
		List<String> namelist =((BookServices)service).getBookNames();
		namelist.forEach(System.out::println);
		
		System.out.println("=====Getting book name thats price is greater than 900======");
		List<String> grtThanNineHundred = ((BookServices)service).getBookNameGrtThanPrice(900);
		grtThanNineHundred.forEach(System.out::println);
		
		System.out.println("===Sorted Book names=====");
		List<Book> sortedByName=((BookServices)service).sortedByName();
		sortedByName.forEach(System.out::println);
		
		
		System.out.println("=====Sorted by desc====");
		List<Book> sortedByNameDesc=((BookServices)service).sortedByNumberDesc();
		sortedByNameDesc.forEach(System.out::println);
	}

}
