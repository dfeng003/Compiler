/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\lang.ast:7
 * @astdecl Parafactor : ASTNode ::= IdVar;
 * @production Parafactor : {@link ASTNode} ::= <span class="component">{@link IdVar}</span>;

 */
public class Parafactor extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\PrettyPrint.jrag:75
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print("int ");
		getIdVar().prettyPrint(out, ind);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Parafactor() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"IdVar"},
    type = {"IdVar"},
    kind = {"Child"}
  )
  public Parafactor(IdVar p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 1;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:26
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:30
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public Parafactor clone() throws CloneNotSupportedException {
    Parafactor node = (Parafactor) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public Parafactor copy() {
    try {
      Parafactor node = (Parafactor) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:58
   */
  @Deprecated
  public Parafactor fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:68
   */
  public Parafactor treeCopyNoTransform() {
    Parafactor tree = (Parafactor) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:88
   */
  public Parafactor treeCopy() {
    Parafactor tree = (Parafactor) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:102
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the IdVar child.
   * @param node The new node to replace the IdVar child.
   * @apilevel high-level
   */
  public void setIdVar(IdVar node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the IdVar child.
   * @return The current node used as the IdVar child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdVar")
  public IdVar getIdVar() {
    return (IdVar) getChild(0);
  }
  /**
   * Retrieves the IdVar child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdVar child.
   * @apilevel low-level
   */
  public IdVar getIdVarNoTransform() {
    return (IdVar) getChildNoTransform(0);
  }
}
