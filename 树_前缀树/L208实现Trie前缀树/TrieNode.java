package 树_前缀树.L208实现Trie前缀树;

public class TrieNode {
    
    static class Node{
        Node[] children;
        boolean isWord;
        public Node(){
            children = new Node[26];
        }
    }
    private Node root;
    public TrieNode() {
        root = new Node();
    }

    public void insert(String word) {
        Node p = root;
        for(char l : word.toCharArray()){
            if (p.children[l-'a']==null){
                p.children[l-'a'] = new Node();
            }
            p =  p.children[l-'a'];
        }
        p.isWord = true;
    }

    public boolean search(String word) {
        Node p = root;
        for(char l : word.toCharArray()){
            if (p.children[l-'a']==null){
                return false;
            }
            p =  p.children[l-'a'];
        }
        return p.isWord;
    }

    public boolean startsWith(String prefix) {
        Node p = root;
        for(char l : prefix.toCharArray()){
            if (p.children[l-'a']==null){
                return false;
            }
            p =  p.children[l-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */