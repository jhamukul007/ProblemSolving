package com.ps.array;

import java.util.ArrayList;
import java.util.List;
/**
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 *LeetCode Question: 653. Two Sum IV - Input is a BST
 * @author mukul
 *
 */
public class PairOfSumEqualToKBST {
	static TreeNode root;
	
	 public static boolean findTarget(TreeNode root, int k) {
	        if(root==null)
	            return false;
	        List<Integer> arr=new ArrayList<>();
	        getInOrderTraverSal(root,arr);
	        if(arr==null || arr.isEmpty())
	            return false;
	        
	        int i=0;
	        int j=arr.size()-1;
	        while(i!=j){
	            if(arr.get(i)+arr.get(j)==k)
	                return true;
	            if(arr.get(i)+arr.get(j)<k)
	                i++;
	            else
	                j--;
	        }
	        return false;
	    }
	    
	    public static void getInOrderTraverSal(TreeNode root, List<Integer> arr){
	        if(root==null)
	            return;
	        getInOrderTraverSal(root.left,arr);
	        arr.add(root.val);
	        getInOrderTraverSal(root.right,arr);
	    }
	public static void main(String[] args) {
		root=new TreeNode(5);
		root.left=new TreeNode(3);
		root.right=new TreeNode(6);
		root.left.left=new TreeNode(2);
		root.left.right=new TreeNode(4);
		root.right.right=new TreeNode(7);
		int k=9;
		System.out.println("Pair sum exist : " +findTarget(root, k));
	}

}

class TreeNode{
	 int val;
	 TreeNode left;
	 TreeNode right;
	 
	public TreeNode() {
		super();
	}
	
	public TreeNode(int val) {
		super();
		this.val = val;
		left=right=null;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		super();
		this.val = val;
		this.left = left;
		this.right = right;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	 
	 
	 
}
