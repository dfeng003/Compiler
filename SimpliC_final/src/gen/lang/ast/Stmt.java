/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\lang.ast:16
 * @astdecl Stmt : ASTNode;
 * @production Stmt : {@link ASTNode};

 */
public abstract class Stmt extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Stmt() {
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
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:17
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    lookupHere_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:22
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:26
   */
  public Stmt clone() throws CloneNotSupportedException {
    Stmt node = (Stmt) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:37
   */
  @Deprecated
  public abstract Stmt fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:45
   */
  public abstract Stmt treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:53
   */
  public abstract Stmt treeCopy();
/** @apilevel internal */
protected boolean lookupHere_visited = false;
  /** @apilevel internal */
  private void lookupHere_reset() {
    lookupHere_computed = false;
    
    lookupHere_value = null;
    lookupHere_visited = false;
  }
  /** @apilevel internal */
  protected boolean lookupHere_computed = false;

  /** @apilevel internal */
  protected IdVar lookupHere_value;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:91
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:91")
  public IdVar lookupHere() {
    ASTState state = state();
    if (lookupHere_computed) {
      return lookupHere_value;
    }
    if (lookupHere_visited) {
      throw new RuntimeException("Circular definition of attribute Stmt.lookupHere().");
    }
    lookupHere_visited = true;
    state().enterLazyAttribute();
    lookupHere_value = unknownVar();
    lookupHere_computed = true;
    state().leaveLazyAttribute();
    lookupHere_visited = false;
    return lookupHere_value;
  }
}
