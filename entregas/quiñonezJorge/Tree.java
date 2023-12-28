public class Tree {

  private Node root;

  public Tree() {
    root = null;
  }

  public void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.println(node.getKey());
    preOrder(node.getLeft());
    preOrder(node.getRight());

  }

  public void postOrder(Node node) {
    if (node == null) {
      return;
    }
    postOrder(node.getLeft());
    postOrder(node.getRight());
    System.out.println(node.getKey());
  }

  public void inOrder(Node node) {
    if (node == null) {
      return;
    }
    inOrder(node.getLeft());
    System.out.println(node.getKey());
    inOrder(node.getRight());
  }

}
