package vinsys;

class Node1 {
    int data;
    Node1 next;
    Node1 previous;
}

class DLinkedList {
    Node1 head;

    public void insert(int data) {
        Node1 node = new Node1();
        node.data = data;
        node.next = null;

        if (head == null) {
            node.previous = null;
            head = node;
        } else {
            Node1 n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            node.previous = n;
        }
    }

    public void insertAtStart(int data) {
        Node1 node = new Node1();
        node.data = data;
        node.next = head;
        node.previous = null;

        if (head != null) {
            head.previous = node;
        }
        head = node;
    }

    public void insertAt(int index, int data) {
        Node1 node = new Node1();
        node.data = data;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node1 n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            if (n.next != null) {
                n.next.previous = node;
            }
            n.next = node;
            node.previous = n;
        }
    }

    public void deleteAt(int index) {
        if (index == 0 && head != null) {
            head = head.next;
            if (head != null) {
                head.previous = null;
            }
        } else {
            Node1 n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            Node1 nodeToDelete = n.next;
            if (nodeToDelete != null) {
                n.next = nodeToDelete.next;
                if (nodeToDelete.next != null) {
                    nodeToDelete.next.previous = n;
                }
            }
        }
    }

    public void show() {
        Node1 node = head;
        System.out.println("Doubly Linked List:");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLinkedList list = new DLinkedList(); // Create an instance of DLinkedList
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insertAtStart(25);

        list.insertAt(0, 55);

        list.deleteAt(2);

        list.show();
    }
}

/*

package vinsys;

class Node1 {
    int data;
    Node1 next;
    Node1 prev; // Reference to the previous node

    public Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubleLinkedList {
    Node1 head;

    // Insert a new node at the end of the list
    public void insert(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
        } else {
            Node1 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp; // Set the previous reference
        }
    }

    // Insert a new node at the beginning of the list
    public void insertAtStart(int data) {
        Node1 newNode = new Node1(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert a new node at a specified index
    public void insertAt(int index, int data) {
        Node1 newNode = new Node1(data);
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node1 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Delete a node at a specified index
    public void deleteAt(int index) {
        if (index == 0) {
            if (head != null) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            }
        } else {
            Node1 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node1 toDelete = temp.next;
            temp.next = toDelete.next;
            if (toDelete.next != null) {
                toDelete.next.prev = temp;
            }
            toDelete = null;
        }
    }

    // Display the list from head to end
    public void displayForward() {
        Node1 temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display the list from end to head
    public void displayBackward() {
        Node1 temp = head;
        if (temp == null) return;

        // Go to the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAtStart(5);
        list.insertAt(2, 15);
        
        System.out.println("Linked List after insertions:");
        list.displayForward();
        list.displayBackward();
        
        list.deleteAt(2);
        
        System.out.println("Linked List after deletion at index 2:");
        list.displayForward();
        list.displayBackward();
    }
}
*/
