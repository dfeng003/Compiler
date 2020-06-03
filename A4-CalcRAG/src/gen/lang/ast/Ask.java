/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\calc.ast:14
 * @astdecl Ask : Expr ::= [Default:Expr];
 * @production Ask : {@link Expr} ::= <span class="component">[Default:{@link Expr}]</span>;

 */
public class Ask extends Expr implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\PrettyPrint.jrag:59
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print("ask user");
		if (hasDefault()) {
			out.print(" [");
			getDefault().prettyPrint(out, ind+"    ");
			out.print("]");
		}
	}
  /**
   * @declaredat ASTNode:1
   */
  public Ask() {
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
    setChild(new Opt(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Default"},
    type = {"Opt<Expr>"},
    kind = {"Opt"}
  )
  public Ask(Opt<Expr> p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 1;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public Ask clone() throws CloneNotSupportedException {
    Ask node = (Ask) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public Ask copy() {
    try {
      Ask node = (Ask) clone();
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
   * @declaredat ASTNode:59
   */
  @Deprecated
  public Ask fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:69
   */
  public Ask treeCopyNoTransform() {
    Ask tree = (Ask) copy();
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
   * @declaredat ASTNode:89
   */
  public Ask treeCopy() {
    Ask tree = (Ask) copy();
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
   * @declaredat ASTNode:103
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the optional node for the Default child. This is the <code>Opt</code>
   * node containing the child Default, not the actual child!
   * @param opt The new node to be used as the optional node for the Default child.
   * @apilevel low-level
   */
  public void setDefaultOpt(Opt<Expr> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) Default child.
   * @param node The new node to be used as the Default child.
   * @apilevel high-level
   */
  public void setDefault(Expr node) {
    getDefaultOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Default child exists.
   * @return {@code true} if the optional Default child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasDefault() {
    return getDefaultOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Default child.
   * @return The Default child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Expr getDefault() {
    return (Expr) getDefaultOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Default child. This is the <code>Opt</code> node containing the child Default, not the actual child!
   * @return The optional node for child the Default child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Default")
  public Opt<Expr> getDefaultOpt() {
    return (Opt<Expr>) getChild(0);
  }
  /**
   * Retrieves the optional node for child Default. This is the <code>Opt</code> node containing the child Default, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Default.
   * @apilevel low-level
   */
  public Opt<Expr> getDefaultOptNoTransform() {
    return (Opt<Expr>) getChildNoTransform(0);
  }
}
