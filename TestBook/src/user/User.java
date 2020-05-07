package user;

import book.BookList;
import operation.IOperation;

/**
 * @author Q
 * @create 2020-05-06-15:41
 */
public abstract class User {
    protected String name;

    protected IOperation[] operations;

    public User(String name) {
        this.name=name;
    }
    public abstract int menu();
    public void doOperation(BookList bookList,int choice){
        this.operations[choice].work(bookList);
    }
}
