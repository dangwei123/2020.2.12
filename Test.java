class Node{
    public Node parent;
    public Node leftChild;
    public Node rightChild;
    public int val;
    public Node(int val){
        this.val=val;
    }
}
public class MyTree {
    public void preOrderTraveral(Node head){
        if(head==null){
            return ;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(head);
        while(!stack.isEmpty()){
            Node node=stack.pop();
            System.out.println(node.val+" ");
            if(node.rightChild!=null){
                stack.push(node.rightChild);
            }
            if(node.leftChild!=null){
                stack.push(node.leftChild);
            }
        }
    }

    public void inOrderTraversal(Node head){
        if(head==null){
            return ;
        }
        Stack<Node> stack=new Stack<>();
        Node cur=head;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.leftChild;
            }
            Node node=stack.pop();
            System.out.println(node.val+" ");
            if(node.rightChild!=null){
                cur=node.rightChild;
            }
        }
    }

    public void postOrderTraversal(Node head){
        if(head==null){
            return ;
        }
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        s1.push(head);
        while(!s1.isEmpty()){
            Node node=s1.pop();
            s2.push(node);
            if(node.leftChild!=null){
                s1.push(node.leftChild);
            }
            if(node.rightChild!=null){
                s1.push(node.rightChild);
            }
        }
        while(!s2.isEmpty()){
            System.out.println(s2.pop()+" ");
        }
    }
}
