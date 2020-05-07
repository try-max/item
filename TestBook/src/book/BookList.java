package book;

/**
 * @author Q
 * @create 2020-05-06-15:09
 */
public class BookList {
    private Book[] books=new Book[100];
    private int usedSize=0;

    public BookList() {
        books[0]=new Book("红楼梦","曹雪芹",100,"小说");
        books[1]=new Book("西游记","吴承恩",72,"小说");
        books[2]=new Book("水浒传","施耐庵",108,"小说");
        usedSize=3;
    }

    public BookList(Book[] bookList, int usedSize) {
        this.books = bookList;
        this.usedSize = usedSize;
    }
    public void setBooks(int pos,Book book){
        this.books[pos]=book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    public Book getBook(int pos){
        return this.books[pos];
    }
}
