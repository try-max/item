package operation;

import book.Book;
import book.BookList;

/**
 * @author Q
 * @create 2020-05-06-15:30
 */
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("展示图书");
        for (int i = 0; i <bookList.getUsedSize(); i++) {
            Book book=bookList.getBook(i);
            System.out.println(book);
        }
    }
}
