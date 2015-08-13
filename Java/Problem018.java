package projectEuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:

75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23

NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot be solved by brute force, and requires a clever method! ;o)*/

public class Problem018 {
	
	ArrayList<String> longestPath(Node startNode){
		ArrayList<String> path = new ArrayList<String>();
		
		//TODO algorithm
		
		int currentWeight = startNode.getWeight();
		
		return null;
	}
	
	
	
	
	
	
	
	
	int lengthOfMaxPath(ArrayList<String> path, Node startNode){
		
		int length = 0;
		Node currentNode = startNode;
		for (String s : path) {
			length += currentNode.getWeight();
			if(s.equals("left")){
				currentNode = currentNode.getLeftChild();
			}else if(s.equals("right")){
				currentNode = currentNode.getRightChild();
			}
		}
		
		return length;
	}
	
	
	ArrayList<Node> makeTreeWithNodes(String s){
		ArrayList<Node> Graph = new ArrayList<Node>();
		Node startNode = new Node();
		
		for (String str : s.split("\n")) {
			for (String subStr : str.split(" ")) {
				Node node = new Node();
				node.setWeight(Integer.parseInt(subStr));
				node.leftParent = Graph.get(subStr.length() - 2);
			}
		}
		
		return null/*StartNode*/;
	}
	
	ArrayList<Integer> makeTree(String s){
		ArrayList<Integer> Graph = new ArrayList<Integer>();
		
		for (String str : s.split("\n")) {
			for (String subStr : str.split(" ")) {
				Graph.add(Integer.parseInt(subStr));
			}
		}
		return Graph;
	}
	
	public static void main(String[] args) {
		Problem018 p18 = new Problem018();
		
		
		String treeString = "";
	    try {
	    	BufferedReader br = new BufferedReader(new FileReader("src/projectEuler/problem018_input.txt"));
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        treeString = sb.toString();
	        br.close();
	    } catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println(treeString);
//	    System.out.println(treeString.split("\n")[1]);
	    
	    
	}//End maim
}//End p18 class




class Node {
	Node leftParent;
	Node rightParent;
	Node leftChild;
	Node rightChild;
	int weight;
	
	Node pathParent;
	Node pathChild;
	
	public Node getLeftParent() {
		return leftParent;
	}
	public void setLeftParent(Node leftParent) {
		this.leftParent = leftParent;
	}
	public Node getRightParent() {
		return rightParent;
	}
	public void setRightParent(Node rightParent) {
		this.rightParent = rightParent;
	}
	public Node getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Node getPathParent() {
		return pathParent;
	}
	public void setPathParent(Node pathParent) {
		this.pathParent = pathParent;
	}
	public Node getPathChild() {
		return pathChild;
	}
	public void setPathChild(Node pathChild) {
		this.pathChild = pathChild;
	}
	
	
}












