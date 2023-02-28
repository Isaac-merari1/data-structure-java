package Tree.binary;

public class Main {
    public static void main(String[] args) {
        BinaryTreeImpl binary = new BinaryTreeImpl();
        Node node = binary.create();

        System.out.println(node.toString());
    }
}
