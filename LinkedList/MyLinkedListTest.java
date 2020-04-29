/**
 * @author Q
 * @create 2020-04-26-19:51
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.display();
        myLinkedList.addIndex(1,10);
        myLinkedList.display();
    }
}
