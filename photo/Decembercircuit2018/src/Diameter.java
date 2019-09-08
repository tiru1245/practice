import java.util.Scanner;

public class Diameter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node node=new Node(1);
		node.left=new Node(2);
		node.right=new Node(3);
		Diameter d=new Diameter();
		System.out.println(d.diameter(node));
	}
	int diameter(Node node)
    {
        return diameterOfTree(node,0);
    }
    public static int diameterOfTree(Node node1,int max){
        if(node1==null)
        {
            return max-1;
        }
        int left=diameterOfTree(node1.left,max+1);
        int right=diameterOfTree(node1.right,max+1);
        int max1=Math.max(left,right);
        return ++max1;
    }
}
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}