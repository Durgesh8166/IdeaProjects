public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;

            return;
        }

        newNode.next = head;
        head = newNode;
    }
   public void addlast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
   }
   public void printlist(){
        if (head==null){
            System.out.println("empty list");
        }
       Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
       System.out.println();
   }
   public void add(int idx,int data){
        if (idx==0){
            addfirst(data);
            return;
        }
        Node newNode =new Node(data);
        Node temp =head;
        int i=0;
        while (i<idx-1){


            temp=temp.next;
            i++;
        }
         newNode.next=temp.next;
        temp.next=newNode;
   }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addlast(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.add(2,9);
        ll.printlist();


    }
}

