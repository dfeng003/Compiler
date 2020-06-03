/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\lang.ast:48
 * @astdecl Func_call : Expr ::= IdCall Expr*;
 * @production Func_call : {@link Expr} ::= <span class="component">{@link IdCall}</span> <span class="component">{@link Expr}*</span>;

 */
public class Func_call extends Expr implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\PrettyPrint.jrag:182
   */
  public void prettyPrint(PrintStream out, String ind) {
		getIdCall().prettyPrint(out, ind);
		out.print("(");
		int count = 0;
		if(getExprs()!=null){
			for (Expr b : getExprs()) {
		  		if(count == 0){
		  			count = count+1;
		  		}else{
		  			out.print(", ");
		  		}
		  		b.prettyPrint(out, ind);
			}
		}
		out.print(")");
	}
  /**
   * @declaredat ASTNode:1
   */
  public Func_call() {
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
    children = new ASTNode[2];
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"IdCall", "Expr"},
    type = {"IdCall", "List<Expr>"},
    kind = {"Child", "List"}
  )
  public Func_call(IdCall p0, List<Expr> p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 2;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    type_reset();
    isInt_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public Func_call clone() throws CloneNotSupportedException {
    Func_call node = (Func_call) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public Func_call copy() {
    try {
      Func_call node = (Func_call) clone();
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
   * @declaredat ASTNode:62
   */
  @Deprecated
  public Func_call fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public Func_call treeCopyNoTransform() {
    Func_call tree = (Func_call) copy();
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
   * @declaredat ASTNode:92
   */
  public Func_call treeCopy() {
    Func_call tree = (Func_call) copy();
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
   * @declaredat ASTNode:106
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the IdCall child.
   * @param node The new node to replace the IdCall child.
   * @apilevel high-level
   */
  public void setIdCall(IdCall node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the IdCall child.
   * @return The current node used as the IdCall child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdCall")
  public IdCall getIdCall() {
    return (IdCall) getChild(0);
  }
  /**
   * Retrieves the IdCall child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdCall child.
   * @apilevel low-level
   */
  public IdCall getIdCallNoTransform() {
    return (IdCall) getChildNoTransform(0);
  }
  /**
   * Replaces the Expr list.
   * @param list The new list node to be used as the Expr list.
   * @apilevel high-level
   */
  public void setExprList(List<Expr> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Expr list.
   * @return Number of children in the Expr list.
   * @apilevel high-level
   */
  public int getNumExpr() {
    return getExprList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Expr list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Expr list.
   * @apilevel low-level
   */
  public int getNumExprNoTransform() {
    return getExprListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Expr list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Expr list.
   * @apilevel high-level
   */
  public Expr getExpr(int i) {
    return (Expr) getExprList().getChild(i);
  }
  /**
   * Check whether the Expr list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasExpr() {
    return getExprList().getNumChild() != 0;
  }
  /**
   * Append an element to the Expr list.
   * @param node The element to append to the Expr list.
   * @apilevel high-level
   */
  public void addExpr(Expr node) {
    List<Expr> list = (parent == null) ? getExprListNoTransform() : getExprList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addExprNoTransform(Expr node) {
    List<Expr> list = getExprListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Expr list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setExpr(Expr node, int i) {
    List<Expr> list = getExprList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Expr list.
   * @return The node representing the Expr list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Expr")
  public List<Expr> getExprList() {
    List<Expr> list = (List<Expr>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Expr list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Expr list.
   * @apilevel low-level
   */
  public List<Expr> getExprListNoTransform() {
    return (List<Expr>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Expr list without
   * triggering rewrites.
   */
  public Expr getExprNoTransform(int i) {
    return (Expr) getExprListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Expr list.
   * @return The node representing the Expr list.
   * @apilevel high-level
   */
  public List<Expr> getExprs() {
    return getExprList();
  }
  /**
   * Retrieves the Expr list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Expr list.
   * @apilevel low-level
   */
  public List<Expr> getExprsNoTransform() {
    return getExprListNoTransform();
  }
/** @apilevel internal */
protected boolean type_visited = false;
  /** @apilevel internal */
  private void type_reset() {
    type_computed = false;
    
    type_value = null;
    type_visited = false;
  }
  /** @apilevel internal */
  protected boolean type_computed = false;

  /** @apilevel internal */
  protected Type type_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:32
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:3")
  public Type type() {
    ASTState state = state();
    if (type_computed) {
      return type_value;
    }
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute Expr.type().");
    }
    type_visited = true;
    state().enterLazyAttribute();
    type_value = getIdCall().type();
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
/** @apilevel internal */
protected boolean isInt_visited = false;
  /** @apilevel internal */
  private void isInt_reset() {
    isInt_computed = false;
    isInt_visited = false;
  }
  /** @apilevel internal */
  protected boolean isInt_computed = false;

  /** @apilevel internal */
  protected boolean isInt_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:131
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:131")
  public boolean isInt() {
    ASTState state = state();
    if (isInt_computed) {
      return isInt_value;
    }
    if (isInt_visited) {
      throw new RuntimeException("Circular definition of attribute Func_call.isInt().");
    }
    isInt_visited = true;
    state().enterLazyAttribute();
    isInt_value = isInt_compute();
    isInt_computed = true;
    state().leaveLazyAttribute();
    isInt_visited = false;
    return isInt_value;
  }
  /** @apilevel internal */
  private boolean isInt_compute() {
  	 	for(Expr e : getExprs()){
  	 		if(!e.type().isIntType())
  	 			return false;
  	 	}
  	 	return true;
  	 }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:34
   * @apilevel internal
   */
  public int Define_callParaNum(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdCallNoTransform()) {
      // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:26
      {
      		return getNumExpr();
      	}
    }
    else {
      return getParent().Define_callParaNum(this, _callerNode);
    }
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:34
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute callParaNum
   */
  protected boolean canDefine_callParaNum(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\Errors.jrag:133
    if (!isInt()) {
      {
        Program target = (Program) (program());
        java.util.Set<ASTNode> contributors = _map.get(target);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) target, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_Program_errors(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_errors(collection);
    if (!isInt()) {
      collection.add(error("pass boolean to function"));
    }
  }
}
