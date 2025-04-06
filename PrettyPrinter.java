package src;

public final class PrettyPrinter{
  private PrettyPrinter(){};

  public static < T extends TreeNode > void print(T node){
    printRec(node, 0);
  }

  private static < T extends TreeNode > void printRec(T node,   int depth){
    System.out.println(" ".repeat(depth) + node.getName());
    for(T child : node.getChildren()){
      printRec(child, depht + 1);
    }}
}
