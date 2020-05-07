package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author Q
 * @create 2020-05-06-15:31
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入归还图书的名字：");
        String name=scanner.nextLine();

        for (int i = 0; i <bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                book.setStatus(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有你要归还的图书！");
    }
}
