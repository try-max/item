package operation;

import book.Book;
import book.BookList;

import java.time.chrono.IsoChronology;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

/**
 * @author Q
 * @create 2020-05-06-15:29
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入删除图书的名字：");
        String name=scanner.nextLine();
        int i=0;
        for (i = 0; i <bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                break;
            }
        }
        if (i==bookList.getUsedSize()){
            System.out.println("查无此书");
            return;
        }
        //删除本书
        int curSize=bookList.getUsedSize();
        for (int j=i;j<bookList.getUsedSize()-1;j++){
            Book book=bookList.getBook(j+1);
            bookList.setBooks(j,book);
        }
        bookList.setUsedSize(curSize-1);
        System.out.println("删除成功！");
    }
}
