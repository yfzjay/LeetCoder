package LeetCode.Tree;

import sun.reflect.generics.tree.Tree;
//前缀树的构造：用非静态内部类 L208
public class Trie {
     private class Node{
        Node[] childs=new Node[26];
        boolean isLeaf=false;
    }
    public Trie(){
    }
    private Node root=new Node();
    public void insert(String word) {
        insert(word,root);
    }
    public void insert(String word,Node node){
        if(node==null) return;
        if(word.length()==0){
            node.isLeaf=true;
            return;
        }
        int index=word.charAt(0)-'a';
        if(node.childs[index]==null){
            node.childs[index]=new Node();
        }
        insert(word.substring(1),node.childs[index]);
    }
    public boolean search(String word) {
        return search(word, root);
    }
    public boolean search(String word, Node node){
        if(node==null) return false;
        if(word.length()==0){
            return node.isLeaf;
        }
        int index=word.charAt(0)-'a';
        return search(word.substring(1),node.childs[index]);
    }
    public boolean startsWith(String prefix) {
        return startsWith(prefix,root);
    }
    public boolean startsWith(String prefix,Node node){
        if(node==null) return false;
        if(prefix.length()==0) return true;
        int index=prefix.charAt(0)-'a';
        return startsWith(prefix.substring(1),node.childs[index]);
    }

}
