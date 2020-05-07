package operation;

import book.BookList;

/**
 * @author Q
 * @create 2020-05-06-15:30
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
