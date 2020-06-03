/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\calc.ast:11
 * @astdecl Let : Expr ::= Binding* Expr;
 * @production Let : {@link Expr} ::= <span class="component">{@link Binding}*</span> <span class="component">{@link Expr}</span>;

 */
public class Let extends Expr implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\PrettyPrint.jrag:39
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.println("let");
		for (Binding b : getBindings()){
		  out.print(ind+"  ");
			b.prettyPrint(out, ind+"  ");
			out.println();
		}
		out.println(ind + "in");
		out.print(ind+"  ");
		getExpr().prettyPrint(out, ind+"  ");
		out.println();
		out.print(ind + "end");
	}
  /**
   * @declaredat ASTNode:1
   */
  public Let() {
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
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Binding", "Expr"},
    type = {"List<Binding>", "Expr"},
    kind = {"List", "Child"}
  )
  public Let(List<Binding> p0, Expr p1) {
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
    localLookup_String_int_reset();
    lookup_String_reset();
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
  public Let clone() throws CloneNotSupportedException {
    Let node = (Let) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public Let copy() {
    try {
      Let node = (Let) clone();
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
  public Let fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public Let treeCopyNoTransform() {
    Let tree = (Let) copy();
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
  public Let treeCopy() {
    Let tree = (Let) copy();
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
   * Replaces the Binding list.
   * @param list The new list node to be used as the Binding list.
   * @apilevel high-level
   */
  public void setBindingList(List<Binding> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Binding list.
   * @return Number of children in the Binding list.
   * @apilevel high-level
   */
  public int getNumBinding() {
    return getBindingList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Binding list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Binding list.
   * @apilevel low-level
   */
  public int getNumBindingNoTransform() {
    return getBindingListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Binding list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Binding list.
   * @apilevel high-level
   */
  public Binding getBinding(int i) {
    return (Binding) getBindingList().getChild(i);
  }
  /**
   * Check whether the Binding list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasBinding() {
    return getBindingList().getNumChild() != 0;
  }
  /**
   * Append an element to the Binding list.
   * @param node The element to append to the Binding list.
   * @apilevel high-level
   */
  public void addBinding(Binding node) {
    List<Binding> list = (parent == null) ? getBindingListNoTransform() : getBindingList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addBindingNoTransform(Binding node) {
    List<Binding> list = getBindingListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Binding list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setBinding(Binding node, int i) {
    List<Binding> list = getBindingList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Binding list.
   * @return The node representing the Binding list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Binding")
  public List<Binding> getBindingList() {
    List<Binding> list = (List<Binding>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Binding list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Binding list.
   * @apilevel low-level
   */
  public List<Binding> getBindingListNoTransform() {
    return (List<Binding>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Binding list without
   * triggering rewrites.
   */
  public Binding getBindingNoTransform(int i) {
    return (Binding) getBindingListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Binding list.
   * @return The node representing the Binding list.
   * @apilevel high-level
   */
  public List<Binding> getBindings() {
    return getBindingList();
  }
  /**
   * Retrieves the Binding list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Binding list.
   * @apilevel low-level
   */
  public List<Binding> getBindingsNoTransform() {
    return getBindingListNoTransform();
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expr")
  public Expr getExpr() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
/** @apilevel internal */
protected java.util.Set localLookup_String_int_visited;
  /** @apilevel internal */
  private void localLookup_String_int_reset() {
    localLookup_String_int_values = null;
    localLookup_String_int_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map localLookup_String_int_values;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\NameAnalysis.jrag:18
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\NameAnalysis.jrag:18")
  public IdDecl localLookup(String name, int until) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(name);
    _parameters.add(until);
    if (localLookup_String_int_visited == null) localLookup_String_int_visited = new java.util.HashSet(4);
    if (localLookup_String_int_values == null) localLookup_String_int_values = new java.util.HashMap(4);
    ASTState state = state();
    if (localLookup_String_int_values.containsKey(_parameters)) {
      return (IdDecl) localLookup_String_int_values.get(_parameters);
    }
    if (localLookup_String_int_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Let.localLookup(String,int).");
    }
    localLookup_String_int_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl localLookup_String_int_value = localLookup_compute(name, until);
    localLookup_String_int_values.put(_parameters, localLookup_String_int_value);
    state().leaveLazyAttribute();
    localLookup_String_int_visited.remove(_parameters);
    return localLookup_String_int_value;
  }
  /** @apilevel internal */
  private IdDecl localLookup_compute(String name, int until) {
  		for (int i = 0; i <= until; i++) {
  			if (getBinding(i).getIdDecl().getID().equals(name)) {
  				return getBinding(i).getIdDecl();
  			}
  		}
  		return unknownDecl();
  	}
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\NameAnalysis.jrag:16
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\NameAnalysis.jrag:16")
  public IdDecl lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_values == null) lookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookup_String_values.containsKey(_parameters)) {
      return (IdDecl) lookup_String_values.get(_parameters);
    }
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Let.lookup(String).");
    }
    lookup_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl lookup_String_value = getParent().Define_lookup(this, null, name);
    lookup_String_values.put(_parameters, lookup_String_value);
    state().leaveLazyAttribute();
    lookup_String_visited.remove(_parameters);
    return lookup_String_value;
  }
/** @apilevel internal */
protected java.util.Set lookup_String_visited;
  /** @apilevel internal */
  private void lookup_String_reset() {
    lookup_String_values = null;
    lookup_String_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map lookup_String_values;

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\NameAnalysis.jrag:16
   * @apilevel internal
   */
  public IdDecl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getBindingListNoTransform()) {
      // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\NameAnalysis.jrag:9
      int index = _callerNode.getIndexOfChild(_childNode);
      {
      		IdDecl decl = localLookup(name, index);
      		return !decl.isUnknown() ? decl : lookup(name);
      		//if unkown, note calls its own lookup. isUnkown is declared in another aspect
      	}
    }
    else if (_callerNode == getExprNoTransform()) {
      // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\NameAnalysis.jrag:5
      {
      		IdDecl decl = localLookup(name, getNumBinding()-1);
      		return !decl.isUnknown() ? decl : lookup(name);
      	}
    }
    else {
      return getParent().Define_lookup(this, _callerNode, name);
    }
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\A4-CalcRAG\\src\\jastadd\\NameAnalysis.jrag:16
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookup
   */
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
}
