public class Main {
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
        static class Binary{
            static int idx=-1;
            public static Node bulidTree(int node[]){
                idx++;
                if (node[idx]==-1){
                    return null;
                }
                Node newNode =new Node(node[idx]);
                newNode.left=bulidTree(node);
                newNode.right=bulidTree(node);
                return newNode;

            }
        }

        public static void main(String[] args) {
            int nodes[]={1,2,4,-1,-1,5,-1,3,-1,6,-1,-1};
            Binary tree=new Binary();
            Node root=tree.bulidTree(nodes);
            System.out.println(root.data);

        }
    }

