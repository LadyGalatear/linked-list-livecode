public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node();
        myNode.value = 'w';

        Node otherNode = new Node();
        otherNode.value = 'e';

        Node badassNode = otherNode;

        badassNode.value = 't';

        System.out.println(myNode.value);
        System.out.println(otherNode.value);
        System.out.println(badassNode.value);
    }
}