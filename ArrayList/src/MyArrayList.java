import java.util.Arrays;

/**
 * @author Q
 * @create 2020-04-23-10:35
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int capacity=10;

    public MyArrayList() {            //在构造函数 初始化顺序表
        this.elem = new int[capacity];
        this.usedSize=0;
    }
    public void display(){             //输出链表所有的元素
        for (int i = 0; i <usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    public void checkPos(int pos){      //检查pos是否非法
        if (pos<0||pos>this.usedSize){
            throw new RuntimeException("pos非法");
        }
    }

    public boolean isFull(){             //判断数组元素是否满了
        return this.usedSize==this.elem.length;
    }
    public void add(int pos,int data){   //顺序表 在pos位置添加data元素
        checkPos(pos);
        if (isFull()){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }

        for (int i = this.usedSize-1; i >=pos; i--) {
            this.elem[i+1]=elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    public boolean contains(int toFind){     //查询表中是否含有某个值
        for (int i = 0; i <this.usedSize-1; i++) {
            if (this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }
    public int search(int toFind){          //查询某个值并返回i，下标
        for (int i = 0; i <this.usedSize; i++) {
            if (this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){      //判断顺序表是否为空
        return this.usedSize==0;
    }
    public int getPos(int pos){  //获取pos位置的元素

        //1.判断是否为空
        if (isEmpty()){
            System.out.println("顺序表为空");
        }
        //2.判断是否是否合法
        checkPos(pos);

        return this.elem[pos];
    }
    public int size(){    //顺序表的长度
        return this.usedSize;
    }

    public void remove(int data){  //删除顺序表中的元素
        int index=search(data);
        if (index==-1){
            System.out.println("没有需要删除的数字");
            return;
        }
        for (int i = index; i <this.usedSize-1; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    public void clear(){                  //清除顺序表
        this.usedSize=0;
    }
    public void setPos(int pos,int valus){  //在顺序表pos位置中添加valus值
        checkPos(pos);
        this.elem[pos]=valus;
    }

}
