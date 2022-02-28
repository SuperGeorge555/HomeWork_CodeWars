public class Node {

    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public static String stringify(Node list) {
        if(list == null) return "null";
        if (list.getNext() != null)
            return list.getData() + " -> " + stringify(list.getNext());

            return list.getData() + " -> null";
    }

    public static String stringifyV2(Node list) {
        if(list == null) return "null";

        StringBuilder result = new StringBuilder();

        Node currentNode = list;
        while(currentNode.getNext() != null) {
            result.append(currentNode.getData() + " -> ");
            currentNode = currentNode.getNext();
        }
        return result.toString() + currentNode.getData() + " -> null";
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
