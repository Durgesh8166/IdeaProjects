public class binarytreec {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class  Binary{
        static int idx=-1;
        public static Node buildTree(int node[]){
            idx++;
            if (idx>= node.length|| node[idx]==-1){
                return null;
            }
            Node newNode=new Node(node[idx]);
            newNode.right=buildTree(node);
            newNode.left=buildTree(node);
            return newNode;

        }
        public static void preNode(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.data+" ");
            preNode(root.left);
            preNode(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,-1,6,-1,-1};
        Binary tree=new Binary();
        Node root=tree.buildTree(nodes);
        //System.out.println(root.data);
        tree.preNode(root);
    }
}
