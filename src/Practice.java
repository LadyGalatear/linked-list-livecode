public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('w', null);
        Node otherNode = new Node('x', null);
        Node badassNode = new Node('e', null);
        Node goddamnNode = new Node('f', null);

        myNode.next = otherNode;
        otherNode.next = badassNode;
        badassNode.next = goddamnNode;

        // System.out.println(length(myNode));

        Node newHead = removeAt(myNode, 0);

        Node current = newHead;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

        /* 
        System.out.println(myNode.value);
        System.out.println(otherNode.value);
        System.out.println(badassNode.value);

        System.out.println(myNode.value);
        System.out.println(myNode.next.value);
        System.out.println(myNode.next.next.value);
        */
    }

    public static int length(Node head) {
        int count = 0;

        Node current = head;

        while(current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static Node removeAt(Node head, int removeIndex) {
        if (removeIndex == 0) {
            return head.next;
        }

        Node current = head;

        for (int i = 0; i < removeIndex - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        return head;
    }
}