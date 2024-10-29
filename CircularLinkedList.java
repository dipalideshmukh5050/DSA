package vinsys;

class Node2 
{
    int data;
    Node2 next;
}

class CircularLinkedListDemo 
{
    Node2 head;

    public void insert(int data) 
    {
        Node2 node = new Node2();
        node.data = data;

        if (head == null)
        {
            head = node;
            node.next = head;  
        } else {
            Node2 n = head;
            while (n.next != head) 
            {  
                n = n.next;
            }
            n.next = node;
            node.next = head;  
        }
    }

    public void insertAtStart(int data) 
    {
        Node2 node = new Node2();
        node.data = data;

        if (head == null)
        {
            head = node;
            node.next = head;
        } else {
            Node2 n = head;
            while (n.next != head) 
            {  
                n = n.next;
            }
            node.next = head;
            head = node;
            n.next = head;  
        }
    }

    public void insertAt(int index, int data)
    {
        if (index == 0) 
        {
            insertAtStart(data);
        } else {
            Node2 node = new Node2();
            node.data = data;
            Node2 n = head;
            for (int i = 0; i < index - 1; i++) 
            {
                n = n.next;
                if (n == head) {  
                    throw new IndexOutOfBoundsException("Index out of range");
                }
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index) 
    {
        if (index == 0) {
            if (head != null) {
                Node2 n = head;
                while (n.next != head)
                {
                    n = n.next;
                }
                if (head.next == head) 
                {
                    head = null;  
                } else {
                    head = head.next;
                    n.next = head;  
                }
            }
        }
        else 
        {
            Node2 n = head;
            for (int i = 0; i < index - 1; i++) 
            {
                n = n.next;
                if (n.next == head) {  
                    throw new IndexOutOfBoundsException("Index out of range");
                }
            }
            Node2 nodeToDelete = n.next;
            n.next = nodeToDelete.next;
            nodeToDelete = null;
        }
    }

    public void show() 
    {
        if (head != null)
        {
            Node2 node = head;
            System.out.println("Circular Linked List:");
            do {
                System.out.print(node.data + " ");
                node = node.next;
            } while (node != head);  
            System.out.println();
        } else {
            System.out.println("The list is empty.");
        }
    }
}

public class CircularLinkedList
{
    public static void main(String[] args) 
    {
        CircularLinkedListDemo list = new CircularLinkedListDemo();  
        
        list.insert(18);
        list.insert(45);
        list.insert(12);
        
        list.insertAtStart(25); 
        list.insertAt(1, 55);   
        
        list.show();  

        list.deleteAt(2);  

        list.show();  
    }
}
