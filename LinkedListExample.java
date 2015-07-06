class LinkedList {

    private Node firstNode;
    private int listSize;

    public LinkedList() {
        firstNode = null;
        listSize = 0;
    }
    
    //return if empty or not
    public boolean isEmpty() {
        return (firstNode == null);
    }

    //inset at start of list
    public void insertStart(Object data) {
        Node node = new Node(data);
        node.nextNode = firstNode;
        firstNode = node;
        listSize++;
    }
    
    //insert at end of list
    public void insertEnd(Object data) {
        Node node = new Node(data);
        if (listSize == 0) {
            node.nextNode = firstNode;
            firstNode = node;
            listSize++;
        } else {
            Node currentNode = firstNode;
            while (!(currentNode.nextNode == null)) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = node;
            listSize++;
        }
    }
    
    //delete first node at beginning
    public void delete() {
        Node currentNode = firstNode;
        firstNode = currentNode.nextNode;
        listSize--;
    }
    
    //print list
    public void printList() {
        Node currentNode = firstNode;
        while ((currentNode.nextNode != null) && (currentNode != null)) {
            currentNode.printNode();
            currentNode = currentNode.nextNode;
        }
        currentNode.printNode();
    }

    //return size of list
    public int getSize() {
        return listSize;
    }
}

//node class
class Node {

    public Object data;
    public Node nextNode;

    //constructor
    public Node(Object data) {
        this.data = data;
        nextNode = null;
    }

    //print data in node
    public void printNode() {
        System.out.println(this.data);
    }
}
