package LeetCode.Tree;
//L667
public class MapSum {
    private class Node{
        Node[] childs=new Node[26];
        int val=0;
    }
    public MapSum(){
    }
    private Node root=new Node();
    public void insert(String key, int val) {
        insert(root,key,val);
    }
    public void insert(Node node,String word,int val){
        if(node==null) return;
        if(word.length()==0){
            node.val=val;
            return;
        }
        int index=word.charAt(0)-'a';
        if(node.childs[index]==null){
            node.childs[index]=new Node();
        }
        insert(node.childs[index],word.substring(1),val);
    }
    public int sum(String prefix) {
        return sum(root, prefix);
    }
    //一直找到最后一个节点，再去找sum
    //word是node的往下后续节点 如果word的len=0 说明node已经找到最后一个节点
    public int sum(Node node,String word){
        if(root==null) return 0;
        if(word.length()!=0){
            return sum(node.childs[word.charAt(0)-'a'],word.substring(1));
        }
        int sum=node.val;
        for(Node n:node.childs){
            sum+=sum(n,word);
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
