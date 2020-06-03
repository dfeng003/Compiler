/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\lang.ast:50
 * @astdecl Type : ASTNode;
 * @production Type : {@link ASTNode};

 */
public abstract class Type extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Type() {
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
    isIntType_reset();
    isUnknownType_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:24
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public Type clone() throws CloneNotSupportedException {
    Type node = (Type) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:39
   */
  @Deprecated
  public abstract Type fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:47
   */
  public abstract Type treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:55
   */
  public abstract Type treeCopy();
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
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\BoolType.jrag:7
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
    isBoolType_value = false;
    isBoolType_computed = true;
    state().leaveLazyAttribute();
    isBoolType_visited = false;
    return isBoolType_value;
  }
/** @apilevel internal */
protected boolean isIntType_visited = false;
  /** @apilevel internal */
  private void isIntType_reset() {
    isIntType_computed = false;
    isIntType_visited = false;
  }
  /** @apilevel internal */
  protected boolean isIntType_computed = false;

  /** @apilevel internal */
  protected boolean isIntType_value;

  /**
   * @attribute syn
   * @aspect IntType
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\IntType.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="IntType", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\IntType.jrag:7")
  public boolean isIntType() {
    ASTState state = state();
    if (isIntType_computed) {
      return isIntType_value;
    }
    if (isIntType_visited) {
      throw new RuntimeException("Circular definition of attribute Type.isIntType().");
    }
    isIntType_visited = true;
    state().enterLazyAttribute();
    isIntType_value = false;
    isIntType_computed = true;
    state().leaveLazyAttribute();
    isIntType_visited = false;
    return isIntType_value;
  }
/** @apilevel internal */
protected boolean isUnknownType_visited = false;
  /** @apilevel internal */
  private void isUnknownType_reset() {
    isUnknownType_computed = false;
    isUnknownType_visited = false;
  }
  /** @apilevel internal */
  protected boolean isUnknownType_computed = false;

  /** @apilevel internal */
  protected boolean isUnknownType_value;

  /**
   * @attribute syn
   * @aspect UnknownType
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownType.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="UnknownType", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownType.jrag:7")
  public boolean isUnknownType() {
    ASTState state = state();
    if (isUnknownType_computed) {
      return isUnknownType_value;
    }
    if (isUnknownType_visited) {
      throw new RuntimeException("Circular definition of attribute Type.isUnknownType().");
    }
    isUnknownType_visited = true;
    state().enterLazyAttribute();
    isUnknownType_value = false;
    isUnknownType_computed = true;
    state().leaveLazyAttribute();
    isUnknownType_visited = false;
    return isUnknownType_value;
  }
}
