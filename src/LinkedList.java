public class LinkedList {
    public Node head;
    public boolean isEmpty(){
        return head == null;
    }

    //To add new node by index
    public void add(int data,int index){
        Node newNode = new Node();
        Node temp;
        newNode.data= data;
        Node current = head;
        for (int i=0; i<index; i++){
            current= current.next;}

        temp =current.next;
       current.next= newNode;
       newNode.next=temp;
    }

    //To add new node in end list
    public void add(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty())
        {
            head = newNode;
        }
        else {
            Node current = head;

            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //To print nodes's data
    public void display(){
        Node current =head;
        while (current!=null){
            System.out.println(current.data);
            current= current.next;
        }
    }


    public void delete(int data){
        Node current = head;
        while (current!= null){
            if (current.next.data==data){
                current.next=current.next.next;
                break;
            }else {
                current= current.next;
            }
        }
    }
public int deleteHead(){
        int data = head.data;
        head= head.next;
        return data;
}

}
