package com.mani.gayi.unionfind;
import java.util.HashMap;
import java.util.Map;




public class DisJointSets {
	
	class Node
	{
		private long data;
		
		private Node Parent;
		
		private int rank;

		public long getData() {
			return data;
		}

		public void setData(long data) {
			this.data = data;
		}

		public Node getParent() {
			return Parent;
		}

		public void setParent(Node parent) {
			Parent = parent;
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}

		
		
	}
	
	Map<Long,Node> map = new HashMap();
	
	
	
	
	public void makeSet(long data)
	{
		Node tempnode = new Node();
		tempnode.setData(data);
		tempnode.setParent(tempnode);
		tempnode.setRank(0);
		map.put(data, tempnode);
	}
	
	public void union(long data1, long data2)
	{
		Node n1 = map.get(data1);
		Node n2 = map.get(data2);
		
		// if both belongs to the same parent then just return.
		
		Node parent1 = findParent(n1);
		Node parent2 = findParent(n2);
		
		if(parent1.data==parent2.data)
			return;
		
		// who's rank will be higher he is the parent.
		if(parent1.rank>=parent2.rank)
		{
			parent1.rank = (parent1.rank == parent2.rank)?parent1.rank+1:parent1.rank;
			parent2.setParent(parent1);
		}
		else
		{
			parent1.setParent(parent2);
		}
		
	}

	private Node findParent(Node n1) {
		
		Node parent = n1.getParent();
		if(parent == n1)
		{
			return parent;
		}
		n1.setParent(findParent(n1.getParent()));
		
		return n1.getParent();
	}
	
	
	public static void main(String[] args) {
		
		
		DisJointSets ds = new DisJointSets();
		
		ds.makeSet(1);
		ds.makeSet(2);
		ds.makeSet(3);
		ds.makeSet(4);
		ds.makeSet(5);
		ds.makeSet(6);
		ds.makeSet(7);
		ds.makeSet(10);
		ds.makeSet(11);
		ds.makeSet(12);
		
	}

}
