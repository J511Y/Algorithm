package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/42892
// 길 찾기 게임
import java.util.*;
class Tree{
    int idx;
    int x;
    int y;
    Tree left;
    Tree right;
    
    Tree(int[] node){
        this.x = node[0];
        this.y = node[1];
        this.idx = node[2];
    }
    Tree findParent(int x, int y){
        Tree tmp = x < this.x ? left : right;
        if(tmp == null) return this;
        while(tmp.y > y){
            Tree child = x < tmp.x ? tmp.left : tmp.right;
            if(child == null) break;
            else tmp = child;
        }
        return tmp;
    }
}
public class prgmers_42892 {
List<Integer> list = new ArrayList<>();
    
    void PreOrder(Tree tree){
        list.add(tree.idx);
        if(tree.left != null) PreOrder(tree.left);
        if(tree.right != null) PreOrder(tree.right);
    }
    
    void PostOrder(Tree tree){
        if(tree.left != null) PostOrder(tree.left);
        if(tree.right != null) PostOrder(tree.right);
        list.add(tree.idx);
    }
    
    public int[][] solution(int[][] nodeinfo) {
        int len = nodeinfo.length;
        int[][] idxnode = new int[len][];
        for(int i = 0; i < len; i++){
            int[] node = nodeinfo[i];
            idxnode[i] = new int []{node[0], node[1], i + 1};
        }
        Arrays.sort(idxnode, (a, b)->{return b[1] - a[1];});
        Tree root = new Tree(idxnode[0]);
        
        for(int i = 1; i < len; i++){
            int[] node = idxnode[i];
            Tree parent = root.findParent(node[0], node[1]);
            if(node[0] < parent.x) parent.left = new Tree(node);
            else parent.right = new Tree(node);
        }
        
        PreOrder(root);
        int[] pre = new int[len];
        for(int i = 0; i < len; i++) pre[i] = list.get(i);
        
        list = new ArrayList<>();
        
        PostOrder(root);
        int[] post = new int[len];
        for(int i = 0; i < len; i++) post[i] = list.get(i);
        
        return new int[][]{pre, post};
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
