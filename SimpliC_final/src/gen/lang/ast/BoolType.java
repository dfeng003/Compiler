/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\lang.ast:52
 * @astdecl BoolType : Type;
 * @production BoolType : {@link Type};

 */
public class BoolType extends Type implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public BoolType() {
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
    isBoolType_reset();
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
  public BoolType clone() throws CloneNotSupportedException {
    BoolType node = (BoolType) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public BoolType copy() {
    try {
      BoolType node = (BoolType) clone();
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
   * @declaredat ASTNode:50
   */
  @Deprecated
  public BoolType fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:60
   */
  public BoolType treeCopyNoTransform() {
    BoolType tree = (BoolType) copy();
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
   * @declaredat ASTNode:80
   */
  public BoolType treeCopy() {
    BoolType tree = (BoolType) copy();
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
   * @declaredat ASTNode:94
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
/** @apilevel internal */
protected boolean isBoolType_visited = false;
  /** @apilevel internal */
  private void isBoolType_reset() {
    isBoolType_computed = false;
    isBoolType_visited = false;
  }
  /** @apilevel internal */
  protected boolean isBoolType_computed = false;

  /** @apilevel internal */
  protected boolean isBoolType_value;

  /**
   * @attribute syn
   * @aspect BoolType
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\BoolType.jrag:8
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="BoolType", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\BoolType.jrag:7")
  public boolean isBoolType() {
    ASTState state = state();
    if (isBoolType_computed) {
      return isBoolType_value;
    }
    if (isBoolType_visited) {
      throw new RuntimeException("Circular definition of attribute Type.isBoolType().");
    }
    isBoolType_visited = true;
    state().enterLazyAttribute();
    isBoolType_value = true;
    isBoolType_computed = true;
    state().leaveLazyAttribute();
    isBoolType_visited = false;
    return isBoolType_value;
  }
}
