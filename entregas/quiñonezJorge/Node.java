public class Node {

  private String name;
  private Node left;
  private Node right;

  public Node(String name) {
    this.name = name;
  }

  public String getname() {
    return name;
  }

  public Node getLeft() {
    return nextLeft;
  }

  public Node getRight() {
    return nextRight;
  }

  public void setLeft(Node node) {
    nextLeft = node;
  }

  public void setRight(Node node) {
    nextRight = node;
  }

}
