public class LLStack<T> implements Stack<T>
{
	private int count;
	private Node head;
		
	private class Node
{
	private T element;
	private Node next;
	
}
	
	public LLStack()
	{
		head=null;
		count=0;
	}
	
	public boolean empty()
	{
		return head==null;
	}
	

	public T peek() throws StackEmptyException
	{
		if(empty()==true)
		{ 
			throw new StackEmptyException("empty stack"); 
		}
		else
		{ 
		return head.element;
		}
	}
	

	public T pop() throws StackEmptyException
	{
		if(empty()==true) 
		{	
			throw new StackEmptyException("empty stack");
		}
		else
		{
		T element=head.element;
		head=head.next;
		
		count--;
		return element;
		}
	}
	

	public void push(T element)
	{
		Node temp = head;
		head= new Node();
		head.element=element;
		head.next=temp;
		
		count++;
	}
	
	
	public int size()
	{
		return count;
	}
	

	public void makeEmpty()
	{
		head=null;
		count=0;
	}
	
}
