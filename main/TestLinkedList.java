package main;
import linkedlist.*;

/**
 * This class is created to test out LinkedList & Node classes originally
 * Then GenericLinkedList & GenericNode classes are tested with 
 * String, Double, and Integer object types parameterized
 * @author rkelley/njohnson/arufus
 * CS131ON
 *
 */


public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do {
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

		/**
		 * The following section will test GenericLinkedList changes made
		 * Such as a GenericLinkedList holding integers, doubles, & strings
		 */
		
		//GenericLinkedList with Integers as the object type
		GenericLinkedList<Integer> myIntGList = new GenericLinkedList<Integer>();
		GenericNode<Integer> aIntNode = new GenericNode<Integer>();
		aIntNode.setData(25);
		myIntGList.addNode(aIntNode);
		aIntNode = new GenericNode<Integer>();
		aIntNode.setData(16);
		myIntGList.addNode(aIntNode);
		aIntNode = new GenericNode<Integer>();
		aIntNode.setData(9);
		myIntGList.addNode(aIntNode);
		aIntNode = new GenericNode<Integer>();
		aIntNode.setData(4);
		myIntGList.addNode(aIntNode);
		
		System.out.println("----------------------------------");
		System.out.println("GenericLinkedList with integer type: ");
		GenericNode <Integer> tempGNode = myIntGList.getList();
		do {
			System.out.println(tempGNode.getData());
			tempGNode = tempGNode.getNextNode();
		} while (tempGNode != null);

		
		//GenericLinkedList with Doubles as the object type
		GenericLinkedList<Double> myDoubleGList = new GenericLinkedList<Double>();
		GenericNode<Double> aDoubleNode = new GenericNode<Double>();
		aDoubleNode.setData(2.12);
		myDoubleGList.addNode(aDoubleNode);
		aDoubleNode = new GenericNode<Double>();
		aDoubleNode.setData(1.64);
		myDoubleGList.addNode(aDoubleNode);
		aDoubleNode = new GenericNode<Double>();
		aDoubleNode.setData(4.72);
		myDoubleGList.addNode(aDoubleNode);
		aDoubleNode = new GenericNode<Double>();
		aDoubleNode.setData(7.18);
		myDoubleGList.addNode(aDoubleNode);
		
		System.out.println("----------------------------------");
		System.out.println("GenericLinkedList with Double type: ");
		GenericNode <Double> tempDGNode = myDoubleGList.getList();
		do {
			System.out.println(tempDGNode.getData());
			tempDGNode = tempDGNode.getNextNode();
		} while (tempDGNode != null);
		
		//GenericLinkedList with String as the object type
		GenericLinkedList<String> myStringGList = new GenericLinkedList<String>();
		GenericNode<String> aStringNode = new GenericNode<String>();
		aStringNode.setData("Adele");
		myStringGList.addNode(aStringNode);
		aStringNode = new GenericNode<String>();
		aStringNode.setData("Beyonce");
		myStringGList.addNode(aStringNode);
		aStringNode = new GenericNode<String>();
		aStringNode.setData("Prince");
		myStringGList.addNode(aStringNode);
		aStringNode = new GenericNode<String>();
		aStringNode.setData("Seal");
		myStringGList.addNode(aStringNode);
		
		System.out.println("----------------------------------");
		System.out.println("GenericLinkedList with String type: ");
		GenericNode <String> tempStrGNode = myStringGList.getList();
		do {
			System.out.println(tempStrGNode.getData());
			tempStrGNode = tempStrGNode.getNextNode();
		} while (tempStrGNode != null);
		
	} //end main

} //end class
