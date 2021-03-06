/*
 * IntegerLinkedList.java
 *
 * This is the "stub" implementation of the IntegerList interface
 * provided to you as part of assignment 2.
 * 
 * Your task is to complete the implementation of all the methods
 * such that they meet the specifications defined both in 
 * IntegerList.java and in the assignment PDF.
 *
 * Except for the constructor, you should remove all the supplied code
 * from the methods and replace it with working code.  The supplied code
 * in the methods is just so that this file compiles and runs.
 *
 */

public class IntegerLinkedList implements IntegerList
{
	private IntegerNode	head;
	private IntegerNode	tail;

	private	int		count;

	public IntegerLinkedList()
	{
		head = null;
		tail = null;
		count = 0;
	}

	/*
	 * PURPOSE:
	 *   Add the element x to the front of the list.
	 *
	 * PRECONDITIONS:
	 *   None.
	 * 
	 * Examples:
	 * 
	 * If l is {1,2,3} and l.addFront(9) returns, then l is {9,1,2,3}.
	 * If l is {} and l.addFront(3) returns, then l is {3}.
	 */
	public void addFront (int x)
	{
		IntegerNode newNode=new IntegerNode(x, head);
		head=newNode;
		
		count++;
	}


	/*
	 * PURPOSE:
	 *   Add the element x to the back of the list.
	 *
	 * PRECONDITIONS:
	 *   None.
	 * 
	 * Examples:
	 * 
	 * If l is {1,2,3} and l.addBack(9) returns, then l is {1,2,3,9}.
	 * If l is {} and l.addBack(9) returns, then l is {9}.
	 */	
	public void addBack (int x)
	{
		IntegerNode newNode=new IntegerNode(x);
		count++;
		if (head == null) 
		{
			head=newNode;
			return;
		} 
		else 
		{
			IntegerNode temp = head;
			while (temp.next != null) 
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	/*
	 * PURPOSE:
	 *	Return the number of elements in the list
	 *
	 * PRECONDITIONS:
	 *	None.
	 *
	 * Examples:
	 *	If l is {7,13,22} l.size() returns 3
	 *	If l is {} l.size() returns 0
	 */
	public int size()
	{
		return count;
	}
	
	/* 
	 * PURPOSE:
	 *   Return the element at position pos in the list.
	 * 
	 * PRECONDITIONS:
	 *	pos >= 0 and pos < l.size()
	 * 
	 * Examples:
	 *	If l is {67,12,13} then l.get(0) returns 67
	 *	If l is	{67,12,13} then l.get(2) returns 13
	 *	If l is {92} then the result of l.get(2) is undefined.
	 *
	 */
	public int  get (int pos)
	{
		IntegerNode temp=head;
		for (int i=0; i<pos; i++)
		{
			temp=temp.next;
		}
		return temp.value;
	}
	
	/* 
	 * PURPOSE:
	 *   Remove all elements from the list.  After calling this
	 *   method on a list l, l.size() will return 0
	 * 
	 * PRECONDITIONS:
	 *	None.
	 * 
	 * Examples:
	 *	If l is {67,12,13} then after l.clear(), l is {}
	 *	If l is {} then after l.clear(), l is {}
	 *
	 */
	public void clear()
	{
		head=null;
		count=0;
	}

	/* 
	 * PURPOSE:
	 *   Remove all instances of value from the list. 
	 * 
	 * PRECONDITIONS:
	 *	None.
	 * 
	 * Examples:
	 *	If l is {67,12,13,12} then after l.remove(12), l is {67,13}
	 *	If l is {1,2,3} then after l.remove(2), l is {1,3}
	 *	If l is {1,2,3} then after l.remove(99), l is {1,2,3}
	 */
	public void remove (int value)
	{
		IntegerNode temp = head;
		while (temp != null && temp.value != value) 
		{
			temp = temp.next;
		}
		if (temp == null) 
		{
			//System.out.println("test");
		} 
		else
		{
			if (temp == head) 
			{
				head = head.next;
				if (head != null) 
				{
					head.prev = null;
				}
			}
		}
	}

	/*
	 * PURPOSE:
	 *	Return a string representation of the list
	 * 
	 * PRECONDITIONS:
	 *	None.
	 *
	 * Examples:
	 *	If l is {1,2,3,4} then l.toString() returns "{1,2,3,4}"
	 *	If l is {} then l.toString() returns "{}"
	 *
	 */
	public String toString()
	{
		if (head==null)
		{
			return "{}";
		}
		String output="{";
		IntegerNode temp=head;
		
		while (temp!=null)
		{
			output += temp.value;
			if (temp.next!=null)
			{
				output += ",";
			}
			temp=temp.next;
		}
		return output+"}";
	}
}
