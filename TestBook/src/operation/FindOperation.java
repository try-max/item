package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author Q
 * @create 2020-05-06-15:31
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入查找图书的名字：");
        String name=scanner.nextLine();
        for (int i = 0; i <bookList.getUsedSize(); i++) {
            Book book=bookList.getBook(i);
            if (name.equals(book.getName())){
                System.out.println("图书馆有此书："+book.getName());
                return;
            }

        }
        System.out.println("查无此书");
    }
}
