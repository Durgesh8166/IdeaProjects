public class searchinglinked{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    public static Node head;
    public static Node tail;
    public void addfirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;;
        head=newNode;
    }
    public int search(
            int key
    ){
        Node temp= head;
        int i=0;
        while (temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addfirst(5);
        ll.addfirst(7);
        ll.addfirst(2);
      //  System.out.println(ll.search(5));
    }

}
