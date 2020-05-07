package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author Q
 * @create 2020-05-06-15:29
 */
public class StatusOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("图书的借出状态");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入借阅图书的名字：");
        String name=scanner.nextLine();

        for (int i = 0; i <bookList.getUsedSize(); i++) {
            Book book=bookList.getBook(i);
            if (book.getName().equals(name)){
                if (true==book.getStatus()){
                    System.out.println("该图书已被借出！");
                    return;
                }else {
                    System.out.println("借书成功！");
                    book.setStatus(true);
                    return;
                }
            }
        }
        System.out.println("图书馆无此书");
    }
}
