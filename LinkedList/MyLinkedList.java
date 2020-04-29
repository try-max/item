/**
 * @author Q
 * @create 2020-04-26-18:48
 */
class Node{
    public int data;
    public Node next;
    public Node tail;
    public Node prev;

    public Node(int data) {
        this.data = data;
    }

}


public class MyLinkedList {
    public Node head;
    public Node tail;
    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if (this.head==null){
            this.head=node;
            this.tail=node;
            return;
        }
        node.next=this.head;
        this.head.prev=node;
        this.head=node;

    }
    public void display(){
        Node cur=head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void addLast(int data){
        Node node=new Node(data);
        if (this.head==null){
            this.head=node;
            this.tail=node;
            return;
        }
        this.tail.next=node;
        node.prev=this.tail;
        this.tail=node;
    }
    public boolean contains(int key){
        Node cur=this.head;
        while (cur!=null){
            if (cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    public int size(){
        int count=0;
        Node cur=this.head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    public void checkIndex(int index){
        if (index<0&&index>size()){
            throw new RuntimeException("index不合法");
        }
    }
    public Node searchIndex(int index){
        checkIndex(index);
        Node cur=this.head;
        int i=0;
        for ( i=0; i <index; i++) {
            cur=cur.next;
        }
        return cur;
    }

    public void addIndex(int index,int data){
        checkIndex(index);
        if (index==0){
            addFirst(data);

        }else if (index==size()){
            addLast(data);
        }else{
            Node cur=searchIndex(index);

            Node node=new Node(data);
            node.next=cur;
            node.prev=cur.prev;

            cur.prev.next=node;
            cur.prev=node;
        }




    }
    public int remove(int key){
        Node cur=this.head;
        while (cur!=null){
            if (cur.data==key){
                int oldData=cur.data;
                if (cur==this.head){
                    this.head=this.head.next;
                    this.head.prev=null;
                    return oldData;
                }else {
                    cur.prev.next=cur.next;
                    if (cur.next==null){
                        this.tail=cur.prev;
                    }else {
                        cur.next.prev=cur.prev;
                    }

                }
                return oldData;
            }
            cur=cur.next;
        }
        return -1;
    }
    public void temoveAllKey(int key){
        Node cur=this.head;
        while (cur!=null){
            if (cur.data==key){
                int oldData=cur.data;
                if (cur==this.head){
                    this.head=this.head.next;
                    if (this.head==null){
                       return;
                    }
                    this.head.prev=null;
                }else {
                    cur.prev.next=cur.next;
                    if (cur.next==null){
                        this.tail=cur.prev;
                    }else {
                        cur.next.prev=cur.prev;
                    }

                }

            }
            cur=cur.next;
        }

    }
    public void clear(){
        Node cur;
        while (this.head!=null){
            cur = this.head.next;
            this.head.prev=null;
            this.head.next=null;
            this.head=cur;

        }
        this.tail=null;
    }

}
