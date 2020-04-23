/**
 * @author Q
 * @create 2020-04-23-14:25
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.display();
        System.out.println("myArrayList.contains(3) = " + myArrayList.contains(3));
        //查看顺序表下标为4的元素
        System.out.println("myArrayList.search(4) = " + myArrayList.search(4));
        //获取pos为2的元素
        System.out.println("myArrayList.getPos(2) = " + myArrayList.getPos(2));
        myArrayList.remove(4);
        myArrayList.display();
        myArrayList.add(3,4);
        myArrayList.setPos(3,100);
        myArrayList.display();

    }
}
